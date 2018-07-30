package com.myproject.FirstSpringMVC.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.FirstSpringMVC.model.Product;
import com.myproject.FirstSpringMVC.model.Users;
import com.myproject.FirstSpringMVC.services.UserService;
import com.myproject.FirstSpringMVC.validator.LoginValidator;



@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private LoginValidator loginValidator;
	
	

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		
		binder.addValidators(loginValidator);
	}

	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("message", "This is home page !");
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		model.addAttribute("user", new Users());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginSubmit(Model model, @ModelAttribute("user") @Validated Users user, BindingResult result) {
		if (result.hasErrors())
			return "login";

		if (user != null) {
			if (userService.checkLogin(user.getUserName(), user.getUserPass())) {
				model.addAttribute("user_name", user.getUserName());
				model.addAttribute("userList", userService.listUsers());
				return "success";
			} else {
				model.addAttribute("error", "Invalid Credentials!");
				return "login";
			}
		}
		model.addAttribute("error", "Please Enter Login Details");
		
		return "login";
	}
	
	@RequestMapping(value = "/userlist")
	public String getUsers(Model model) {
		model.addAttribute("userList", userService.listUsers());
		return "users";
	}

	@RequestMapping(value="/updateUser/{id}")
	public String updateProduct(Model model,@PathVariable Integer id) {
	//	model.addAttribute("product", new Product());
		userService.updateUser(id);
		return "redirect:/userlist";
	}
	
	@RequestMapping(value="/deleteUser/{id}")
	public String deleteProduct(Model model,@PathVariable Integer id) {
	//	model.addAttribute("product", new Product());
		userService.removeUser(id);
		return "redirect:/userlist";  // redirect:/
	}

}
