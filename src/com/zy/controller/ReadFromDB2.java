package com.zy.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadFromDB2 {
	//初始化sql语句
	PreparedStatement ps1;
	ResultSet rs1;
	String url;
	//执行sql语句
	public ReadFromDB2(String str2) throws SQLException{
		Connection con = ConnectDB.connectDB();	
		ps1 = con.prepareStatement("select pictureurl from chords where name = ?");
		ps1.setString(1,str2);
	    rs1 = ps1.executeQuery();	    
	    while(rs1.next()){
	    	url = rs1.getString("pictureurl");
	    }
	    rs1.close();
	}
	//提供获取url方法
	public String getURL(){
		return url;
	}
}