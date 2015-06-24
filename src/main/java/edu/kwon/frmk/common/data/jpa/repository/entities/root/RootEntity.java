package edu.kwon.frmk.common.data.jpa.repository.entities.root;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * This is the root of the entity, so all the
 * entity class should at least extends this class.
 * 
 * @author Bunlong Taing
 * @since 0.0.1
 * @version 0.0.1
 */
@MappedSuperclass
public abstract class RootEntity implements Serializable {

	private static final long serialVersionUID = -5068682950591194650L;
	
	protected Long id;

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

}
