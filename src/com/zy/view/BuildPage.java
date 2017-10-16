package com.zy.view;

import java.awt.*;
import javax.swing.*;
import com.zy.controller.setwindowproperties.SetBuildPage;

public class BuildPage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//初始化组件
	Container con = getContentPane();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JButton jb4 = new JButton();
	JLabel jl1 = new JLabel("标题");
	JLabel jl2 = new JLabel("作者");
	JLabel jl3 = new JLabel("图片");
	JLabel jl4 = new JLabel("音频");
	JLabel jl5 = new JLabel("请选择标签");
	JTextField jtf1 = new JTextField("请输入歌曲名");
	JTextField jtf2 = new JTextField("必填",100);
	JTextField jtf3 = new JTextField("必填",100);
	JTextArea jta1 = new JTextArea();
	JTextArea jta2 = new JTextArea();
	JScrollPane jsp1 = new JScrollPane(jta1);
	JScrollPane jsp2 = new JScrollPane(jta2);	
	//定义标签数组，提供给下拉列表框
	String[] arr = 
		{" ","华语","英语","小语种","快乐","伤感","兴奋","怀旧","浪漫",
				"抗争","爵士","摇滚","民谣","古典","乡村","雷鬼",
				"说唱","轻音乐","放克","民族","电子","布鲁斯"};
	JComboBox<String> jcb1 = new JComboBox<>(arr);
	JComboBox<String> jcb2 = new JComboBox<>(arr);
	JComboBox<String> jcb3 = new JComboBox<>(arr);
	//利用com.zy.controller.windowproperties包中的SetBuildPage类构建窗口。
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