package com.rss.login.bean;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "USER_PERMISSION")
public class User {

	@Id
	@NotEmpty
	@Column(name = "USER_ID")
	private String userID;

	@Column(name = "USER_PASSWORD")
	private String userPassword;

	@Column(name = "PASSWORD_CHANGED")
	private boolean passwordChanged;

	@Column(name = "PERMISSION_ID")
	private String permissionID;

	@Column(name = "CREATED_DTTM")
	private Date createdDTTM;

	@Column(name = "LAST_UPDATED_DTTM")
	private Date lastUpdatedDTTM;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public boolean isPasswordChanged() {
		return passwordChanged;
	}

	public void setPasswordChanged(boolean passwordChanged) {
		this.passwordChanged = passwordChanged;
	}

	public String getPermissionID() {
		return permissionID;
	}

	public void setPermissionID(String permissionID) {
		this.permissionID = permissionID;
	}

	public Date getCreatedDTTM() {
		return createdDTTM;
	}

	public void setCreatedDTTM(Date createdDTTM) {
		this.createdDTTM = createdDTTM;
	}

	public Date getLastUpdatedDTTM() {
		return lastUpdatedDTTM;
	}

	public void setLastUpdatedDTTM(Date lastUpdatedDTTM) {
		this.lastUpdatedDTTM = lastUpdatedDTTM;
	}

}
