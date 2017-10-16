package com.zy.view;

import java.awt.*;
import javax.swing.*;

public class WarningPage extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//初始化组件
	Container con;
	JLabel jl1;
	//构造窗口
	public WarningPage(String str){	
		setLayout();
		setJLabels(str);
		setProperties();
		makeWindowCenter();
		addComponents();	
	}
	//设置框架属性
	public void setProperties(){	
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		setName("WarningPage1");
		setTitle("Warning");
		setSize(100,80);
	}
	//设置窗口位置
	public void makeWindowCenter(){	
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		int windowWidth = this.getWidth();
		int windowHeight = this.getHeight();
		this.setLocation((width-windowWidth)/2,(height-windowHeight)/2);
	}
	//设置布局
	public void setLayout(){		
		setLayout(null);
		con = getContentPane();
	}
	//设置标签属性
	public void setJLabels(String str){
		jl1 = new JLabel(str);
		jl1.setBounds(30,5,65,30);
	}
	//向容器添加组件
	public void addComponents(){
		con.add(jl1);
	}
}