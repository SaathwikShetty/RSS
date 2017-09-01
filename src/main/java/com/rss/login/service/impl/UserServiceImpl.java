package com.rss.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rss.login.dao.UserDao;
import com.rss.login.dao.impl.UserDaoImpl;
import com.rss.login.bean.User;
import com.rss.login.service.UserService;

@Service
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

	public User userLogin(User usedDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	public User userAuthentication(User userBean) {
		// TODO Auto-generated method stub
		System.out.println("User service");
		User userDetails=null;
		try {
			String encryptedPassword = encryptPassword(userBean.getUserPassword());
			userBean.setUserPassword(encryptedPassword);
			userDetails = userDao.verifyUser(userBean);
		} catch (Exception e) {
			System.err.println(e);
		}
		return userDetails;
	}

	public String encryptPassword(String password) {
		// TODO Auto-generated method stub
		return password;
	}

}
