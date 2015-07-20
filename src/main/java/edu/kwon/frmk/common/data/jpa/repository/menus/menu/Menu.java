package edu.kwon.frmk.common.data.jpa.repository.menus.menu;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.glass.ui.MenuItem;

import edu.kwon.frmk.common.data.jpa.repository.entities.entity.Entity;

/**
 * Menu of the application (this treat just like a menu bar)
 * @author Bunlong Taing
 *
 * @since Jul 20, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@javax.persistence.Entity
@Table(name = "st_menu")		// st = Setting table
public class Menu extends Entity {

	private static final long serialVersionUID = -2595484350671879549L;
	
	private List<MenuItem> menuItems;

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
