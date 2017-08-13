package org.hospital.management.laboratory.controller;

import org.hospital.management.laboratory.model.User;
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
		if (user.getUsername().equalsIgnoreCase("Johjen") && user.getPassword().equals("password")) {
			ModelAndView view = new ModelAndView("success");
			return view;
		}else {
			ModelAndView view = new ModelAndView("login");
			model.addAttribute("error", "Username or Password is incorrect");
			return view;
		}
	}
}
