package org.hospital.management.laboratory.dao;

import java.util.List;

import org.hospital.management.laboratory.model.User;
import org.hospital.management.laboratory.support.CustomHibernateDaoSupport;

public class LoginServiceDaoImpl extends CustomHibernateDaoSupport implements LoginServiceDao {

	public User findByUsername(String username) {

		@SuppressWarnings("unchecked")
		List<User> list = getHibernateTemplate().find("from User where username = ?", username);
		return list.get(0);
	}

}
