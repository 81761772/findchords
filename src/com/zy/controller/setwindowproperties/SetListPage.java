package com.zy.controller.setwindowproperties;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import com.zy.controller.setclickaction.InListPage;
import com.zy.controller.setclickaction.InManagePage;
import com.zy.view.ListPage;

public class SetListPage {
	//…Ë÷√øÚº‹ Ù–‘
	public void setProperties(JFrame jframe){	
		jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setName("ListPage");
		jframe.setTitle("findchords");
		jframe.setSize(500,500);
	}
	//…Ë÷√¥∞ø⁄Œª÷√
	public void makeWindowCenter(JFrame jframe){
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		int windowWidth = jframe.getWidth();
		int windowHeight = jframe.getHeight();
		jframe.setLocation((width-windowWidth)/2,(height-windowHeight)/2);
	}
	//…Ë÷√≤ºæ÷
	public void setLayout(JFrame jframe,Container con){	
		jframe.setLayout(null);
		con.setBackground(Color.LIGHT_GRAY);
	}
	//…Ë÷√¥∞ÃÂÕº±Í
	public void setWindowIcons(JFrame jframe){		
		URL url = ListPage.class.getResource("/com/zy/view/icon/icon.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		jframe.setIconImage(img);
	}
	//…Ë÷√∞¥≈• Ù–‘
	public void setButtons(JFrame jframe,JButton jb1,JButton jb2,JTextField jtf1){
		jb1.setBounds(0,0,30,30);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				InListPage.Back(jframe);
			}
		});
		URL url1 = ListPage.class.getResource("/com/zy/view/icon/back.png");
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
		URL url2 = ListPage.class.getResource("/com/zy/view/icon/search.png");
		Icon icon2 = new ImageIcon(url2);
		jb2.setIcon(icon2);
	}
	//…Ë÷√Œƒ±æøÚ Ù–‘
	public void setJTextFields(JTextField jtf1){
		jtf1.setBounds(30,0,425,31);
	}
	//…Ë÷√±Í«© Ù–‘
	public void setJLabels
	(JLabel jl1,JLabel jl2,JLabel jl3,JLabel jl4,JLabel jl5,JLabel jl6,
			JLabel jl7,JLabel jl8,JLabel jl9,JLabel jl10,JLabel jl11,JLabel jl12,
			String str2,String str3,String str4){
		jl1.setBounds(40,5,50,100);
		jl1.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl2.setBounds(220,5,200,100);
		jl2.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl3.setBounds(410,5,100,100);
		jl3.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl4.setBounds(40,35,50,100);
		jl4.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl4.setText(str2);
		
		jl5.setBounds(150,35,200,100);
		jl5.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl5.setText(str3);
		jl5.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				try {
					InListPage.JLabel5(str3);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jl6.setBounds(380,35,100,100);
		jl6.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl6.setText(str4);
		jl7.setBounds(40,65,50,100);
		jl7.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl8.setBounds(150,65,200,100);
		jl8.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl9.setBounds(380,65,100,100);
		jl9.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl10.setBounds(40,95,50,100);
		jl10.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl11.setBounds(150,95,200,100);
		jl11.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		jl12.setBounds(380,95,100,100);
		jl12.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
	}
	//œÚ»›∆˜÷–ÃÌº”◊Èº˛
	public void addComponents
	(Container con,JButton jb1,JButton jb2,JTextField jtf1,
			JLabel jl1,JLabel jl2,JLabel jl3,JLabel jl4,JLabel jl5,
			JLabel jl6,JLabel jl7,JLabel jl8,JLabel jl9,JLabel jl10,
			JLabel jl11,JLabel jl12){
		con.add(jb1);
		con.add(jb2);
		con.add(jtf1);
		con.add(jl1);
		con.add(jl2);
		con.add(jl3);
		con.add(jl4);
		con.add(jl5);
		con.add(jl6);
		con.add(jl7);
		con.add(jl8);
		con.add(jl9);
		con.add(jl10);
		con.add(jl11);
		con.add(jl12);
	}
}