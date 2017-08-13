package org.hospital.management.laboratory.service;

import org.hospital.management.laboratory.model.User;

public interface LoginService {
	public boolean validateUser(User user);
}
