package com.pknu.stackCal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JTextField;

public class Equal implements ActionListener {

	JTextField valueField;
	
	String operResult;
	int x, y;
	int result;
	Stack<String> st = CalDesign.st;
	
	public Equal(JTextField valueField) {
		this.valueField = valueField;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		float ftResult=0f;
		
		if(!st.isEmpty() && st.size() > 2) {
			//CalDesign.operEqual = e.getActionCommand();
			valueField.setText(st.get(0)+st.get(1)+st.get(2)+"=");
	//		CalDesign.st.push(CalDesign.second);
			
			/*String to int*/
			y=Integer.parseInt(st.pop());
			operResult=st.pop();
			x=Integer.parseInt(st.pop());
			
			/*int to String
			Integer.toString(intType);*/
			
			/*문자열 비교
			equals() : 대상의 내용 자체를 비교
			== : 주소(참조값) 비교*/
//			if(operResult.equals("+")) {
//				result=x+y;
//			} else if(operResult.equals("-")) {
//				result=x-y;
//			} else if(operResult.equals("*")) {
//				result=x*y;
//			}  else if(operResult.equals("/")) {
//				result=x/y;
//			}
			
			switch(operResult) {
			case "+" : 
				result=x+y; 
				valueField.setText(x+operResult+y+"="+result);
				break;
			case "-" : 
				result=x-y; 
				valueField.setText(x+operResult+y+"="+result);
				break;
			case "*" : 
				result=x*y; 
				valueField.setText(x+operResult+y+"="+result);
				break;
			case "/" : 
				ftResult=Float.parseFloat(Integer.toString(x))/Float.parseFloat(Integer.toString(y)); 
				valueField.setText(x+operResult+y+"="+ftResult);
				break;
			}
			
		}
	}

}
