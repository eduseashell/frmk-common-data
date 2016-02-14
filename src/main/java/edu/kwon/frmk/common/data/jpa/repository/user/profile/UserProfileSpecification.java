package edu.kwon.frmk.common.data.jpa.repository.user.profile;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditSpecification;
import edu.kwon.frmk.common.data.jpa.repository.user.User;

/**
 * @author eduseashell
 */
public class UserProfileSpecification extends AuditSpecification<UserProfile> {
	
	private Long userId;
	
	@Override
	protected void buildPredicate(Root<UserProfile> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		super.buildPredicate(root, query, cb);
		if (userId != null) {
			Expression<User> exUserId = root.get(UserProfile.USER).get(User.ID);
			getPredicate().add(cb.equal(exUserId, userId));
		}
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
