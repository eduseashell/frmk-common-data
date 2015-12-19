package edu.kwon.frmk.common.data.jpa.repository.entities.base;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntityService;

/**
 * BaseEntity Service
 * @author eduseashell
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public interface BaseEntityService<T extends BaseEntity> extends AuditEntityService<T> {

}
