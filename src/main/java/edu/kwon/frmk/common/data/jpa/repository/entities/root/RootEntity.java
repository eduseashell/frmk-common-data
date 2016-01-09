package edu.kwon.frmk.common.data.jpa.repository.entities.root;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * This is the root of the entity, so all the
 * entity class should at least extends this class.
 * 
 * @author eduseashell
 * @since 0.0.1
 * @version 0.0.1
 */
@MappedSuperclass
public abstract class RootEntity implements Serializable {

	private static final long serialVersionUID = -5068682950591194650L;
	
	protected Long id;
	protected Boolean active;
	protected Boolean delete;

	/**
	 * @return the id
	 */
	public abstract Long getId();

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return the active
	 */
	@Column(name = "active")
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * @return the delete
	 */
	@Column(name = "delete")
	public Boolean getDelete() {
		return delete;
	}

	/**
	 * @param delete the delete to set
	 */
	public void setDelete(Boolean delete) {
		this.delete = delete;
	}

}
