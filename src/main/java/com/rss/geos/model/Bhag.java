package com.rss.geos.model;

import java.util.Date;

public class Bhag {
	private int bhagaID;
	private String bhagaName;
	private Date createdDateTime;

	public int getBhagaID() {
		return bhagaID;
	}

	public void setBhagaID(int bhagaID) {
		this.bhagaID = bhagaID;
	}

	public String getBhagaName() {
		return bhagaName;
	}

	public void setBhagaName(String bhagaName) {
		this.bhagaName = bhagaName;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

}
