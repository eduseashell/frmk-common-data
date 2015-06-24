package edu.kwon.frmk.common.data.jpa.repository.entities.standard;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntity;

/**
 * Standard Entity
 * @author Bunlong Taing
 *
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@MappedSuperclass
public abstract class StandardEntity extends BaseEntity {

	private static final long serialVersionUID = -4090592233394515145L;
	
	protected Boolean active;
	protected Boolean recycleBin;

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
	 * @return the recycleBin
	 */
	@Column(name = "recycle_bin")
	public Boolean getRecycleBin() {
		return recycleBin;
	}

	/**
	 * @param recycleBin the recycleBin to set
	 */
	public void setRecycleBin(Boolean recycleBin) {
		this.recycleBin = recycleBin;
	}

}
