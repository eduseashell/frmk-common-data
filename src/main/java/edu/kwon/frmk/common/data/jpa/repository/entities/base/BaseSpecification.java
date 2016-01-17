package edu.kwon.frmk.common.data.jpa.repository.entities.base;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootSpecification;

/**
 * @author eduseashell
 * @param <T>
 */
public class BaseSpecification<T extends BaseEntity> extends RootSpecification<T> {
	
	private String code;
	private String desc;

	@Override
	protected void buildPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		if (code != null) {
			Expression<String> exCode = root.get(BaseEntity.CODE);
			getPredicate().add(cb.like(exCode, code));
		}
		if (desc != null) {
			Expression<String> exDesc = root.get(BaseEntity.DESC);
			getPredicate().add(cb.like(exDesc, desc));
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
