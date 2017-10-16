package com.zy.controller.setclickaction;

import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.zy.controller.WriteToDB;
import com.zy.view.*;

public class InBuildPage {
	//按钮“返回”的鼠标响应
	public static void Back(JFrame jframe){
		jframe.dispose();
		new ManagePage();
	}
	//按钮“提交”的鼠标响应
	public static void Submit(JFrame jframe,JTextField jtf1,JTextField jtf2,
			JTextArea jta1,JTextArea jta2,
			JComboBox<String> jcb1,JComboBox<String> jcb2,JComboBox<String> jcb3){
		String str1 = jtf1.getText().trim();
		String str2 = jtf2.getText().trim();
		String str3 = jta1.getText().trim();
		//!!!!!!!!!这种方法可能有错
		String str4 = jta2.getText().trim();
		String str5 = jcb1.getSelectedItem().toString();
		String str6 = jcb2.getSelectedItem().toString();
		String str7 = jcb3.getSelectedItem().toString();
		String[] str8 = {str5,str6,str7};
		//调用写入数据库方法
		try {
			new WriteToDB().writeToDB(str1,str2,str3,str4,str8);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//按钮“重置”的鼠标响应
	public static void Reset(JFrame jframe){
		jframe.dispose();
		new BuildPage();
	}	
}