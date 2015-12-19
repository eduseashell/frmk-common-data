package edu.kwon.frmk.common.data.jpa.repository.entities.base;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntityServiceImpl;

/**
 * Base Entity Service Implementation
 * @author eduseashell
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public abstract class BaseEntityServiceImpl<T extends BaseEntity> extends AuditEntityServiceImpl<T> implements BaseEntityService<T> {

}
