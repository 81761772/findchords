package com.zy.controller.setclickaction;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTextField;
import com.zy.view.*;
import com.zy.controller.ReadFromDB1;

public class InManagePage {
	//按钮“返回”的鼠标响应
	public static void Back(JFrame jframe){
		jframe.dispose();
		try {
			new MainWindow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//按钮“搜索”的鼠标响应
	public static void Search(JFrame jframe,JTextField jtf1) throws SQLException{
		jframe.dispose();
		//在显示ListPage之前需要从数据库调取正确的数据,需要读取文本框
		//需要设置ListPage()的构造方法，以方便通过传入参数动态地生成列表
		String str1 = jtf1.getText().trim();
		ReadFromDB1 rfdb1 = new ReadFromDB1(str1);
		String[] package1 = rfdb1.getPackage1();
		String str2 = package1[0];
		String str3 = package1[1];
		String str4 = package1[2];
		new ListPage(str2,str3,str4);
	}
	//按钮“新建”的鼠标响应
	public static void Build(JFrame jframe){
		jframe.dispose();
		new BuildPage();
	}
	//按钮“修改”的鼠标响应
	public static void Edit(JFrame jframe){
		jframe.dispose();
		new EditPage();
	}
}