package com.myproject.FirstSpringMVC.controller;


import org.springframework.stereotype.Controller;


@Controller
public class HelloController {






	/*public String hello(Model model,@RequestParam(value = "name", defaultValue = "Guest") String name) {
		model.addAttribute("greeting", "Hello first MVC project !");
		model.addAttribute("name", name);
		return "home";
	}*/
/*@RequestMapping("/path/{sitePrefix}/{language}/document/{id}/{naturalText}")
public String documentView(Model model,
		@PathVariable(value="sitePrefix")String sitePrefix
		,@PathVariable(value="language")String language
		,@PathVariable(value="id")int id
		,@PathVariable(value="naturalText")String naturalText) {
	model.addAttribute("sitePrefix", sitePrefix);
	model.addAttribute("language", language);
	model.addAttribute("id", id);
	model.addAttribute("naturalText", naturalText);
	
	String documentName="default text if id didn't match";
	if(id==100)documentName="text with id "+id;
	model.addAttribute("documentName",documentName);
	return "documentView";
}
@RequestMapping(value="saveUser", method=RequestMethod.POST)
public String addUser(@ModelAttribute Users userObj) {
	if(userService.getUserById(userObj.getUserId())==null)
		userService.addUser(userObj);
	else
		userService.updateUser(userObj.getUserId());
	
	return null;
}*/

/*@RequestMapping(value="/checkValidity", method=RequestMethod.POST)
public ModelAndView checkUser(ModelAndView model) {
	Users user=new Users();
	if(userService.checkLogin(user.getUserName(), user.getUserPass()))
		//model.addObject("userObj", user);
		model.setViewName("documentView");
	else
		model.setViewName("redirect:/");
	return model;
}*/

}
