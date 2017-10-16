package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.SetIndexPage;

public class IndexPage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//初始化组件
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JButton jb4 = new JButton();
	JButton jb5 = new JButton();
	JButton jb6 = new JButton();
	JButton jb7 = new JButton();
	JButton jb8 = new JButton();
	JButton jb9 = new JButton();
	JButton jb10 = new JButton();
	JButton jb11 = new JButton();
	JButton jb12 = new JButton();
	JButton jb13 = new JButton();
	JButton jb14 = new JButton();
	JButton jb15 = new JButton();
	JButton jb16 = new JButton();
	JButton jb17 = new JButton();
	JButton jb18 = new JButton();
	JButton jb19 = new JButton();
	JButton jb20 = new JButton();
	JButton jb21 = new JButton();
	JButton jb22 = new JButton();
	JButton jb23 = new JButton();
	JTextField jtf1 = new JTextField("请输入歌曲名");
	JLabel jl1 = new JLabel("语种");
	JLabel jl2 = new JLabel("情感");
	JLabel jl3 = new JLabel("风格");
	//利用com.zy.controller.windowproperties包中的SetIndexPage类构建窗口。
	public IndexPage(){	
		SetIndexPage sip = new SetIndexPage();
		sip.setLayout(this,con);
		sip.setWindowIcons(this);
		sip.setJTextFields(jtf1);
		sip.setButtons(this,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,
				jb11,jb12,jb13,jb14,jb15,jb16,jb17,jb18,jb19,jb20,jb21,jb22,jb23,jtf1);
		sip.setLabels(jl1,jl2,jl3);		
		sip.setProperties(this);
		sip.makeWindowCenter(this);
		sip.addComponents(con,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,
				jb11,jb12,jb13,jb14,jb15,jb16,jb17,jb18,jb19,jb20,jb21,jb22,jb23,
				jtf1,jl1,jl2,jl3);		
	}
}