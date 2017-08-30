package com.rss.activities.service;

import java.util.Date;

public interface SanghikService {
	public boolean addSanghikSankhya(Date date,String sanghikID, int taruna, int balaka, int shishu, int anya, String comments);

	public boolean editSanghikSankhya(Date date,String sanghikID, int taruna, int balaka, int shishu, int anya, String comments);
}
