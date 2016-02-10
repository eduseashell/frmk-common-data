package edu.kwon.frmk.common.data.jpa.repository.user.profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntity;
import edu.kwon.frmk.common.data.jpa.repository.profile.Profile;
import edu.kwon.frmk.common.data.jpa.repository.user.User;

/**
 * @author eduseashell
 */
@Entity
@Table(name = "at_user_profile")
public class UserProfile extends AuditEntity implements UserProfileField {

	private static final long serialVersionUID = 3107239230218146309L;
	
	private User user;
	private Profile profile;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_profile_id", nullable = false)
	@Override
	public Long getId() {
		return id;
	}

	@ManyToOne
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "profile_id")
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
