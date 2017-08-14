package org.hospital.management.laboratory.service;

import org.hospital.management.laboratory.dao.LoginServiceDao;
import org.hospital.management.laboratory.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginServiceDao dao;

	public User findByUsername(String username) {

		return dao.findByUsername(username);
	}

}
