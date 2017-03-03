package com.pknu.stackCal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JTextField;

public class Back implements ActionListener{

	JTextField valueField;
	Stack<String> st = CalDesign.st;
	String temp="";
	
	public Back(JTextField valueField) {
		this.valueField = valueField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			valueField.setText("0");
		} else if(st.size() < 2) {
			temp = st.pop();
			temp = temp.substring(0, temp.length()-1);
			st.push(temp);
			valueField.setText(st.get(0));
		} else if(st.size() < 3) {
			temp = st.pop();
			valueField.setText(st.get(0));
		} else {
			temp = st.pop();
			temp = temp.substring(0, temp.length()-1);
			st.push(temp);
			valueField.setText(st.get(0)+st.get(1)+st.get(2));
		}
	}

}