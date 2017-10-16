package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.*;

public class MainWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*初始化相关组件，这里牵扯到值传递的问题：Java中只有值传递而没有引用传递，若将没有被
	  初始化的对象引用作为参数传递是改变不了对象的属性的。*/
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
    //利用com.zy.controller.windowproperties包中的SetMainWindow类构建窗口。
	public MainWindow(){
		SetMainWindow smw = new SetMainWindow();	
		smw.setLayout(this);
		smw.setWindowIcons(this);
		smw.setButtons(this, jb1, jb2, jb3);
		smw.setProperties(this);
		smw.makeWindowCenter(this);
	    smw.addComponents(con,jb1,jb2,jb3);
	}
	//主方法
	public static void main(String[] args){
		new MainWindow();
	}
}