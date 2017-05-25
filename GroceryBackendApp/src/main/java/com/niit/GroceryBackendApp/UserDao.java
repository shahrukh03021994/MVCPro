package com.niit.GroceryBackendApp;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


//@Repository("userDAO")
//@Transactional
public class UserDao{
	//@Autowired
	private SessionFactory sessionFactory;
	
	
	public UserDao(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory=sessionFactory;
	}

	//@SuppressWarnings("unchecked")
	//@Transactional
	public List<User> list() {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().getTransaction().begin();
		List<User> list=sessionFactory.openSession().createQuery("select * from User").list();
		
		sessionFactory.getCurrentSession().getTransaction().commit();
		sessionFactory.getCurrentSession().close();
		return list;
	}

}
