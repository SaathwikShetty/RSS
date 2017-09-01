package com.rss.login.controller;

import com.rss.login.service.*;
import com.rss.login.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rss.login.bean.User;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void diplayLogin() {

	}

	@RequestMapping(value = "/userVerification", method = RequestMethod.POST)
	public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("userBean") User userBean) {
		System.out.println(userBean.getUserID());
		System.out.println(userBean.getPermissionID());
		System.out.println(userBean.getUserPassword());
		System.out.println(userBean.getCreatedDTTM());
		System.out.println(userBean.getLastUpdatedDTTM());
		System.out.println("Validate Login method ...");
		ModelAndView model = null;
		try {
			User userModel = userService.userAuthentication(userBean);
			if (userModel.getPermissionID() != null) {
				// User login successful
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", userBean.getUserID());
				model = new ModelAndView("home");
			} else {
				// Invalid user
				model = new ModelAndView("login");
				model.addObject("userBean", userBean);
				request.setAttribute("message", "Invalid username or password");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return model;
	}

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String displayUSer(Model model) {
		model.addAttribute("userBean", new User());
		return "login";
	}
}
