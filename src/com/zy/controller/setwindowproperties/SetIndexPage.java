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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import com.zy.controller.setclickaction.InIndexPage;
import com.zy.controller.setclickaction.InManagePage;
import com.zy.view.BuildPage;
import com.zy.view.IndexPage;

public class SetIndexPage {
	//设置框架属性
	public void setProperties(JFrame jframe){		
		jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setName("BuildPage");
		jframe.setTitle("findchords");
		jframe.setSize(500,500);
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
		con.setBackground(Color.white);
	}
	//设置窗体图标
	public void setWindowIcons(JFrame jframe){		
		URL url = IndexPage.class.getResource("/com/zy/view/icon/icon.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		jframe.setIconImage(img);
	}	
	//定义按钮属性
	public void setButtons(JFrame jframe,JButton jb1,JButton jb2,JButton jb3,JButton jb4,JButton jb5,
			JButton jb6,JButton jb7,JButton jb8,JButton jb9,JButton jb10,JButton jb11,
			JButton jb12,JButton jb13,JButton jb14,JButton jb15,JButton jb16,JButton jb17,
			JButton jb18,JButton jb19,JButton jb20,JButton jb21,JButton jb22,JButton jb23,JTextField jtf1){		
		jb1.setBounds(0,0,30,30);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InIndexPage.Back(jframe);
			}
		});
		URL url1 = IndexPage.class.getResource("/com/zy/view/icon/back.png");
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
		URL url2 = IndexPage.class.getResource("/com/zy/view/icon/search.png");
		Icon icon2 = new ImageIcon(url2);
		jb2.setIcon(icon2);		
		jb3.setBounds(145,75,54,30);
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url3 = IndexPage.class.getResource("/com/zy/view/icon/chinese.png");
		Icon icon3 = new ImageIcon(url3);
		jb3.setIcon(icon3);		
		jb4.setBounds(265,75,54,30);
		jb4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url4 = IndexPage.class.getResource("/com/zy/view/icon/english.png");
		Icon icon4 = new ImageIcon(url4);
		jb4.setIcon(icon4);		
		jb5.setBounds(385,75,54,30);
		jb5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url5 = IndexPage.class.getResource("/com/zy/view/icon/smalllanguage.png");
		Icon icon5 = new ImageIcon(url5);
		jb5.setIcon(icon5);		
		jb6.setBounds(145,125,54,30);
		jb6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url6 = IndexPage.class.getResource("/com/zy/view/icon/happy.png");
		Icon icon6 = new ImageIcon(url6);
		jb6.setIcon(icon6);		
		jb7.setBounds(265,125,54,30);
		jb7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url7 = IndexPage.class.getResource("/com/zy/view/icon/sad.png");
		Icon icon7 = new ImageIcon(url7);
		jb7.setIcon(icon7);		
		jb8.setBounds(385,125,54,30);
		jb8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url8 = IndexPage.class.getResource("/com/zy/view/icon/excited.png");
		Icon icon8 = new ImageIcon(url8);
		jb8.setIcon(icon8);		
		jb9.setBounds(145,175,54,30);
		jb9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url9 = IndexPage.class.getResource("/com/zy/view/icon/nostalgia.png");
		Icon icon9 = new ImageIcon(url9);
		jb9.setIcon(icon9);		
		jb10.setBounds(265,175,54,30);
		jb10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url10 = IndexPage.class.getResource("/com/zy/view/icon/romantic.png");
		Icon icon10 = new ImageIcon(url10);
		jb10.setIcon(icon10);		
		jb11.setBounds(385,175,54,30);
		jb11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url11 = IndexPage.class.getResource("/com/zy/view/icon/fight.png");
		Icon icon11 = new ImageIcon(url11);
		jb11.setIcon(icon11);		
		jb12.setBounds(145,225,54,30);
		jb12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url12 = IndexPage.class.getResource("/com/zy/view/icon/jazz.png");
		Icon icon12 = new ImageIcon(url12);
		jb12.setIcon(icon12);	
		jb13.setBounds(265,225,54,30);
		jb13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url13 = IndexPage.class.getResource("/com/zy/view/icon/rocknroll.png");
		Icon icon13 = new ImageIcon(url13);
		jb13.setIcon(icon13);		
		jb14.setBounds(385,225,54,30);
		jb14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url14 = IndexPage.class.getResource("/com/zy/view/icon/folk.png");
		Icon icon14 = new ImageIcon(url14);
		jb14.setIcon(icon14);		
		jb15.setBounds(145,275,54,30);
		jb15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url15 = IndexPage.class.getResource("/com/zy/view/icon/classical.png");
		Icon icon15 = new ImageIcon(url15);
		jb15.setIcon(icon15);		
		jb16.setBounds(265,275,54,30);
		jb16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url16 = IndexPage.class.getResource("/com/zy/view/icon/country.png");
		Icon icon16 = new ImageIcon(url16);
		jb16.setIcon(icon16);	
		jb17.setBounds(385,275,54,30);
		jb17.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url17 = IndexPage.class.getResource("/com/zy/view/icon/reggae.png");
		Icon icon17 = new ImageIcon(url17);
		jb17.setIcon(icon17);		
		jb18.setBounds(145,325,54,30);
		jb18.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url18 = IndexPage.class.getResource("/com/zy/view/icon/rap.png");
		Icon icon18 = new ImageIcon(url18);
		jb18.setIcon(icon18);		
		jb19.setBounds(265,325,54,30);
		jb19.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url19 = IndexPage.class.getResource("/com/zy/view/icon/music.png");
		Icon icon19 = new ImageIcon(url19);
		jb19.setIcon(icon19);		
		jb20.setBounds(385,325,54,30);
		jb20.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url20 = BuildPage.class.getResource("/com/zy/view/icon/funk.png");
		Icon icon20 = new ImageIcon(url20);
		jb20.setIcon(icon20);		
		jb21.setBounds(145,375,54,30);
		jb21.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url21 = IndexPage.class.getResource("/com/zy/view/icon/national.png");
		Icon icon21 = new ImageIcon(url21);
		jb21.setIcon(icon21);		
		jb22.setBounds(265,375,54,30);
		jb22.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url22 = IndexPage.class.getResource("/com/zy/view/icon/electronic.png");
		Icon icon22 = new ImageIcon(url22);
		jb22.setIcon(icon22);
		jb23.setBounds(385,375,54,30);
		jb23.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			}
		});
		URL url23 = IndexPage.class.getResource("/com/zy/view/icon/blues.png");
		Icon icon23 = new ImageIcon(url23);
		jb23.setIcon(icon23);
	}
	//定义文本域属性
	public void setJTextFields(JTextField jtf1){
		jtf1.setBounds(30,0,425,31);
	}
	//定义标签属性
	public void setLabels(JLabel jl1,JLabel jl2,JLabel jl3){
		jl1.setBounds(60,70,40,40);
		jl1.setFont(new Font("微软雅黑",1,15));
		jl2.setBounds(60,120,40,40);
		jl2.setFont(new Font("微软雅黑",1,15));
		jl3.setBounds(60,220,40,40);
		jl3.setFont(new Font("微软雅黑",1,15));
	}
	//向容器中添加组件
	public void addComponents(Container con,JButton jb1,JButton jb2,JButton jb3,JButton jb4,JButton jb5,
			JButton jb6,JButton jb7,JButton jb8,JButton jb9,JButton jb10,JButton jb11,
			JButton jb12,JButton jb13,JButton jb14,JButton jb15,JButton jb16,JButton jb17,
			JButton jb18,JButton jb19,JButton jb20,JButton jb21,JButton jb22,JButton jb23,
			JTextField jtf1,JLabel jl1,JLabel jl2,JLabel jl3){
		con.add(jb1);
		con.add(jb2);
		con.add(jb3);
		con.add(jb4);
		con.add(jb5);
		con.add(jb6);
		con.add(jb7);
		con.add(jb8);
		con.add(jb9);
		con.add(jb10);
		con.add(jb11);
		con.add(jb12);
		con.add(jb13);
		con.add(jb14);
		con.add(jb15);
		con.add(jb16);
		con.add(jb17);
		con.add(jb18);
		con.add(jb19);
		con.add(jb20);
		con.add(jb21);
		con.add(jb22);
		con.add(jb23);
		con.add(jtf1);
		con.add(jl1);
		con.add(jl2);
		con.add(jl3);
	}	
}