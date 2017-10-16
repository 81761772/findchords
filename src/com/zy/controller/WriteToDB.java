package com.zy.controller;

import java.sql.*;
import com.zy.view.WarningPage;

public class WriteToDB{
	
	public void writeToDB
	(String str1,String str2,String str3,String str4,String[] str5) throws SQLException{
		//ִ�����ݿ����Ӳ����շ���ֵ��
		Connection con = ConnectDB.connectDB();
	    PreparedStatement ps1;
	    PreparedStatement ps2;
		//����sql���
		ps1 = con.prepareStatement("insert into chords (name,author,pictureurl,radiourl,labelowner) values (?,?,?,?,?)");
		ps2 = con.prepareStatement("insert into labels values (?,?,?,?)");
		//Ϊͨ�����ֵ
		ps1.setString(1,str1);
		ps1.setString(2,str2);
		ps1.setString(3,str3);
		ps1.setString(4,str4);
		ps1.setString(5,str1);
		ps2.setString(1,str1);
		//���Ǳ�ǩ��ѡ����
		if(str5.length==0){
			ps2.setString(2,"");
			ps2.setString(3,"");
			ps2.setString(4,"");
		}else if(str5.length==1){
			ps2.setString(2,str5[0]);
			ps2.setString(3,"");
			ps2.setString(4,"");
		}else if(str5.length==2){
			ps2.setString(2,str5[0]);
			ps2.setString(3,str5[1]);
			ps2.setString(4,"");
		}else if(str5.length==3){
			ps2.setString(2,str5[0]);
			ps2.setString(3,str5[1]);
			ps2.setString(4,str5[2]);
		}
		//ִ��sql���
		if((str1!=null)&&(str1!="")){
			try{
				ps1.executeUpdate();
				ps2.executeUpdate();		
				new WarningPage("����ɹ�");
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			new WarningPage("����ʧ��");
		}	
	}
}