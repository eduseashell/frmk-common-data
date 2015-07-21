package edu.kwon.frmk.common.data.jpa.repository.roles.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntityServiceImpl;
import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityDao;

/**
 * Role Service Implementation
 * @author Bunlong Taing
 *
 * @since Jul 20, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
//@Transactional
public class RoleServiceImpl extends BaseEntityServiceImpl<Role> implements RoleService {

	@Autowired
	private RoleDao dao;
	
	@Override
	protected RootEntityDao<Role> getDao() {
		return this.dao;
	}

}
