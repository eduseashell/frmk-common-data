package edu.kwon.frmk.common.data.jpa.repository.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.kwon.frmk.common.data.jpa.repository.person.Person;

/**
 * User
 * @author Bunlong Taing
 *
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Entity
@Table(name = "at_user")	// at = admin table
public class User extends Person {

	private static final long serialVersionUID = -4760429907328356533L;
	
	private String userName;				// for login, use it as login name
	private String password;
//	private Date lastPwdChangeDate;
//	private Date lastLogInDate;
//	private Date lastLogOutDate;
//	private Boolean defaultPwd;
//	private Boolean needPwdChange;
//	private Boolean freeze;					// Stop the user from login
//	private Long maxTimePwdChange;			// The max time for password to be changed after last password changed in seconds.
//	private Integer maxAttemptLogInAllow;	// The max number of fail login allowed before freeze the user
//	private List<Profile> profiles;

	/**
	 * User id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	@Override
	public Long getId() {
		return this.id;
	}

	/**
	 * @return the userName
	 */
	@Column(name = "user_name", length = 100, nullable = false, unique = true)
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	@Column(name = "password", length = 100, nullable = false)
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
