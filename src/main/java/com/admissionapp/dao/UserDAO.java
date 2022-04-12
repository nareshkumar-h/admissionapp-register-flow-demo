package com.admissionapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.admissionapp.util.ConnectionUtil;

public class UserDAO {

	public String register(String name, String email, String password) {
		String result = null;
		Connection con=ConnectionUtil.getConnection();
		System.out.println("con" + con);
		
		String sql="insert into users(name,email,password)values(?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, password);
			int rows = pst.executeUpdate();
			System.out.println(rows);
			if(rows == 1) {
				result = "success";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			result = "failure";
			result = e.getMessage();
		}
		return result;
	}


}
