package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.SetManagePage;

public class ManagePage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//初始化相关组件
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JButton jb4 = new JButton();
	JTextField jtf1 = new JTextField("请输入歌曲名",400);
	//利用com.zy.controller.windowproperties包中的SetManagePage类构建窗口。
	public ManagePage(){
		SetManagePage smp = new SetManagePage();
		smp.setLayout(this);
		smp.setWindowIcons(this);
		smp.setJTextFields(jtf1);
		smp.setButtons(this,jb1,jb2,jb3,jb4,jtf1);
		smp.setProperties(this);
		smp.makeWindowCenter(this);
		smp.addComponents(con,jb1,jb2,jb3,jb4,jtf1);
	}
}
