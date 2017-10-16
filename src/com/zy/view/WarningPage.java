package com.zy.view;

import java.awt.*;
import javax.swing.*;

public class WarningPage extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//��ʼ�����
	Container con;
	JLabel jl1;
	//���촰��
	public WarningPage(String str){	
		setLayout();
		setJLabels(str);
		setProperties();
		makeWindowCenter();
		addComponents();	
	}
	//���ÿ������
	public void setProperties(){	
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		setName("WarningPage1");
		setTitle("Warning");
		setSize(100,80);
	}
	//���ô���λ��
	public void makeWindowCenter(){	
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		int windowWidth = this.getWidth();
		int windowHeight = this.getHeight();
		this.setLocation((width-windowWidth)/2,(height-windowHeight)/2);
	}
	//���ò���
	public void setLayout(){		
		setLayout(null);
		con = getContentPane();
	}
	//���ñ�ǩ����
	public void setJLabels(String str){
		jl1 = new JLabel(str);
		jl1.setBounds(30,5,65,30);
	}
	//������������
	public void addComponents(){
		con.add(jl1);
	}
}