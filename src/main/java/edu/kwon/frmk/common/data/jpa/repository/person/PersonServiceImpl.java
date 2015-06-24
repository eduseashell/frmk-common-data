package edu.kwon.frmk.common.data.jpa.repository.person;

import edu.kwon.frmk.common.data.jpa.repository.entities.entity.EntityServiceImpl;

/**
 * 
 * @author Bunlong Taing
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since
 * @version
 */
public abstract class PersonServiceImpl<T extends Person> extends EntityServiceImpl<T> implements PersonService<T> {

}
