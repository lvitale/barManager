package com.bar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bar.entity.User;
import com.bar.manager.UserManager;

@Controller
public class CustomerController {
    @Autowired
	private UserManager userManager;
    
	  @GetMapping("/customer")
	    public String showSignUpForm(User user,Model model) {
	    	//model.addAttribute("customers", userManager.findCustomer());
	        return "customer";
	    }
	    
}
