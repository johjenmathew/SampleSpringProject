package org.hospital.management.laboratory.controller;

import org.hospital.management.laboratory.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@ModelAttribute("user")
	  public User populateUser() {
	    User user = new User();
	    user.setUsername("your username");
	    user.setPassword("your password");
	    return user;
	  }

	@RequestMapping("/")
	public ModelAndView ShowIndexPage() {
		populateUser();
		ModelAndView model = new ModelAndView("login");
		return model;

	}
}