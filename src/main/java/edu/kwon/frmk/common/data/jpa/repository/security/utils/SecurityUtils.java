package edu.kwon.frmk.common.data.jpa.repository.security.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import edu.kwon.frmk.common.data.jpa.repository.user.User;

/**
 * @author eduseashell
 */
public class SecurityUtils {
	
	/**
	 * Get the current log in user name
	 * @return null if no current log in user
	 */
	public static String getCurrentLogInUserName() {
		User user = getCurrentLogInUser();
		return user == null ? null : user.getUserName();
	}
	
	/**
	 * Get the current log in user
	 * @return null if no current log in user
	 */
	public static User getCurrentLogInUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth == null) return null;
		if (auth.getPrincipal() instanceof User) return (User) auth.getPrincipal();
		return null;
	}

}
