package com.zy.controller.setclickaction;

import javax.swing.JFrame;
import com.zy.view.IndexPage;

public class InChordPage {
	//��ť�����ء��������Ӧ
    public static void Back(JFrame jframe){
    	jframe.dispose();
		try {
			new IndexPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }	
}