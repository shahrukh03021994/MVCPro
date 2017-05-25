package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {

	
	
	public ModelAndView addCategory()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("", "");
		mav.setViewName("");
		
		return null;
		
		
		
		
	}
}
