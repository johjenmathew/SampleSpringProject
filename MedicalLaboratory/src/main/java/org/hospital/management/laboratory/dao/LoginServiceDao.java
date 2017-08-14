package org.hospital.management.laboratory.dao;

import org.hospital.management.laboratory.model.User;

public interface LoginServiceDao {
	public User findByUsername(String username);
}
