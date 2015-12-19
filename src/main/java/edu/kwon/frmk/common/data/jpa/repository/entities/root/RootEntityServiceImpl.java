package edu.kwon.frmk.common.data.jpa.repository.entities.root;

/**
 * Root Entity Service Implementation
 * @author eduseashell
 *
 * @param <T>
 * @since 0.0.1
 * @version 0.0.1
 */
public abstract class RootEntityServiceImpl<T extends RootEntity> implements RootEntityService<T> {

	@Override
	public void save(T rootEntity) {
		getDao().save(rootEntity);
	}

	@Override
	public void update(T rootEntity) {
		getDao().save(rootEntity);
	}

	@Override
	public void delete(T rootEntity) {
		getDao().delete(rootEntity);
	}
	
	@Override
	public void recycleBin(T rootEntity) {
		rootEntity.setRecycleBin(Boolean.TRUE);
		save(rootEntity);
	}
	
	@Override
	public void activate(T rootEntity) {
		rootEntity.setActive(Boolean.TRUE);
		save(rootEntity);
	}
	
	@Override
	public void deactivate(T rootEntity) {
		rootEntity.setActive(Boolean.FALSE);
		save(rootEntity);
	}
	
//	protected abstract <Dao extends RootEntityDao<T>> Dao getDao();
	protected abstract RootEntityDao<T> getDao();

}
