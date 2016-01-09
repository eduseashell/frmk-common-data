package edu.kwon.frmk.common.data.jpa.repository.menus.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntityServiceImpl;

/**
 * Menu Item Service Implementation
 * @author eduseashell
 *
 * @since Jul 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
public class MenuItemServiceImpl extends AuditEntityServiceImpl<MenuItem> implements MenuItemService {

	@Autowired
	private MenuItemDao dao;
	
	@Override
	public MenuItemDao getDao() {
		return this.dao;
	}

}
