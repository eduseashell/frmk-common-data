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
	public void save(T rootEntity);
	
	/**
	 * Update the Entity
	 * @param rootEntity
	 */
	public void update(T rootEntity);
	
	/**
	 * Delete the Entity
	 * @param rootEntity
	 */
	public void delete(T rootEntity);
	
	/**
	 * RecycleBin Entity
	 * @param rootEntitys
	 */
	public void recycleBin(T rootEntity);
	
	/**
	 * 
	 * @param rootEntity
	 * @return
	 */
	public void activate(T rootEntity);
	
	/**
	 * 
	 * @param rootEntity
	 * @return
	 */
	public void deactivate(T rootEntity);

}
