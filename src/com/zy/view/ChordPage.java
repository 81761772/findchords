package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.SetChordPage;

public class ChordPage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//��ʼ�����
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JTextField jtf1 = new JTextField("�����������",400);
	JLabel jl1 = new JLabel();
	Canvas c = new Canvas();
	//����com.zy.controller.windowproperties���е�SetChordPage�๹�����ڡ�
	public ChordPage(String url){
		SetChordPage scp = new SetChordPage();
		scp.setLayout(this,con);
		scp.setWindowIcons(this);
		scp.setJTextFields(jtf1);
		scp.setButtons(this,jb1,jb2,jtf1);
		scp.setJLabels(jl1,url);
		scp.setProperties(this);
		scp.makeWindowCenter(this);
		scp.addComponents(con,jb1,jb2,jtf1,jl1);	
	}
}