package edu.kwon.frmk.common.data.jpa.repository.entities.standard;

import javax.persistence.Transient;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntityService;

/**
 * Standard Entity Service
 * @author Bunlong Taing
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public interface StandardEntityService<T extends StandardEntity> extends AuditEntityService<T> {
	
	/**
	 * Save the StandarEntity or it descend
	 */
	public void save(T standardEntity);
	
	/**
	 * RecycleBin the StandarEntity or it descend
	 * @param standardEntity
	 */
	public void recycleBin(T standardEntity);
	
	/**
	 * 
	 * @param standardEntity
	 * @return
	 */
	@Transient
	public T activate(T standardEntity);
	
	/**
	 * 
	 * @param standardEntity
	 * @return
	 */
	@Transient
	public T deactivate(T standardEntity);

}
