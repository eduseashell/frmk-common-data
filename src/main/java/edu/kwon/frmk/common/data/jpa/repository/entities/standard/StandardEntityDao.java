package edu.kwon.frmk.common.data.jpa.repository.entities.standard;

import org.springframework.data.repository.NoRepositoryBean;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntityDao;

/**
 * Standard Entity Dao
 * @author Bunlong Taing
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@NoRepositoryBean
public interface StandardEntityDao<T extends StandardEntity> extends BaseEntityDao<T> {

}
