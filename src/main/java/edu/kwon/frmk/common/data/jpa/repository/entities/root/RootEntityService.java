package edu.kwon.frmk.common.data.jpa.repository.entities.root;

import java.util.List;


/**
 * Root Entity Service
 * @author eduseashell
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public interface RootEntityService<T extends RootEntity> {
	
	/**
	 * Save the Entity
	 * @param rootEntity
	 */
	T save(T rootEntity);
	
	/**
	 * Update the Entity
	 * @param rootEntity
	 */
	T update(T rootEntity);
	
	/**
	 * Delete the Entity
	 * @param rootEntity
	 */
	void delete(T rootEntity);
	
	/**
	 * Delete entity by id
	 * @param id
	 */
	void delete(Long id);
	
	/**
	 * Restore the deleted entity
	 * @param rootEntity
	 */
	T restoreDelete(T rootEntity);
	
	/**
	 * Restore the deleted entity by id
	 * @param id
	 * @return
	 */
	T restoreDelete(Long id);
	
	/**
	 * RecycleBin Entity
	 * @param rootEntitys
	 */
	void deletePermanently(T rootEntity);
	
	/**
	 * 
	 * @param rootEntity
	 * @return
	 */
	T activate(T rootEntity);
	
	/**
	 * 
	 * @param rootEntity
	 * @return
	 */
	T deactivate(T rootEntity);
	
	/**
	 * Find the entity by id
	 * @param id
	 */
	T findById(Long id);
	
	/**
	 * @param specification
	 * @return
	 */
	List<T> findAll(RootSpecification<T> specification);

}
