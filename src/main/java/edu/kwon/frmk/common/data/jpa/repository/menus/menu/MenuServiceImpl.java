package edu.kwon.frmk.common.data.jpa.repository.menus.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntityServiceImpl;
import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityDao;

/**
 * Menu Service Implementation
 * @author Bunlong Taing
 *
 * @since Jul 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
public class MenuServiceImpl extends BaseEntityServiceImpl<Menu> implements MenuService {

	@Autowired
	private MenuDao dao;
	
	@Override
	protected RootEntityDao<Menu> getDao() {
		return this.dao;
	}

}
