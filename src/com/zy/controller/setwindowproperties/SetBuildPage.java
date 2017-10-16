package com.zy.controller.setwindowproperties;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import com.zy.controller.setclickaction.InBuildPage;
import com.zy.controller.setclickaction.InManagePage;
import com.zy.view.BuildPage;

public class SetBuildPage {
	//设置框架属性
	public void setProperties(JFrame jframe){		
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jframe.setName("BuildPage");
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
	public void setLayout(JFrame jframe,Container con){		
		jframe.setLayout(null);
		con.setBackground(Color.lightGray);
	}
	//设置窗体图标
	public void setWindowIcons(JFrame jframe){		
		URL url = BuildPage.class.getResource("/com/zy/view/icon/icon.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		jframe.setIconImage(img);
	}
	//定义按钮属性
	public void setButtons
	(JFrame jframe,JButton jb1,JButton jb2,JButton jb3,JButton jb4,JTextField jtf1,
			JTextField jtf2,JTextField jtf3,JTextArea jta1,JTextArea jta2,
			JComboBox<String> jcb1,JComboBox<String> jcb2,JComboBox<String> jcb3){	
		jb1.setBounds(0,0,30,30);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InBuildPage.Back(jframe);
			}
		});
		URL url1 = BuildPage.class.getResource("/com/zy/view/icon/back.png");
		Icon icon1 = new ImageIcon(url1);
		jb1.setIcon(icon1);
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
		jb2.setBounds(454,0,30,30);
		URL url2 = BuildPage.class.getResource("/com/zy/view/icon/search.png");
		Icon icon2 = new ImageIcon(url2);
		jb2.setIcon(icon2);
		jb3.setBounds(150,413,54,30);
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InBuildPage.Submit(jframe,jtf2,jtf3,jta1,jta2,jcb1,jcb2,jcb3);
			}
		});
		URL url3 = BuildPage.class.getResource("/com/zy/view/icon/submit.png");
		Icon icon3 = new ImageIcon(url3);
		jb3.setIcon(icon3);
		jb4.setBounds(280,413,54,30);
		jb4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InBuildPage.Reset(jframe);
			}
		});
		URL url4 = BuildPage.class.getResource("/com/zy/view/icon/reset.png");
		Icon icon4 = new ImageIcon(url4);
		jb4.setIcon(icon4);
	}
	//定义标签属性
	public void setLabels(JLabel jl1,JLabel jl2,JLabel jl3,JLabel jl4,JLabel jl5){		
		jl1.setBounds(30,50,40,40);
		jl1.setFont(new Font("微软雅黑",1,15));
		jl2.setBounds(30,100,40,40);
		jl2.setFont(new Font("微软雅黑",1,15));
		jl3.setBounds(30,150,40,40);
		jl3.setFont(new Font("微软雅黑",1,15));		
		jl4.setBounds(30,248,40,40);
		jl4.setFont(new Font("微软雅黑",1,15));		
		jl5.setBounds(206,333,80,40);
		jl5.setFont(new Font("微软雅黑",1,15));
	}
	//定义文本框属性
	public void setJTextFields(JTextField jtf1,JTextField jtf2,JTextField jtf3){			
		jtf1.setBounds(30,0,425,31);		
		jtf2.setBounds(90,56,305,31);		
		jtf3.setBounds(90,107,305,31);
	}
	//定义文本域属性
	public void setJTextAreas(JTextArea jta1,JTextArea jta2){		
		jta1.setBounds(90,157,305,80);
		jta1.setText("请输入本地图片url，最多输入1个url\n选填\n");
		jta1.setBounds(90,255,305,80);
		jta2.setText("请输入本地音频url，最多输入1个url\n选填");
	}
	//定义可滚动面板属性
	public void setJScrollPanes(JScrollPane jsp1,JScrollPane jsp2){	
		jsp1.setBounds(90,157,305,80);		
		jsp2.setBounds(90,255,305,80);
	}	
	//定义下拉列表框属性
	public void setJComboBoxes(JComboBox<String> jcb1,JComboBox<String> jcb2,JComboBox<String> jcb3){
		jcb1.setBounds(125,375,65,25);
		jcb2.setBounds(210,375,65,25);
		jcb3.setBounds(295,375,65,25);
	}
	//向容器中添加组件
	public void addComponents(Container con,JButton jb1,JButton jb2,JButton jb3,JButton jb4,
			JLabel jl1,JLabel jl2,JLabel jl3,JLabel jl4,JLabel jl5,
			JTextField jtf1,JTextField jtf2,JTextField jtf3,
			JScrollPane jsp1,JScrollPane jsp2,
			JComboBox<String> jcb1,JComboBox<String> jcb2,JComboBox<String> jcb3){	
		con.add(jb1);
		con.add(jb2);
		con.add(jb3);
		con.add(jb4);
		con.add(jl1);
		con.add(jl2);
		con.add(jl3);
		con.add(jl4);
		con.add(jl5);
		con.add(jtf1);
		con.add(jtf2);
		con.add(jtf3);
		con.add(jsp1);
		con.add(jsp2);
		con.add(jcb1);
		con.add(jcb2);
		con.add(jcb3);
	}	
}