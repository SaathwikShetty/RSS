package com.rss.login.dao;

import com.rss.login.bean.User;

public interface UserDao {
	public boolean changePassword(String userName, String password, boolean passwordChanged);

	public boolean deleteUser(String userName, String password, String permissionID);

	public boolean addUser(String userName, String password);
	
	public boolean verifyUser(String userName,String password);
	
	public User userLogin(User userDetails);
}
