package com.zy.controller.setclickaction;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTextField;
import com.zy.view.*;
import com.zy.controller.ReadFromDB1;

public class InManagePage {
	//��ť�����ء��������Ӧ
	public static void Back(JFrame jframe){
		jframe.dispose();
		try {
			new MainWindow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��ť���������������Ӧ
	public static void Search(JFrame jframe,JTextField jtf1) throws SQLException{
		jframe.dispose();
		//����ʾListPage֮ǰ��Ҫ�����ݿ��ȡ��ȷ������,��Ҫ��ȡ�ı���
		//��Ҫ����ListPage()�Ĺ��췽�����Է���ͨ�����������̬�������б�
		String str1 = jtf1.getText().trim();
		ReadFromDB1 rfdb1 = new ReadFromDB1(str1);
		String[] package1 = rfdb1.getPackage1();
		String str2 = package1[0];
		String str3 = package1[1];
		String str4 = package1[2];
		new ListPage(str2,str3,str4);
	}
	//��ť���½����������Ӧ
	public static void Build(JFrame jframe){
		jframe.dispose();
		new BuildPage();
	}
	//��ť���޸ġ��������Ӧ
	public static void Edit(JFrame jframe){
		jframe.dispose();
		new EditPage();
	}
}