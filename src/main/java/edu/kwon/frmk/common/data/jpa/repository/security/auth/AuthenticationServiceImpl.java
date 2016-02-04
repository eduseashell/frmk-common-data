package edu.kwon.frmk.common.data.jpa.repository.security.auth;

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

import edu.kwon.frmk.common.data.jpa.repository.user.User;
import edu.kwon.frmk.common.data.jpa.repository.user.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
	
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
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		// TODO check user status
		return principal != null && principal instanceof UserDetails;
	}

	@Override
	public void authenticate(String username, String password) {
		AuthenticationManager authManager = appContext.getBean(AuthenticationManager.class);
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
		
		try {
			Authentication auth = authManager.authenticate(token);
			SecurityContextHolder.getContext().setAuthentication(auth);
			userService.clearNbFailedLogInAttempt((User) auth.getPrincipal());
		} catch (BadCredentialsException | UsernameNotFoundException e) {
			userService.increaseNbFailedLogInAttempt(username);
			throw e;
		}
	}

}
