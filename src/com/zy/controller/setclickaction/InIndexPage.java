package com.zy.controller.setclickaction;

import javax.swing.JFrame;
import com.zy.view.*;

public class InIndexPage {
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
}