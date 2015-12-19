package edu.kwon.frmk.common.data.jpa.repository.entities.base;

import org.springframework.data.repository.NoRepositoryBean;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntityDao;

/**
 * BaseEntityDao
 * 
 * @author eduseashell
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@NoRepositoryBean
public interface BaseEntityDao<T extends BaseEntity> extends AuditEntityDao<T> {

}
