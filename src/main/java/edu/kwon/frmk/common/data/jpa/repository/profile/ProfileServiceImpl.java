package edu.kwon.frmk.common.data.jpa.repository.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kwon.frmk.common.data.jpa.repository.entities.base.BaseEntityServiceImpl;
import edu.kwon.frmk.common.data.jpa.repository.entities.root.RootEntityDao;

/**
 * @author eduseashell
 */
@Service
public class ProfileServiceImpl extends BaseEntityServiceImpl<Profile> implements ProfileService {

	@Autowired
	private ProfileDao dao;
	
	@Override
	public RootEntityDao<Profile> getDao() {
		return this.dao;
	}

}
