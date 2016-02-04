package edu.kwon.frmk.common.data.jpa.repository.security.auth;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface AuthenticationService extends UserDetailsService {
	
	boolean isAuthenticated();
	
	void authenticate(String username, String password);

}
