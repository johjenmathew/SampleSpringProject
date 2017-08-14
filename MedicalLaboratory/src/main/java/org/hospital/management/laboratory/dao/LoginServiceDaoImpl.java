package org.hospital.management.laboratory.dao;

import org.hibernate.SessionFactory;
import org.hospital.management.laboratory.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@EnableTransactionManagement 
@Transactional @Repository
public class LoginServiceDaoImpl implements LoginServiceDao {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public User findByUsername(String username) {
		User user = (User) this.sessionFactory.getCurrentSession().createQuery("from User where username = ?")
				.setParameter(0, username).list().get(0);
		System.out.println(user.getUsername() + " " + user.getPassword());
		return user;

	}

}
