package com.rss.activities.service;

import java.util.Date;

public interface MandaliService {
	public boolean addMandali();

	public boolean editMandaliDetails();

	public boolean deleteMandali();

	public boolean addMandaliSankhya(Date date, String mandaliID, int taruna, int balaka, int shishu, int anya,
			String comments);

	public boolean editMandaliSankhya(Date date, String mandaliID, int taruna, int balaka, int shishu, int anya,
			String comments);
}
