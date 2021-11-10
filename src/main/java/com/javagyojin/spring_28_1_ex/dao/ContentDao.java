package com.javagyojin.spring_28_1_ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javagyojin.spring_28_1_ex.dto.ContentDto;

public class ContentDao {

//	JdbcTemplate template;
//
//	@Autowired
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//	}

	public ContentDao( ) {
		
	}

//	@Override
//	public ArrayList<ContentDto> listDao() {
//		// TODO Auto-generated method stub
//		String query = "select * from board order by mId desc";
//		ArrayList<ContentDto> dtos = (ArrayList<ContentDto>) template.query(query, new BeanPropertyRowMapper<ContentDto>(ContentDto.class));
//				
//		return dtos;
//	}
//
//	@Override
//	public void writeDao(final String mWriter, final String mContent) {
//		// TODO Auto-generated method stub
//		
//		
//		
//		this.template.update(new PreparedStatementCreator() {
//			
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				// TODO Auto-generated method stub
//				String query = "insert into board (mId, mWriter, mContent) values (board_seq.nextval, ?, ?)";
//				PreparedStatement pstmt = con.prepareStatement(query);
//				pstmt.setString(1, mWriter);
//				pstmt.setString(2, mContent);
//				return pstmt;
//			}
//		});
//	}
//
//	@Override
//	public void deleteDao(final String mId) {
//		// TODO Auto-generated method stub
//		String query = "delete from board where mId = ?";
//		this.template.update(query, new PreparedStatementSetter() {
//			
//			@Override
//			public void setValues(PreparedStatement ps) throws SQLException {
//				// TODO Auto-generated method stub
//				ps.setInt(1, Integer.parseInt(mId));
//			}
//			
//					
//				
//	});
//		
//		
//		
//		
//	}

	
	
	
	
	
}
