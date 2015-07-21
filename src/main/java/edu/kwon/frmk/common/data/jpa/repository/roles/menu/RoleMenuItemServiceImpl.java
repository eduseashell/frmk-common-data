package edu.kwon.frmk.common.data.jpa.repository.roles.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntityServiceImpl;
import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityDao;

/**
 * Role Menu Item Service Implementation
 * @author Bunlong Taing
 *
 * @since Jul 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
public class RoleMenuItemServiceImpl extends BaseEntityServiceImpl<RoleMenuItem> implements RoleMenuItemService {

	@Autowired
	private RoleMenuItemDao dao;
	
	@Override
	protected RootEntityDao<RoleMenuItem> getDao() {
		return this.dao;
	}

}
