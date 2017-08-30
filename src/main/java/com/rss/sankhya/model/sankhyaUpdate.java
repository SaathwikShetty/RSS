package com.rss.sankhya.model;

import java.util.Date;

public class sankhyaUpdate {
	private Date date;
	private String activityID;
	private int Taruna;
	private int balaka;
	private int shishu;
	private int totalSankhya;
	private int anya;
	private String comments;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getActivityID() {
		return activityID;
	}

	public void setActivityID(String activityID) {
		this.activityID = activityID;
	}

	public int getTaruna() {
		return Taruna;
	}

	public void setTaruna(int taruna) {
		Taruna = taruna;
	}

	public int getBalaka() {
		return balaka;
	}

	public void setBalaka(int balaka) {
		this.balaka = balaka;
	}

	public int getShishu() {
		return shishu;
	}

	public void setShishu(int shishu) {
		this.shishu = shishu;
	}

	public int getTotalSankhya() {
		return totalSankhya;
	}

	public void setTotalSankhya(int totalSankhya) {
		this.totalSankhya = totalSankhya;
	}

	public int getAnya() {
		return anya;
	}

	public void setAnya(int anya) {
		this.anya = anya;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
