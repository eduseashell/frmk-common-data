package edu.kwon.frmk.common.data.jpa.repository.entities.base;

import org.springframework.data.repository.NoRepositoryBean;

import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityDao;

/**
 * Base Entity Dao
 * @author Bunlong Taing
 *
 * @param <T>
 * @since 0.0.1
 * @version 0.0.1
 */
@NoRepositoryBean
public interface BaseEntityDao<T extends BaseEntity> extends RootEntityDao<T> {

}
