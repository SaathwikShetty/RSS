package com.rss.activities.service;

import java.util.Date;

public interface ShakhaService {
	public boolean addShakha();

	public boolean editShakhaDetails();

	public boolean deleteShakha();

	public boolean addShakhaSankhya(Date date, String shakhaID, int taruna, int balaka, int shishu, int anya,
			String comments);

	public boolean editShakhaSankhya(Date date, String shakhaID, int taruna, int balaka, int shishu, int anya,
			String comments);

}
