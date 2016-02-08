package edu.kwon.frmk.common.data.jpa.repository.user;

import edu.kwon.frmk.common.data.jpa.repository.person.PersonService;

/**
 * User Service
 * @author eduseashell
 *
 * @since Jun 22, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public interface UserService extends PersonService<User> {
	
	/**
	 * Get User By User Name
	 * @param userName
	 * @return
	 */
	User getByUserName(String userName);
	
	/**
	 * Increate the number of failed attempt
	 * @param username
	 */
	void increaseNbFailedLogInAttempt(String username);
	
	/**
	 * Change the password
	 * @param user
	 * @param password
	 */
	User changePassword(User user, String oldPassword, String newPassword);
	
	/**
	 * After log in:
	 * - Clear the failed login attempt number
	 * - Set last log in date
	 */
	void afterLogIn(String userName);
	
	/**
	 * After log out:
	 * - Set last log out date
	 * @param userName
	 */
	void afterLogOut(String userName);

}
