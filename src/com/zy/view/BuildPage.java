package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.SetBuildPage;

public class BuildPage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//��ʼ�����
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JButton jb4 = new JButton();
	JLabel jl1 = new JLabel("����");
	JLabel jl2 = new JLabel("����");
	JLabel jl3 = new JLabel("ͼƬ");
	JLabel jl4 = new JLabel("��Ƶ");
	JLabel jl5 = new JLabel("��ѡ���ǩ");
	JTextField jtf1 = new JTextField("�����������");
	JTextField jtf2 = new JTextField("����",100);
	JTextField jtf3 = new JTextField("����",100);
	JTextArea jta1 = new JTextArea();
	JTextArea jta2 = new JTextArea();
	JScrollPane jsp1 = new JScrollPane(jta1);
	JScrollPane jsp2 = new JScrollPane(jta2);	
	//�����ǩ���飬�ṩ�������б��
	String[] arr = 
		{" ","����","Ӣ��","С����","����","�˸�","�˷�","����","����",
				"����","��ʿ","ҡ��","��ҥ","�ŵ�","���","�׹�",
				"˵��","������","�ſ�","����","����","��³˹"};
	JComboBox<String> jcb1 = new JComboBox<>(arr);
	JComboBox<String> jcb2 = new JComboBox<>(arr);
	JComboBox<String> jcb3 = new JComboBox<>(arr);
	//����com.zy.controller.windowproperties���е�SetBuildPage�๹�����ڡ�
	public BuildPage(){
		SetBuildPage sbp = new SetBuildPage();
		sbp.setLayout(this,con);
		sbp.setWindowIcons(this);
		sbp.setJTextFields(jtf1,jtf2,jtf3);
		sbp.setButtons(this,jb1,jb2,jb3,jb4,jtf1,jtf2,jtf3,jta1,jta2,jcb1,jcb2,jcb3);
		sbp.setLabels(jl1,jl2,jl3,jl4,jl5);	
		sbp.setJTextAreas(jta1,jta2);
		sbp.setJScrollPanes(jsp1,jsp2);
		sbp.setJComboBoxes(jcb1,jcb2,jcb3);
		sbp.setProperties(this);
		sbp.makeWindowCenter(this);
		sbp.addComponents(con,jb1,jb2,jb3,jb4,jl1,jl2,jl3,jl4,jl5,jtf1,jtf2,jtf3,jsp1,jsp2,jcb1,jcb2,jcb3);
	}
}