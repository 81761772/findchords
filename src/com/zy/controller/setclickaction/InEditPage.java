package com.zy.controller.setclickaction;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTextField;
import com.zy.controller.EditDB;
import com.zy.view.*;

public class InEditPage {
	//��ť�����ء��������Ӧ
    public static void Back(JFrame jframe){
    	jframe.dispose();
    	new ManagePage();
    }
    //��ť��ɾ�����������Ӧ
    public static void Delete(JFrame jframe,JTextField jtf2) throws SQLException{
    	String str1 = jtf2.getText().trim();
    	int i = 0;
    	try{
    		i = Integer.parseInt(str1);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	new EditDB(i);
    } 
}