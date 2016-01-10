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
	public T save(T rootEntity) {
		return getDao().save(rootEntity);
	}

	@Override
	public T update(T rootEntity) {
		return save(rootEntity);
	}

	@Override
	public void delete(T rootEntity) {
		rootEntity.setDelete(true);
		getDao().delete(rootEntity);
	}
	
	@Override
	public T restoreDelete(T rootEntity) {
		rootEntity.setDelete(false);
		return update(rootEntity);
	}
	
	@Override
	public void deletePermanently(T rootEntity) {
		getDao().delete(rootEntity);
	}
	
	@Override
	public T activate(T rootEntity) {
		rootEntity.setActive(Boolean.TRUE);
		return save(rootEntity);
	}
	
	@Override
	public T deactivate(T rootEntity) {
		rootEntity.setActive(Boolean.FALSE);
		return save(rootEntity);
	}
	
	@Override
	public T findById(Long id) {
		return getDao().findByIdAndDelete(id, false);
	}
	
	public abstract RootEntityDao<T> getDao();

}
