package com.rss.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.rss.login.dao.UserDao;
import com.rss.login.bean.User;
import com.rss.login.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean changePasssword() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean login(String userName, String password, boolean changePassword, String permissionID) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean userAuthentication(User userDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	public User userLogin(User usedDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
