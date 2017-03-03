package com.pknu.stackCal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JTextField;

public class Number implements ActionListener {
	JTextField valueField;
	String first = CalDesign.first;
	String second = CalDesign.second;
	Stack<String> st = CalDesign.st;
	
	public Number(JTextField valueField) {
		this.valueField = valueField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(st.isEmpty()) {
			first = e.getActionCommand();
			st.push(first);
			valueField.setText(first);
		} else {
			if(st.size() < 2) {
				first = st.pop() + e.getActionCommand();
				st.push(first);
				valueField.setText(first);
//				System.out.println(st.peek());
			} else {
				if(st.size() < 3) {
					second = e.getActionCommand();
					st.push(second);
					valueField.setText(st.get(0)+st.get(1)+second);
				} else {
					second = st.pop() + e.getActionCommand();
					st.push(second);
					valueField.setText(st.get(0)+st.get(1)+second);
				}
			}
		}
		
		// 콘솔 출력
		for(String temp:st) {
			System.out.println(temp);
		}
	}

}
