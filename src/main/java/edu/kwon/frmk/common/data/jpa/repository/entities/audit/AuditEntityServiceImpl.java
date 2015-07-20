package edu.kwon.frmk.common.data.jpa.repository.entities.audit;

import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityServiceImpl;

/**
 * Audit Entity Service Implementation
 * @author Bunlong Taing
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public abstract class AuditEntityServiceImpl<T extends AuditEntity> extends RootEntityServiceImpl<T> implements AuditEntityService<T> {

}
