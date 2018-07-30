package com.myproject.FirstSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.myproject.FirstSpringMVC.model.Product;
import com.myproject.FirstSpringMVC.services.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public String productPage(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("prodList", productService.productList());
		return "product";
	}
	@RequestMapping(value="/product", method=RequestMethod.POST)
	public String productSave(Model model,@ModelAttribute("product") Product product) {
		if(product!=null) {
			productService.addProduct(product);
		}
		model.addAttribute("prodList", productService.productList());
		return "product";
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String updateProduct(Model model,@PathVariable Integer id) {
		model.addAttribute("product", new Product());
		productService.updateProduct(id);
		return "redirect:/product";
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String deleteProduct(Model model,@PathVariable Integer id) {
		model.addAttribute("product", new Product());
		productService.removeProduct(id);
		return "redirect:/product";  // redirect:/
	}
}
