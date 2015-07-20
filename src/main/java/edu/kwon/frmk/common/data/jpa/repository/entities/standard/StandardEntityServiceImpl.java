package edu.kwon.frmk.common.data.jpa.repository.entities.standard;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntityServiceImpl;

/**
 * Standard Entity Service Implementation
 * @author Bunlong Taing
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since
 * @version
 */
public abstract class StandardEntityServiceImpl<T extends StandardEntity> extends AuditEntityServiceImpl<T> implements StandardEntityService<T> {

	/**
	 * @see edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityServiceImpl#save(edu.kwon.frmk.common.data.jpa.entities.root.RootEntity)
	 */
	@Override
	public void save(T standardEntity) {
		super.save(activate(standardEntity));
	}
	
	public void recycleBin(T standardEntity) {
		standardEntity.setRecycleBin(Boolean.TRUE);
		super.save(standardEntity);
	}

	public T activate(T standardEntity) {
		standardEntity.setActive(Boolean.TRUE);
		return standardEntity;
	}

	public T deactivate(T standardEntity) {
		standardEntity.setActive(Boolean.FALSE);
		return standardEntity;
	}

}
