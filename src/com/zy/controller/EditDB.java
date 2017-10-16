package com.zy.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.zy.view.WarningPage;

public class EditDB {
	//初始化sql语句
	PreparedStatement ps1;
    PreparedStatement ps2;
    PreparedStatement ps3;
    ResultSet rs1;
	ResultSet rs2;
	ResultSet rs3;
	String str2;
    //执行sql语句
	public EditDB(Integer i){
		Connection con = ConnectDB.connectDB();
	    try{
	    	ps1 = con.prepareStatement("select name from chords where id=?");
		    ps1.setInt(1,i);
		    rs1 = ps1.executeQuery();
		    while(rs1.next()){
		    	str2 = rs1.getString("name");
		    }
		    ps2 = con.prepareStatement("delete from labels where labelowner=?");
		    ps2.setString(1,str2);
		    ps2.executeUpdate();
		    ps3 = con.prepareStatement("delete from chords where id=?");
		    ps3.setInt(1,i);
		    ps3.executeUpdate();
		    new WarningPage("修改成功");
	    }catch(Exception e){
	    	new WarningPage("修改失败");
	    }
	}	
}