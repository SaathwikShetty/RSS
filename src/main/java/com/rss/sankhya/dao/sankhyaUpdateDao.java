package com.rss.sankhya.dao;

import com.rss.sankhya.model.sankhyaUpdate;

public interface sankhyaUpdateDao {
	public boolean updateShakhaSankhya(sankhyaUpdate updateData);

	public boolean updateSanghikSankhya(sankhyaUpdate updateData);

	public boolean updateMilanSankhya(sankhyaUpdate updateData);

	public boolean updateMandaliaSankhya(sankhyaUpdate updateData);

	public boolean addShakhaSankhya(sankhyaUpdate updateData);

	public boolean addSanghikSankhya(sankhyaUpdate updateData);

	public boolean addMilanSankhya(sankhyaUpdate updateData);

	public boolean addMandaliSankhya(sankhyaUpdate updateData);
}
