package edu.kwon.frmk.common.data.jpa.repository.entities.root;

/**
 * Root Entity Service
 * @author Bunlong Taing
 *
 * @param <T>
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public interface RootEntityService<T extends RootEntity> {
	
	/**
	 * Save the root Entity
	 * @param rootEntity
	 */
	public void save(T rootEntity);
	
	/**
	 * Update the root Entity
	 * @param rootEntity
	 */
	public void update(T rootEntity);
	
	/**
	 * Delete the root Entity
	 * @param rootEntity
	 */
	public void delete(T rootEntity);

}
