package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.*;

public class MainWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*��ʼ��������������ǣ����ֵ���ݵ����⣺Java��ֻ��ֵ���ݶ�û�����ô��ݣ�����û�б�
	  ��ʼ���Ķ���������Ϊ���������Ǹı䲻�˶�������Եġ�*/
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
    //����com.zy.controller.windowproperties���е�SetMainWindow�๹�����ڡ�
	public MainWindow(){
		SetMainWindow smw = new SetMainWindow();	
		smw.setLayout(this);
		smw.setWindowIcons(this);
		smw.setButtons(this, jb1, jb2, jb3);
		smw.setProperties(this);
		smw.makeWindowCenter(this);
	    smw.addComponents(con,jb1,jb2,jb3);
	}
	//������
	public static void main(String[] args){
		new MainWindow();
	}
}