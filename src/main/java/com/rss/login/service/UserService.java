package com.rss.login.service;

import com.rss.login.bean.User;

public interface UserService {
	public boolean changePasssword();

	public boolean login(String userName, String password, boolean changePassword, String permissionID);
	
	public User userAuthentication(User userBean);
	
	public User userLogin(User usedDetails);
	
	public String encryptPassword(String password);
}
