package com.zy.controller.setclickaction;

import javax.swing.JFrame;
import com.zy.view.*;

public class InIndexPage {
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
}