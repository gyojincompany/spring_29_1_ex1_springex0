package com.javagyojin.spring_28_1_ex.dao;

import java.util.ArrayList;

import com.javagyojin.spring_28_1_ex.dto.ContentDto;

public interface IDao {
	
	public ArrayList<ContentDto> listDao();
	public void writeDao(String mWriter, String mContent);
	public void deleteDao(String bId);	

}
