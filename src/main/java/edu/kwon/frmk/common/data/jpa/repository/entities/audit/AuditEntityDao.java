package edu.kwon.frmk.common.data.jpa.repository.entities.audit;

import org.springframework.data.repository.NoRepositoryBean;

import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityDao;

/**
 * Audit Entity Dao
 * @author Bunlong Taing
 *
 * @param <T>
 * @since 0.0.1
 * @version 0.0.1
 */
@NoRepositoryBean
public interface AuditEntityDao<T extends AuditEntity> extends RootEntityDao<T> {

}
