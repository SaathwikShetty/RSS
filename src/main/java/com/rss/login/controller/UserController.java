package com.rss.login.controller;

import com.rss.login.service.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rss.login.bean.User;

@Controller
public class UserController {

	// public static final Logger
	// logger=LoggerFactory.getLogger(UserController.class);

	private UserService userService;

	public UserService getUserLoginService() {
		return userService;
	}

	public void setUserLoginService(UserService userService) {
		this.userService = userService;
	}

	public void diplayLogin() {

	}

	public void userAuthentication(User userDetails) {
		userService.userAuthentication(userDetails);
	}

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String displayUSer(Model model) {
		model.addAttribute("userBean", new User());
		return "login";
	}
}
