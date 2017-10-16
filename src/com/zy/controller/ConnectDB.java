package com.zy.controller;

import java.sql.*;

public class ConnectDB {
	//该方法为ReadFromDB1,ReadFromDB2和WriteToDB提供支持。
	public static Connection connectDB(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
		}catch(ClassNotFoundException e){
			System.out.println("数据库驱动加载失败");
		}
		try{
			con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/findchords?useSSL=true",
					 "root","123456789");
			System.out.println("数据库连接成功");
		}catch(SQLException e){
			System.out.println("数据库连接失败");
		}
		return con;
	}
	public static void main(String[] args){
		new ConnectDB();
		ConnectDB.connectDB();
	}
}