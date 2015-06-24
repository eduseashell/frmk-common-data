package edu.kwon.frmk.common.data.jpa.repository.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kwon.frmk.common.data.jpa.repository.entities.entity.EntityServiceImpl;

/**
 * User Service Implementation
 * @author Bunlong Taing
 *
 * @since Jun 22, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Service
@Transactional
public class UserServiceImpl extends EntityServiceImpl<User> implements UserService {
	
	@Autowired
	private UserDao dao;

	@Override
	protected UserDao getDao() {
		return this.dao;
	}

}
