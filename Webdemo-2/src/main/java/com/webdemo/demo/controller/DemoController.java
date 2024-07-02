package com.webdemo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webdemo.demo.model.AppUser;
import com.webdemo.demo.repo.UserRepo;

import jakarta.annotation.PostConstruct;

@Controller
public class DemoController {

	// create a method for login.jsp from views folder
//	@RequestMapping("/login")
//	public String login() {
//		return "login";
//	}
//	
//	// create a method for success.jsp from views folder
//	@RequestMapping("/success")
//	public String success() {
//		return "success";
//	}
//	
//	// create a method for failure.jsp from views folder
//	
//	@RequestMapping("/failure")
//	public String failure() {
//		return "failure";
//	}

	@Autowired
	UserRepo repo;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginForm() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLogin(@RequestParam String username, @RequestParam String password) {
		AppUser user = repo.findByUsernameAndPassword(username, password);
		if (user != null) {
			return "success";
		} else {
			return "failure";
		}
	}
	
	
// define a method to insert some user data to database  start of programe
	@PostConstruct
	public void addUser() {
		AppUser appuser = new AppUser();
		appuser.setUsername("admin");
		appuser.setPassword("admin");
		repo.save(appuser);

		appuser = new AppUser();
		appuser.setUsername("user");
		appuser.setPassword("user");
		repo.save(appuser);

		appuser = new AppUser();
		appuser.setUsername("guest");
		appuser.setPassword("guest");
		repo.save(appuser);
		
		System.out.println("Users added successfully .");

	}		
		
	
	
	
}
