package edu.kwon.frmk.common.data.jpa.repository.entities.base;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditSpecification;

/**
 * @author eduseashell
 * @param <T>
 */
public class BaseSpecification<T extends BaseEntity> extends AuditSpecification<T> {
	
	private String code;
	private String desc;
	
	@Override
	protected void buildPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		super.buildPredicate(root, query, cb);
		if (code != null) {
			Expression<String> exCode = root.get(BaseEntity.CODE);
			getPredicate().add(cb.like(cb.lower(exCode), code));
		}
		if (desc != null) {
			Expression<String> exDesc = root.get(BaseEntity.DESC);
			getPredicate().add(cb.like(cb.lower(exDesc), desc));
		}
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = formatField(code);
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = formatField(desc);
	}
	
}
