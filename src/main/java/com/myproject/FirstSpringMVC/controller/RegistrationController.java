package com.myproject.FirstSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.FirstSpringMVC.model.Product;
import com.myproject.FirstSpringMVC.model.Users;
import com.myproject.FirstSpringMVC.services.UserService;
import com.myproject.FirstSpringMVC.validator.UserValidation;
@Controller
public class RegistrationController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidation userValidation;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		
		binder.addValidators(userValidation);
	}

	

	@RequestMapping(value = "/logout")
	public String logoutPage() {
		return "home";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerPage(Model model) {
		model.addAttribute("user", new Users());
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerSave(Model model, @ModelAttribute("user") @Validated Users user, BindingResult result) {
		if (result.hasErrors())
			return "register";

		if (user != null) {
			model.addAttribute("msg", "Registered successful!");
			userService.addUser(user);
		} else {
			return "register";
		}

		return "success";
	}
	
	
	
}
