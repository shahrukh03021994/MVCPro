package com.niit.GroceryBackendApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("categoryDAO")
public class CategoryDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDao(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertCategory(Category category)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(category);
	}
		
}
