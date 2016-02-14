package edu.kwon.frmk.common.data.jpa.repository.entities.audit;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootSpecification;

public class AuditSpecification<T extends AuditEntity> extends RootSpecification<T> {
	
	@Override
	protected void buildPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		super.buildPredicate(root, query, cb);
		// TODO audit specification
	}

}
