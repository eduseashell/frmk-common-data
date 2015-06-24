package edu.kwon.frmk.common.data.jpa.repository.entities.entity;

import edu.kwon.frmk.common.data.jpa.repository.entities.standard.StandardEntityServiceImpl;

/**
 * Entity Service Implementation
 * @author Bunlong Taing
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public abstract class EntityServiceImpl<T extends Entity> extends StandardEntityServiceImpl<T> implements EntityService<T> {

}
