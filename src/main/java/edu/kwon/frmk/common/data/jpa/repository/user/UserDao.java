package edu.kwon.frmk.common.data.jpa.repository.user;

import org.springframework.stereotype.Repository;

import edu.kwon.frmk.common.data.jpa.repository.person.PersonDao;

/**
 * User Dao
 * @author eduseashell
 *
 * @since Jun 21, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Repository
public interface UserDao extends PersonDao<User> {

}
