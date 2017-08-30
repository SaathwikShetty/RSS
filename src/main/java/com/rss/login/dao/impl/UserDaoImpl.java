package com.rss.login.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rss.login.bean.User;
import com.rss.login.dao.UserDao;
import com.rss.login.bean.User;

@Repository("loginDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean changePassword(String userName, String password, boolean passwordChanged) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(String userName, String password, String permissionID) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addUser(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyUser(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public User userLogin(User userDetails) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from com.rss.login.bean.User as u where u.user_ID=? and u.user_password=?";
		try {
			Query query = session.createQuery(hql);
			query.setParameter(0, userDetails.getUserID());
			query.setParameter(1, userDetails.getUserPassword());
			userDetails = (User) query.uniqueResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		return userDetails;
	}

}
