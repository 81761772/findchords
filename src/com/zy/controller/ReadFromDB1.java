package com.zy.controller;

import java.sql.*;

public class ReadFromDB1 {
	//��ʼ��sql���
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
		//ִ�����ݿ����Ӳ�������ֵ���ݸ����ࡣ
		Connection con = ConnectDB.connectDB();	
		//ִ�в�ѯ����
		ps1 = con.prepareStatement("select * from chords where name = ?");
		ps1.setString(1,str1);
	    rs1 = ps1.executeQuery();
	    ps2 = con.prepareStatement("select * from labels where labelowner = ?");
		ps2.setString(1,str1);
	    rs2 = ps2.executeQuery();
	    //�ӽ�����л�ȡ���ݲ����������
	    while(rs1.next()){
	    	id = rs1.getString("id");
	    	name = rs1.getString("name");
	    	author = rs1.getString("author");   	
	    }
	    rs1.close();
	}
	//�ṩpackage1��ȡ����
	public String[] getPackage1(){
		String[] package1 = {id,name,author};
		return package1;
	}
	//�ṩpackage2��ȡ����
	public String[] getPackage2(){
		String[] package2 = {pictureurl,radiourl,label1,label2,label3};
		return package2;
	}	
}