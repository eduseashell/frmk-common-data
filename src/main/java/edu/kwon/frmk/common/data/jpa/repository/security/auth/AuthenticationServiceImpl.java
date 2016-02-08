package edu.kwon.frmk.common.data.jpa.repository.security.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.security.utils.SecurityUtils;
import edu.kwon.frmk.common.data.jpa.repository.user.User;
import edu.kwon.frmk.common.data.jpa.repository.user.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;
	@Autowired
	private ApplicationContext appContext;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getByUserName(username);
		// TODO check login attempt
		if (user == null) {
			String msg = "The user " + username + " cannot be found";
			throw new UsernameNotFoundException(msg);
		}
		return user;
	}

	@Override
	public boolean isAuthenticated() {
		if (SecurityContextHolder.getContext().getAuthentication() == null) return false;
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		// TODO check user status
		return principal != null && principal instanceof UserDetails;
	}

	@Override
	public void authenticate(String username, String password) {
		logger.debug("START: authenticate: " + username);
		
		AuthenticationManager authManager = appContext.getBean(AuthenticationManager.class);
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
		
		try {
			logger.debug("SUCCESS: authenticate: " + username);
			Authentication auth = authManager.authenticate(token);
			SecurityContextHolder.getContext().setAuthentication(auth);
			userService.afterLogIn(SecurityUtils.getCurrentLogInUserName());
		} catch (BadCredentialsException | UsernameNotFoundException e) {
			logger.debug("FAILED: authenticate: " + username);
			userService.increaseNbFailedLogInAttempt(username);
			throw e;
		}
	}

	@Override
	public void logOut() {
		logger.debug("Logging out");
		userService.afterLogOut(SecurityUtils.getCurrentLogInUserName());
		SecurityContextHolder.clearContext();
	}
	
}
