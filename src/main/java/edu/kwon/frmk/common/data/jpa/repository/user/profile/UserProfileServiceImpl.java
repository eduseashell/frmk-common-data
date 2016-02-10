package edu.kwon.frmk.common.data.jpa.repository.user.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.audit.AuditEntityServiceImpl;
import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityDao;

/**
 * @author eduseashell
 */
@Service
public class UserProfileServiceImpl extends AuditEntityServiceImpl<UserProfile> implements UserProfileService {

	@Autowired
	private UserProfileDao dao;
	
	@Override
	public RootEntityDao<UserProfile> getDao() {
		return this.dao;
	}

}
