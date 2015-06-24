package edu.kwon.frmk.common.data.jpa.repository.entities.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntity;

/**
 * Base Entity
 * @author Bunlong Taing
 *
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@MappedSuperclass
public abstract class BaseEntity extends RootEntity {

	private static final long serialVersionUID = -4663789121672082639L;

	@CreatedDate
	protected Date createdDate;
	
	@LastModifiedDate
	protected Date modifiedDate;

	/**
	 * @return the createdDate
	 */
	@Column(name = "created_date", nullable = false, updatable = false)
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	@Column(name = "modified_date", nullable = false)
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
