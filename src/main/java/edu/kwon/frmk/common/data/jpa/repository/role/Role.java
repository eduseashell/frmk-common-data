package edu.kwon.frmk.common.data.jpa.repository.role;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.kwon.frmk.common.data.jpa.repository.entities.entity.Entity;

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
@javax.persistence.Entity
@Table(name = "dt_role")
public class Role extends Entity {

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
