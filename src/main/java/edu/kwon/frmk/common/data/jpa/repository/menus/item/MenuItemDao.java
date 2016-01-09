package edu.kwon.frmk.common.data.jpa.repository.menus.item;

import org.springframework.stereotype.Repository;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntityDao;

/**
 * Menu Item Dao
 * @author eduseashell
 *
 * @since Jul 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Repository
public interface MenuItemDao extends AuditEntityDao<MenuItem> {

}
