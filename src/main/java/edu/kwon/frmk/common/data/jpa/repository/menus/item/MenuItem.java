package edu.kwon.frmk.common.data.jpa.repository.menus.item;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntity;
import edu.kwon.frmk.common.data.jpa.repository.menus.menu.Menu;

/**
 * MenuItem is the menu which could has a parent or children
 * - A MenuItem which has no child or children should provide the action
 * - A MenuItem which has no parent is the top level menu
 * @author eduseashell
 *
 * @since Jul 20, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Entity
@Table(name = "st_menu_item")
public class MenuItem extends AuditEntity {

	private static final long serialVersionUID = 3191515148191755885L;
	
	private String captionKey;			// I18N
	private String icon;				// Font-awesome
	private String imagePath;			// Image path
	private String action;				// View name (vaadin), or Uri
	
	private Integer index;				// Ordering of the menu
	
	private Menu menu;					// Menu of the application
	private MenuItem parent;			// Parent of the menu, null for top level
	private List<MenuItem> children;	// Child or children of the menu

	/**
	 * Menu Item id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menu_item_id", nullable = false)
	@Override
	public Long getId() {
		return this.id;
	}

	/**
	 * @return the captionKey
	 */
	@Column(name = "caption_key")
	public String getCaptionKey() {
		return captionKey;
	}

	/**
	 * @param captionKey the captionKey to set
	 */
	public void setCaptionKey(String captionKey) {
		this.captionKey = captionKey;
	}

	/**
	 * @return the icon
	 */
	@Column(name = "icon")
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the imagePath
	 */
	@Column(name = "image_path")
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	/**
	 * @return the action
	 */
	@Column(name = "action")
	public String getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the index
	 */
	@Column(name = "order_index")
	public Integer getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}

	/**
	 * @return the menu
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_id", nullable = false)
	public Menu getMenu() {
		return menu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	/**
	 * @return the parent
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	public MenuItem getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(MenuItem parent) {
		this.parent = parent;
	}

	/**
	 * @return the children
	 */
	@OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
	public List<MenuItem> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(List<MenuItem> children) {
		this.children = children;
	}

}
