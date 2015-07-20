package edu.kwon.frmk.common.data.jpa.repository.menus.item;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.kwon.frmk.common.data.jpa.repository.entities.entity.Entity;
import edu.kwon.frmk.common.data.jpa.repository.menus.menu.Menu;

/**
 * 
 * @author Bunlong Taing
 *
 * @since Jul 20, 2015
 * @since
 * @version
 */
@javax.persistence.Entity
@Table(name = "st_menu_item")
public class MenuItem extends Entity {

	private static final long serialVersionUID = 3191515148191755885L;
	
	private String captionKey;			// I18N
	private String icon;				// Font-awesome
	private String imagePath;			// Image path
	private String action;				// View name (vaadin), or Uri
	
	private Integer index;				// Ordering of the menu
	
	private Menu menu;					// Menu of the application
	private MenuItem parent;			// Parent of the menu, null for top level
	private List<MenuItem> children;	// Child or children of the menu

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menu_item_id", nullable = false)
	@Override
	public Long getId() {
		return this.id;
	}

}
