package edu.kwon.frmk.common.data.jpa.audit;

import org.springframework.data.domain.AuditorAware;

import edu.kwon.frmk.common.data.jpa.repository.user.User;

/**
 * Audit all entity save to the database
 * @author eduseashell
 *
 * @since Jul 18, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public class AuditableUserAware implements AuditorAware<User> {

	@Override
	public User getCurrentAuditor() {
		User user = new User();
		user.setId(1l);
		return user;
	}

}
