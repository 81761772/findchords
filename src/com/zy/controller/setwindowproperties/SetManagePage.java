package com.zy.controller.setwindowproperties;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import com.zy.controller.setclickaction.InManagePage;
import com.zy.view.ManagePage;

public class SetManagePage {
	//设置框架属性
	public void setProperties(JFrame jframe){	
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jframe.setName("ManagePage");
		jframe.setTitle("findchords");
		jframe.setSize(500,519);
	}
	//设置窗口位置
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
		URL url = ManagePage.class.getResource("/com/zy/view/icon/icon.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		jframe.setIconImage(img);
	}
	//定义按钮属性
	public void setButtons(JFrame jframe,JButton jb1,JButton jb2,JButton jb3,JButton jb4,JTextField jtf1){	
		jb1.setBounds(0,0,30,30);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InManagePage.Back(jframe);
			}
		});
		URL url1 = ManagePage.class.getResource("/com/zy/view/icon/back.png");
		Icon icon1 = new ImageIcon(url1);
		jb1.setIcon(icon1);
		jb2.setBounds(454,0,30,30);
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				try {
					InManagePage.Search(jframe,jtf1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		URL url2 = ManagePage.class.getResource("/com/zy/view/icon/search.png");
		Icon icon2 = new ImageIcon(url2);
		jb2.setIcon(icon2);
		jb3.setBounds(0,30,500,225);
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InManagePage.Build(jframe);
			}
		});
		URL url3 = ManagePage.class.getResource("/com/zy/view/icon/build.png");
		Icon icon3 = new ImageIcon(url3);
		jb3.setIcon(icon3);
		jb4.setBounds(0,255,500,225);
		jb4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InManagePage.Edit(jframe);
			}
		});
		URL url4 = ManagePage.class.getResource("/com/zy/view/icon/edit.png");
		Icon icon4 = new ImageIcon(url4);
		jb4.setIcon(icon4);
	}
	//定义文本框属性
	public void setJTextFields(JTextField jtf1){	
		jtf1.setBounds(30,0,425,31);
	}
	//向容器中添加组件
	public void addComponents(Container con,JButton jb1,JButton jb2,JButton jb3,JButton jb4,JTextField jtf1){
		con.add(jb1);
		con.add(jb2);
		con.add(jb3);
		con.add(jb4);
		con.add(jtf1);
	}
}