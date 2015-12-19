package edu.kwon.frmk.common.data.jpa.repository.menus.menu;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntity;
import edu.kwon.frmk.common.data.jpa.repository.menus.item.MenuItem;

/**
 * Menu of the application (this treat just like a menu bar)
 * @author eduseashell
 *
 * @since Jul 20, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Entity
@Table(name = "st_menu")		// st = Setting table
public class Menu extends AuditEntity {

	private static final long serialVersionUID = -2595484350671879549L;
	
	private List<MenuItem> menuItems;
	// code for app code

	/**
	 * Menu Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menu_id", nullable = false)
	@Override
	public Long getId() {
		return this.id;
	}

	/**
	 * @return the menuItems
	 */
	@OneToMany(mappedBy = "menu", fetch = FetchType.LAZY)
	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	/**
	 * @param menuItems the menuItems to set
	 */
	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

}
