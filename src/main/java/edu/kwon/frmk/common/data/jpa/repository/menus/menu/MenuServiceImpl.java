package edu.kwon.frmk.common.data.jpa.repository.menus.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntityServiceImpl;

/**
 * Menu Service Implementation
 * @author eduseashell
 *
 * @since Jul 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
public class MenuServiceImpl extends AuditEntityServiceImpl<Menu> implements MenuService {

	@Autowired
	private MenuDao dao;
	
	@Override
	public MenuDao getDao() {
		return this.dao;
	}

}
