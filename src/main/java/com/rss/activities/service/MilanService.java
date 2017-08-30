package com.rss.activities.service;

import java.util.Date;

public interface MilanService {
	public boolean addMilan();

	public boolean editMilanDetails();

	public boolean deleteMilan();

	public boolean addMilanSankhya(Date date, String milanID, int taruna, int balaka, int shishu, int anya,
			String comments);

	public boolean editMilanSankhya(Date date, String milanID, int taruna, int balaka, int shishu, int anya,
			String comments);
}
