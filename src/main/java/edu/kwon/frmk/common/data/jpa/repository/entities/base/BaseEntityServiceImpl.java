package edu.kwon.frmk.common.data.jpa.repository.entities.base;

import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityServiceImpl;

/**
 * Base Entity Service Implementation
 * @author Bunlong Taing
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public abstract class BaseEntityServiceImpl<T extends BaseEntity> extends RootEntityServiceImpl<T> implements BaseEntityService<T> {

}
