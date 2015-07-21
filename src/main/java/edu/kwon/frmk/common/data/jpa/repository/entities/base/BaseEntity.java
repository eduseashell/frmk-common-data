package edu.kwon.frmk.common.data.jpa.repository.entities.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import edu.kwon.frmk.common.data.jpa.repository.entities.standard.StandardEntity;

/**
 * Base Entity provides description and code
 * 
 * @author Bunlong Taing
 *
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@MappedSuperclass
public abstract class BaseEntity extends StandardEntity {

	private static final long serialVersionUID = 8903029047937288680L;

	protected String code;
	protected String desc;
	
	/**
	 * @return the code
	 */
	@Column(name = "code", unique = true)
	public String getCode() {
		return code;
	}
	
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * @return the desc
	 */
	@Column(name = "description")
	public String getDesc() {
		return desc;
	}
	
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
