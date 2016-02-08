package edu.kwon.frmk.common.data.jpa.repository.user;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.person.PersonServiceImpl;

/**
 * User Service Implementation
 * @author eduseashell
 *
 * @since Jun 22, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
//@Transactional	// @Service is Transactional by default:check
public class UserServiceImpl extends PersonServiceImpl<User> implements UserService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserDao dao;
	@Autowired
	private PasswordEncoder pwdEncoder;

	@Override
	public UserDao getDao() {
		return this.dao;
	}
	
	@Override
	public User save(User user) {
		
		// TODO set configuration in user form, so remove here
		user.setDefaultPwd(true);
		user.setNeedPwdChange(true);
		user.setLocked(false);
		user.setMaxAttemptLogInAllow(5);
		user.setMaxTimePwdChange(15768000000l);		// half year millisecond
		
		CharSequence pwdRaw = user.getPassword();
		user.setPassword(pwdEncoder.encode(pwdRaw));
		return super.save(user);
	}
	
	@Override
	public User update(User rootEntity) {
		return super.save(rootEntity);
	}

	@Override
	public User getByUserName(String userName) {
		return dao.findByUserNameAndBlDelete(userName, false);
	}

	@Override
	public void increaseNbFailedLogInAttempt(String username) {
		User user = getByUserName(username);
		if (user == null) return;
		
		Integer nbFailedLogInAttempt = user.getNbFailedLogInAttempt();
		if (nbFailedLogInAttempt == null) nbFailedLogInAttempt = 0;
		nbFailedLogInAttempt++;
		user.setNbFailedLogInAttempt(nbFailedLogInAttempt);
		update(user);
	}

	@Override
	public User changePassword(User user, String oldPassword, String newPassword) {
		User pwdChangedUser = getByUserName(user.getUserName());
		if (pwdChangedUser == null) {
			String msg = "Change password failed, unauthorized";
			throw new BadCredentialsException(msg);
		}
		if (pwdEncoder.matches(oldPassword, pwdChangedUser.getPassword())) {
			pwdChangedUser.setPassword(pwdEncoder.encode(newPassword));
			pwdChangedUser.setLastPwdModifiedDate(Calendar.getInstance().getTime());
			update(pwdChangedUser);
		} else {
			String msg = "Change password failed, unauthorized";
			throw new BadCredentialsException(msg);
		}
		return pwdChangedUser;
	}

	@Override
	public void afterLogIn(String userName) {
		logger.debug("User login: " + userName);

		User user = getByUserName(userName);
		if (user == null) {
			String msg = "The user " + userName + " not found.";
			throw new UsernameNotFoundException(msg);
		}
		user.setNbFailedLogInAttempt(0);
		user.setLastLogInDate(Calendar.getInstance().getTime());
		update(user);
	}

	@Override
	public void afterLogOut(String userName) {
		logger.debug("User logout: " + userName);
		
		User user = getByUserName(userName);
		if (user == null) {
			String msg = "The user " + userName + " not found.";
			throw new UsernameNotFoundException(msg);
		}
		user.setLastLogOutDate(Calendar.getInstance().getTime());
		update(user);
	}

}
