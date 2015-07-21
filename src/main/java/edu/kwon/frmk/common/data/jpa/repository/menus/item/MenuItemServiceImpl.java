package edu.kwon.frmk.common.data.jpa.repository.menus.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntityServiceImpl;
import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityDao;

/**
 * Menu Item Service Implementation
 * @author Bunlong Taing
 *
 * @since Jul 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
public class MenuItemServiceImpl extends BaseEntityServiceImpl<MenuItem> implements MenuItemService {

	@Autowired
	private MenuItemDao dao;
	
	@Override
	protected RootEntityDao<MenuItem> getDao() {
		return this.dao;
	}

}
