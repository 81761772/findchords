package com.zy.controller.setclickaction;

import java.net.*;
import java.sql.SQLException;
import javax.swing.*;
import com.zy.controller.ReadFromDB2;
import com.zy.view.ChordPage;
import com.zy.view.IndexPage;

public class InListPage {	
	//按钮“返回”的鼠标响应
	public static void Back(JFrame jframe){
		jframe.dispose();
		try {
			new IndexPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//标签“JLabel4”的鼠标响应
	public static void JLabel5(String str3) throws SQLException, MalformedURLException{
		//在此处涉及url
		ReadFromDB2 rfdb2 = new ReadFromDB2(str3);
		String url = rfdb2.getURL();
		new ChordPage(url);
	}
}