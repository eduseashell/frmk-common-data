package edu.kwon.frmk.common.data.jpa.repository.entities.root;

import java.util.List;


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
		rootEntity.setBlDelete(true);
		getDao().delete(rootEntity);
	}
	
	@Override
	public void delete(Long id) {
		T t = findById(id);
		delete(t);
	}
	
	@Override
	public T restoreDelete(T rootEntity) {
		rootEntity.setBlDelete(false);
		return update(rootEntity);
	}
	
	@Override
	public T restoreDelete(Long id) {
		T t = getDao().findOne(id);
		return restoreDelete(t);
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
		return getDao().findByIdAndBlDelete(id, false);
	}
	
	@Override
	public List<T> findAll(RootSpecification<T> specification) {
		return getDao().findAll(specification);
	}
	
	public abstract RootEntityDao<T> getDao();

}
