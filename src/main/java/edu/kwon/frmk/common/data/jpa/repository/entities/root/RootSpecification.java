package edu.kwon.frmk.common.data.jpa.repository.entities.root;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

/**
 * @author eduseashell
 * @param <T>
 */
public class RootSpecification<T extends RootEntity> implements Specification<T> {
	
	private List<Predicate> predicates;
	
	private boolean includeDelete = false;
	private Boolean delete;
	private Boolean active;

	@Override
	public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		Expression<Boolean> exDelete = root.get(RootEntity.BL_DELETE);
		if (delete != null) {
			getPredicate().add(cb.equal(exDelete, delete));
		} else if (!includeDelete) {
			getPredicate().add(cb.isFalse(exDelete));
		}
		
		if (active != null) {
			Expression<Boolean> exActive = root.get(RootEntity.ACTIVE);
			getPredicate().add(cb.equal(exActive, active));
		}
		buildPredicate(root, query, cb);
		return cb.and(getPredicate().toArray(new Predicate[getPredicate().size()]));
	}
	
	protected void buildPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		orderBy(root, query, cb);
	}
	
	protected void orderBy(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		query.orderBy(cb.asc(root.get(RootEntity.ID)));
	}
	
	protected String formatField(String field) {
		return field == null ? field : "%" + field.toLowerCase() + "%";
	}
	
	public List<Predicate> getPredicate() {
		if (predicates == null) {
			predicates = new ArrayList<>();
		}
		return predicates;
	}
	
	public boolean isIncludeDelete() {
		return includeDelete;
	}

	public void setIncludeDelete(boolean includeDelete) {
		this.includeDelete = includeDelete;
	}

	public Boolean getDelete() {
		return delete;
	}

	public void setDelete(Boolean delete) {
		this.delete = delete;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
