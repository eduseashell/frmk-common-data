package edu.kwon.frmk.common.data.jpa.repository.user;

import edu.kwon.frmk.common.data.jpa.repository.person.PersonDao;

/**
 * User Dao
 * @author eduseashell
 *
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
//@Repository TODO Check if need this annotation
public interface UserDao extends PersonDao<User> {

}
