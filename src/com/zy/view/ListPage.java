package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.SetListPage;

public class ListPage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//��ʼ��������
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JTextField jtf1 = new JTextField("�����������",400);
	JLabel jl1 = new JLabel("���");
	JLabel jl2 = new JLabel("����");
	JLabel jl3 = new JLabel("����");
	JLabel jl4 = new JLabel();
	JLabel jl5 = new JLabel();
	JLabel jl6 = new JLabel();
	JLabel jl7 = new JLabel();
	JLabel jl8 = new JLabel();
	JLabel jl9 = new JLabel();
	JLabel jl10 = new JLabel();
	JLabel jl11 = new JLabel();
	JLabel jl12 = new JLabel();
	//����com.zy.controller.windowproperties���е�SetListPage�๹�����ڡ�
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