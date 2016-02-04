package edu.kwon.frmk.common.data.jpa.repository.user;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import edu.kwon.frmk.common.data.jpa.repository.person.Person;

/**
 * User
 * @author eduseashell
 *
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Entity
@Table(name = "at_user")	// at = admin table
public class User extends Person implements UserField, UserDetails {

	private static final long serialVersionUID = -4760429907328356533L;
	
	private String userName;				// for login, use it as login name
	private String password;
	private Date lastPwdModifiedDate;
	private Date lastLogInDate;
	private Date lastLogOutDate;
	private Boolean defaultPwd;				// true: current pwd is default
	private Boolean needPwdChange;			// true: pwd need to change before login
	private Boolean freeze;					// Stop the user from login
	private Long maxTimePwdChange;			// The max time for password to be changed after last password changed in seconds.
	private Integer maxAttemptLogInAllow;	// The max number of fail login allowed before freeze the user
	private Integer nbFailedLogInAttempt;	// The number of fail login attempt
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

	@Column(name = "user_name", length = 100, nullable = false, unique = true)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	@Column(name = "usr_pwd", length = 100, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "dt_last_pwd_modified")
	public Date getLastPwdModifiedDate() {
		return lastPwdModifiedDate;
	}

	public void setLastPwdModifiedDate(Date lastPwdModifiedDate) {
		this.lastPwdModifiedDate = lastPwdModifiedDate;
	}

	@Column(name = "dt_last_log_in")
	public Date getLastLogInDate() {
		return lastLogInDate;
	}

	public void setLastLogInDate(Date lastLogInDate) {
		this.lastLogInDate = lastLogInDate;
	}

	@Column(name = "dt_last_log_out")
	public Date getLastLogOutDate() {
		return lastLogOutDate;
	}

	public void setLastLogOutDate(Date lastLogOutDate) {
		this.lastLogOutDate = lastLogOutDate;
	}

	@Column(name = "default_pwd")
	public Boolean getDefaultPwd() {
		return defaultPwd;
	}

	public void setDefaultPwd(Boolean defaultPwd) {
		this.defaultPwd = defaultPwd;
	}

	@Column(name = "need_pwd_change")
	public Boolean getNeedPwdChange() {
		return needPwdChange;
	}

	public void setNeedPwdChange(Boolean needPwdChange) {
		this.needPwdChange = needPwdChange;
	}

	@Column(name = "usr_freeze")
	public Boolean getFreeze() {
		return freeze;
	}

	public void setFreeze(Boolean freeze) {
		this.freeze = freeze;
	}

	@Column(name = "max_time_pwd_change")
	public Long getMaxTimePwdChange() {
		return maxTimePwdChange;
	}

	public void setMaxTimePwdChange(Long maxTimePwdChange) {
		this.maxTimePwdChange = maxTimePwdChange;
	}

	@Column(name = "max_attempt_log_in_allow")
	public Integer getMaxAttemptLogInAllow() {
		return maxAttemptLogInAllow;
	}

	public void setMaxAttemptLogInAllow(Integer maxAttemptLogInAllow) {
		this.maxAttemptLogInAllow = maxAttemptLogInAllow;
	}
	
	@Column(name = "nb_failed_log_in_attempt")
	public Integer getNbFailedLogInAttempt() {
		return nbFailedLogInAttempt;
	}

	public void setNbFailedLogInAttempt(Integer nbFailedLogInAttempt) {
		this.nbFailedLogInAttempt = nbFailedLogInAttempt;
	}
	
	//=================================================================
	//				Spring Security - UserDetails
	//=================================================================

	@Override
	@Transient
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transient
	public String getUsername() {
		return getUserName();
	}

	@Override
	@Transient
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	@Transient
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	@Transient
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	@Transient
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
