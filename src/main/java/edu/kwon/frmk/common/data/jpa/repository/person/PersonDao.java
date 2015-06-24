package edu.kwon.frmk.common.data.jpa.repository.person;

import org.springframework.data.repository.NoRepositoryBean;

import edu.kwon.frmk.common.data.jpa.repository.entities.entity.EntityDao;

/**
 * Person Dao
 * @author Bunlong Taing
 *
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@NoRepositoryBean
public interface PersonDao<T extends Person> extends EntityDao<T> {

}
