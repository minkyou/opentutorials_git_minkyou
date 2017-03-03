package com.pknu.stackCal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JTextField;

public class Clear implements ActionListener {
	JTextField valueField;
	Stack<String> st = CalDesign.st;
	
	public Clear(JTextField valueField) {
		this.valueField = valueField;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		st.clear();
		valueField.setText("0");
	}
	
}
