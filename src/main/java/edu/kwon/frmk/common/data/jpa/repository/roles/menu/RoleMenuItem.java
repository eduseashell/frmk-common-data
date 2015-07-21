package edu.kwon.frmk.common.data.jpa.repository.roles.menu;

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

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntity;
import edu.kwon.frmk.common.data.jpa.repository.menus.item.MenuItem;
import edu.kwon.frmk.common.data.jpa.repository.menus.menu.Menu;
import edu.kwon.frmk.common.data.jpa.repository.roles.role.Role;

/**
 * Role Menu Item is the menu item of each role
 * - A RoleMenuItem which has no child or children should provide the action
 * - A RoleMenuItem which has no parent is the top level menu
 * @author Bunlong Taing
 *
 * @since Jul 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Entity
@Table(name = "at_role_menu_item")
public class RoleMenuItem extends BaseEntity {

	private static final long serialVersionUID = 3470484721946298992L;
	
	private Role role;
	private Menu menu;
	private MenuItem menuItem;
	private RoleMenuItem parent;
	private List<RoleMenuItem> children;

	/**
	 * Role menu item id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_menu_item_id")
	@Override
	public Long getId() {
		return this.id;
	}

	/**
	 * @return the role
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
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
	 * @return the menuItem
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_item_id", nullable = false)
	public MenuItem getMenuItem() {
		return menuItem;
	}

	/**
	 * @param menuItem the menuItem to set
	 */
	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	/**
	 * @return the parent
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	public RoleMenuItem getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(RoleMenuItem parent) {
		this.parent = parent;
	}

	/**
	 * @return the children
	 */
	@OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
	public List<RoleMenuItem> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(List<RoleMenuItem> children) {
		this.children = children;
	}

}
