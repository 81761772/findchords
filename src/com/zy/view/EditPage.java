package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.SetEditPage;

public class EditPage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    //初始化相关组件
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JLabel jl1 = new JLabel("编号");
	JTextField jtf1 = new JTextField("请输入歌曲名");
	JTextField jtf2 = new JTextField();
	//利用com.zy.controller.windowproperties包中的SetEditPage类构建窗口。
	public EditPage(){
		SetEditPage sep = new SetEditPage();
		sep.setLayout(this,con);
		sep.setWindowIcons(this);
		sep.setJTextFields(jtf1,jtf2);
		sep.setButtons(this,jb1,jb2,jb3,jtf1,jtf2);
		sep.setJLabels(jl1);
		sep.setProperties(this);
		sep.makeWindowCenter(this);
		sep.addComponents(con,jb1,jb2,jb3,jl1,jtf1,jtf2);
	}
}
