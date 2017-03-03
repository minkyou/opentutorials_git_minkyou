package com.pknu.stackCal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JTextField;

public class Operator implements ActionListener {

	JTextField valueField;
	String first = CalDesign.first;
	String operator = CalDesign.operator;
	Stack<String> st = CalDesign.st;
	
	public Operator(JTextField valueField) {
		this.valueField = valueField;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(!st.isEmpty() && st.size() < 2) {
			operator = e.getActionCommand();
			valueField.setText(st.peek()+operator);
	//		CalDesign.st.push(first);
			st.push(operator);
					
			// 콘솔 출력
			for(String temp:st) {
				System.out.println(temp);
			}
		}
	}

}
