package edu.kwon.frmk.common.data.jpa.repository.entities.entity;

import org.springframework.data.repository.NoRepositoryBean;

import edu.kwon.frmk.common.data.jpa.repository.entities.standard.StandardEntityDao;

/**
 * EntityDao
 * 
 * @author Bunlong Taing
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@NoRepositoryBean
public interface EntityDao<T extends Entity> extends StandardEntityDao<T> {

}
