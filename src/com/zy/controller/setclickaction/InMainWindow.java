package com.zy.controller.setclickaction;

import javax.swing.JFrame;
import com.zy.view.*;

public class InMainWindow {
	//��ť���⡱�������Ӧ
	public static void Repositories(JFrame jframe){
		jframe.dispose();
		new IndexPage();
	}
	//��ť�������������Ӧ
	public static void Manage(JFrame jframe){
		jframe.dispose();
		new ManagePage();
	}
	//��ť��������ѡ��������Ӧ
	public static void developerOptions(){
		new WarningPage("�����ڴ���");
	}
}