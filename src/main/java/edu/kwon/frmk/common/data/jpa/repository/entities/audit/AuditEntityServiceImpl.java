package edu.kwon.frmk.common.data.jpa.repository.entities.audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityServiceImpl;

/**
 * Audit Entity Service Implementation
 * @author eduseashell
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
public class AuditEntityServiceImpl<T extends AuditEntity> extends RootEntityServiceImpl<T> implements AuditEntityService<T> {

	@Autowired
	private AuditEntityDao<T> dao;
	
	@Override
	public AuditEntityDao<T> getDao() {
		return dao;
	}
}
