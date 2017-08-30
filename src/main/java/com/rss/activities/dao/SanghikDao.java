package com.rss.activities.dao;

public interface SanghikDao {
	public boolean changeSanghikTime(String startTime, String endTime);

	public boolean changeSanghikLocation(String newLocation);
}
