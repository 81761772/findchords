package com.zy.controller.setclickaction;

import javax.swing.JFrame;
import com.zy.view.*;

public class InMainWindow {
	//按钮“库”的鼠标响应
	public static void Repositories(JFrame jframe){
		jframe.dispose();
		new IndexPage();
	}
	//按钮“管理”的鼠标响应
	public static void Manage(JFrame jframe){
		jframe.dispose();
		new ManagePage();
	}
	//按钮“开发者选项”的鼠标响应
	public static void developerOptions(){
		new WarningPage("敬请期待！");
	}
}