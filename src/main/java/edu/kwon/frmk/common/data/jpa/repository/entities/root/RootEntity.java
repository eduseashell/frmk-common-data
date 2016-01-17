package edu.kwon.frmk.common.data.jpa.repository.entities.root;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Transient;

/**
 * This is the root of the entity, so all the
 * entity class should at least extends this class.
 * 
 * @author eduseashell
 * @since 0.0.1
 * @version 0.0.1
 */
@MappedSuperclass
public abstract class RootEntity implements RootEntityField, Serializable {

	private static final long serialVersionUID = -5068682950591194650L;
	
	protected Long id;
	protected Boolean active;
	protected Boolean blDelete;

	/**
	 * @return the id
	 */
	@Transient
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
	@Column(name = "re_active", nullable = false)
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
	 * @return the blDelete
	 */
	@Column(name = "re_delete", nullable = false)
	public Boolean getBlDelete() {
		return blDelete;
	}

	/**
	 * @param blDelete the delete to set
	 */
	public void setBlDelete(Boolean delete) {
		this.blDelete = delete;
	}
	
	@PrePersist
	public void prePersist() {
		setActive(true);
		setBlDelete(false);
	}
	
//	@PreUpdate
//	public void preUpdate() {}

}
