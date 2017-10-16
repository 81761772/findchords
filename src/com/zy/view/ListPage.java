package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.SetListPage;

public class ListPage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//初始化相关组件
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JTextField jtf1 = new JTextField("请输入歌曲名",400);
	JLabel jl1 = new JLabel("编号");
	JLabel jl2 = new JLabel("标题");
	JLabel jl3 = new JLabel("作者");
	JLabel jl4 = new JLabel();
	JLabel jl5 = new JLabel();
	JLabel jl6 = new JLabel();
	JLabel jl7 = new JLabel();
	JLabel jl8 = new JLabel();
	JLabel jl9 = new JLabel();
	JLabel jl10 = new JLabel();
	JLabel jl11 = new JLabel();
	JLabel jl12 = new JLabel();
	//利用com.zy.controller.windowproperties包中的SetListPage类构建窗口。
	public ListPage(String str2,String str3,String str4){
		SetListPage slp = new SetListPage();
		slp.setLayout(this,con);
		slp.setWindowIcons(this);
		slp.setJTextFields(jtf1);
		slp.setButtons(this,jb1,jb2,jtf1);	
		slp.setJLabels(jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,str2,str3,str4);
		slp.setProperties(this);
		slp.makeWindowCenter(this);
		slp.addComponents(con,jb1,jb2,jtf1,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12);	
	}
}