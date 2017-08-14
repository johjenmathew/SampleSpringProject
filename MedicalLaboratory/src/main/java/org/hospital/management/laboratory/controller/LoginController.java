package org.hospital.management.laboratory.controller;

import org.hospital.management.laboratory.model.User;
import org.hospital.management.laboratory.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user") User user, BindingResult result, Model model) {
		String username = user.getUsername();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-mvc-servlet.xml");
		LoginService service = (LoginService) appContext.getBean("loginService");
		if (user.getUsername().equalsIgnoreCase("Johjen") && user.getPassword().equals("password")) {
			ModelAndView view = new ModelAndView("success");
			return view;
		} else {
			ModelAndView view = new ModelAndView("login");
			model.addAttribute("error", "Username or Password is incorrect");
			return view;
		}
	}
}
