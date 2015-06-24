package edu.kwon.frmk.common.data.jpa.repository.entities.root;

/**
 * Root Entity Service Implementation
 * @author Bunlong Taing
 *
 * @param <T>
 * @since 0.0.1
 * @version 0.0.1
 */
public abstract class RootEntityServiceImpl<T extends RootEntity> implements RootEntityService<T> {

	public void save(T rootEntity) {
		getDao().save(rootEntity);
	}

	public void update(T rootEntity) {
		getDao().save(rootEntity);
	}

	public void delete(T rootEntity) {
		getDao().delete(rootEntity);
	}
	
//	protected abstract <Dao extends RootEntityDao<T>> Dao getDao();
	
	protected abstract RootEntityDao<T> getDao();

}
