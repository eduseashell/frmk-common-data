package edu.kwon.frmk.common.data.jpa.repository.profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntity;

/**
 * The profile of User
 * @author eduseashell
 * @since Feb 08, 2016
 * @since 0.0.1
 * @version 0.0.1
 */
@Entity
@Table(name = "at_profile")
public class Profile extends BaseEntity {

	private static final long serialVersionUID = -7451796372520717300L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profile_id", nullable = false)
	@Override
	public Long getId() {
		return id;
	}

}
