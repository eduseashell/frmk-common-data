package edu.kwon.frmk.common.data.jpa.repository.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntityServiceImpl;

/**
 * User Service Implementation
 * @author eduseashell
 *
 * @since Jun 22, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
//@Transactional	// @Service is Transactional by default:check
public class UserServiceImpl extends BaseEntityServiceImpl<User> implements UserService {
	
	@Autowired
	private UserDao dao;

	@Override
	protected UserDao getDao() {
		return this.dao;
	}

}
