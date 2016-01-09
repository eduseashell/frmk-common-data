package edu.kwon.frmk.common.data.jpa.repository.entities.root;


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
	public T save(T rootEntity);
	
	/**
	 * Update the Entity
	 * @param rootEntity
	 */
	public T update(T rootEntity);
	
	/**
	 * Delete the Entity
	 * @param rootEntity
	 */
	public void delete(T rootEntity);
	
	/**
	 * Restore the deleted entity
	 * @param rootEntity
	 */
	public T restoreDelete(T rootEntity);
	
	/**
	 * RecycleBin Entity
	 * @param rootEntitys
	 */
	public void deletePermanently(T rootEntity);
	
	/**
	 * 
	 * @param rootEntity
	 * @return
	 */
	public T activate(T rootEntity);
	
	/**
	 * 
	 * @param rootEntity
	 * @return
	 */
	public T deactivate(T rootEntity);
	
	/**
	 * Find the entity by id
	 * @param id
	 */
	public T findById(Long id);

}
