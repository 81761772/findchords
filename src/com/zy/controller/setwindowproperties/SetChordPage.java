package com.zy.controller.setwindowproperties;

import java.awt.Color;
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
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import com.zy.controller.setclickaction.InChordPage;
import com.zy.controller.setclickaction.InManagePage;
import com.zy.view.ChordPage;

public class SetChordPage {	
	//设置框架属性
	public void setProperties(JFrame jframe){	
		jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setName("ChordPage");
		jframe.setTitle("findchords");
		jframe.setSize(850,1000);
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
	public void setLayout(JFrame jframe,Container con){	
		jframe.setLayout(null);
		con.setBackground(Color.LIGHT_GRAY);
	}
	//设置窗体图标
	public void setWindowIcons(JFrame jframe){		
		URL url = ChordPage.class.getResource("/com/zy/view/icon/icon.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		jframe.setIconImage(img);
	}
	//设置按钮属性
	public void setButtons(JFrame jframe,JButton jb1,JButton jb2,JTextField jtf1){
		jb1.setBounds(0,0,30,30);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InChordPage.Back(jframe);
			}
		});
		URL url1 = ChordPage.class.getResource("/com/zy/view/icon/back.png");
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
		URL url2 = ChordPage.class.getResource("/com/zy/view/icon/search.png");
		Icon icon2 = new ImageIcon(url2);
		jb2.setIcon(icon2);
	}
    //设置文本框属性
	public void setJTextFields(JTextField jtf1){
		jtf1.setBounds(30,0,425,31);
	}
	//设置标签属性
	public void setJLabels(JLabel jl1,String url){
		jl1.setBounds(50,50,750,950);
		ImageIcon icon = new ImageIcon(url);
		jl1.setIcon(icon);
	}
    //为容器添加组件
	public void addComponents
	(Container con,JButton jb1,JButton jb2,JTextField jtf1,JLabel jl1){
		con.add(jb1);
		con.add(jb2);
		con.add(jtf1);
		con.add(jl1);
	}
}