package com.rss.login.controller;

import com.rss.login.service.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rss.login.bean.User;

@Controller
public class UserController {

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void diplayLogin() {

	}

	@RequestMapping(value= {"userVerification"}, method=RequestMethod.POST)
	public void userAuthentication(User userDetails) {
		System.out.println("im here");
//		userService.userAuthentication(userDetails);
	}

	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String displayUSer(Model model) {
		model.addAttribute("userBean", new User());
		return "login";
	}
}
