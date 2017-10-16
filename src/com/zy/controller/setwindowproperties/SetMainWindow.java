package com.zy.controller.setwindowproperties;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import com.zy.controller.setclickaction.InMainWindow;
import com.zy.view.MainWindow;

public class SetMainWindow {
	//设置框架属性
	public void setProperties(JFrame jframe){	
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jframe.setName("MainWindow");
		jframe.setTitle("findchords");
		jframe.setSize(500,500);
	}
	//设置窗体位置
	public void makeWindowCenter(JFrame jframe){	
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		int windowWidth = jframe.getWidth();
		int windowHeight = jframe.getHeight();
		jframe.setLocation((width-windowWidth)/2,(height-windowHeight)/2);
	}
	//设置布局
	public void setLayout(JFrame jframe){
		jframe.setLayout(null);
	}
	//设置窗体图标
	public void setWindowIcons(JFrame jframe){
		URL url = MainWindow.class.getResource("/com/zy/view/icon/icon.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		jframe.setIconImage(img);
	}
	//定义按钮属性
	public void setButtons(JFrame jframe,JButton jb1,JButton jb2,JButton jb3){
		jb1.setBounds(0,0,309,309);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InMainWindow.Repositories(jframe);
			}
		});
		URL url1 = MainWindow.class.getResource("/com/zy/view/icon/repositories.png");
		Icon icon1 = new ImageIcon(url1);
		jb1.setIcon(icon1);
		jb2.setBounds(309,0,191,309);
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InMainWindow.Manage(jframe);
			}
		});
		URL url2 = MainWindow.class.getResource("/com/zy/view/icon/manage.png");
		Icon icon2 = new ImageIcon(url2);
		jb2.setIcon(icon2);
		jb3.setBounds(0,309,500,191);
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InMainWindow.developerOptions();
			}
		});
		URL url3 = MainWindow.class.getResource("/com/zy/view/icon/DeveloperOptions.png");
		Icon icon3 = new ImageIcon(url3);
		jb3.setIcon(icon3);
	}
	//向容器中添加组件
	public void addComponents(Container con,JButton jb1,JButton jb2,JButton jb3){
		con.add(jb1);
		con.add(jb2);
		con.add(jb3);
	}
}