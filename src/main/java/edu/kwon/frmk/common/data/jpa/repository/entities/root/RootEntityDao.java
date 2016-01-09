package edu.kwon.frmk.common.data.jpa.repository.entities.root;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Dao of Root Entity
 * Which extend the Spring JpaRepository and JpaSpecificationExecutor
 * @author eduseashell
 *
 * @param <T>
 * @since 0.0.1
 * @version 0.0.1
 */
@NoRepositoryBean
public interface RootEntityDao<T extends RootEntity> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

	/**
	 * Find the entity by Id
	 * @param id
	 * @return
	 */
	public T findByIdAndDelete(Long id, boolean delete);
	
}
