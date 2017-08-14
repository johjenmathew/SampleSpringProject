package org.hospital.management.laboratory.dao;

import org.hibernate.SessionFactory;
import org.hospital.management.laboratory.model.User;

public class LoginServiceDaoImpl implements LoginServiceDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public User findByUsername(String username) {

		return (User) this.sessionFactory.getCurrentSession().createQuery("from User where username = ?")
				.setParameter(0, username).list().get(0);

	}

}
