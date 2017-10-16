package com.zy.controller;

import java.sql.*;

public class ReadFromDB1 {
	//初始化sql语句
	PreparedStatement ps1;
	PreparedStatement ps2;
	ResultSet rs1;
	ResultSet rs2;
	String id;
	String name;
	String author;
	String pictureurl;
	String radiourl;
	String label1;
	String label2;
	String label3;
	
	public ReadFromDB1(String str1) throws SQLException{
		//执行数据库连接并将返回值传递给该类。
		Connection con = ConnectDB.connectDB();	
		//执行查询操作
		ps1 = con.prepareStatement("select * from chords where name = ?");
		ps1.setString(1,str1);
	    rs1 = ps1.executeQuery();
	    ps2 = con.prepareStatement("select * from labels where labelowner = ?");
		ps2.setString(1,str1);
	    rs2 = ps2.executeQuery();
	    //从结果集中获取数据并打包成数组
	    while(rs1.next()){
	    	id = rs1.getString("id");
	    	name = rs1.getString("name");
	    	author = rs1.getString("author");   	
	    }
	    rs1.close();
	}
	//提供package1获取方法
	public String[] getPackage1(){
		String[] package1 = {id,name,author};
		return package1;
	}
	//提供package2获取方法
	public String[] getPackage2(){
		String[] package2 = {pictureurl,radiourl,label1,label2,label3};
		return package2;
	}	
}