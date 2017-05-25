package com.niit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.GroceryBackendApp.Category;
import com.niit.GroceryBackendApp.CategoryDao;
import com.niit.GroceryBackendApp.ListCheck;
import com.niit.GroceryBackendApp.User;
import com.niit.GroceryBackendApp.UserDao;


/*import com.niit.dao.ProductDao;
import com.niit.daoImpl.ProductDaoImpl;
import com.niit.model.Product;*/

@Controller
public class HomeController {


/*@Autowired
UserDao userDAO;*/

@Autowired
CategoryDao categoryDAO;

@Autowired	
ListCheck check;
	@RequestMapping(value={"/","/home"})
	public String index()
	{
		
	return "index";	
		
	}
	
	

	@RequestMapping("/login")
	public ModelAndView login(){
      ModelAndView mav=new ModelAndView();
      mav.setViewName("login");
		return mav;
		
		
		
	}
	
	@RequestMapping("/register")
	public ModelAndView register(){
      ModelAndView mav=new ModelAndView();
      mav.setViewName("register");
		return mav;
		
		
		
	}
	@RequestMapping("/details")
	public ModelAndView productDetails(){
	ModelAndView mav=new ModelAndView();
	mav.setViewName("details");
	return mav;	
	}
	
	
	
	@RequestMapping("/list")
	public ModelAndView productList(){
		ModelAndView mav=new ModelAndView("productTable");
	//userDAO.list();
		
		Category c1=new Category();
		c1.setCid(1);
		c1.setName("Meats");
		categoryDAO.insertCategory(c1);
		mav.addObject("list","done inserted the record" );
		mav.setViewName("productTable");
		return mav;
		
	}	
	
	@RequestMapping("getList")
	public ModelAndView listCheck(){
		
		ModelAndView mav=new ModelAndView("check");
		
		List<User> users=check.listOUser();
		
		System.out.println(users);
		
		mav.addObject("user", users);
		return mav;
		
		
	}
}
