package com.zy.controller;

import java.sql.*;

public class ConnectDB {
	//�÷���ΪReadFromDB1,ReadFromDB2��WriteToDB�ṩ֧�֡�
	public static Connection connectDB(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
            System.out.println("���ݿ��������سɹ�");
		}catch(ClassNotFoundException e){
			System.out.println("���ݿ���������ʧ��");
		}
		try{
			con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/findchords?useSSL=true",
					 "root","123456789");
			System.out.println("���ݿ����ӳɹ�");
		}catch(SQLException e){
			System.out.println("���ݿ�����ʧ��");
		}
		return con;
	}
	public static void main(String[] args){
		new ConnectDB();
		ConnectDB.connectDB();
	}
}