package org.hospital.management.laboratory.support;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CustomHibernateDaoSupport extends HibernateDaoSupport{
	
	@Autowired
	public void setAppSessionFactory(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
