package edu.kwon.frmk.common.data.jpa.repository.roles.role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntity;

/**
 * The role of the user in the application
 * - to determine who or what role the user is
 * - to provide the which menu the user can use...
 * @author Bunlong Taing
 *
 * @since Jul 20, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Entity
@Table(name = "at_role")	// at = Admin table
public class Role extends BaseEntity {

	private static final long serialVersionUID = -7451796372520717300L;
	
//	private List<Menu> menus;

	/**
	 * Role id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id", nullable = false)
	@Override
	public Long getId() {
		return this.id;
	}

}
