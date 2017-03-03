package com.pknu.stackCal;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.pknu.design.WindowAdapterTest;

public class CalDesign extends JFrame {
	ArrayList<JButton> num = new ArrayList<>();
	private static final long serialVersionUID = -3435743458470467655L;
	
	JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
	JButton plus, minus, mul, divide, equal, back, clear;
	JPanel jp;
	private JTextField valueField;
//	static JTextField valueField;

//	static String fullSentence="";
	static String first="";
	static String second="";
	static String operator="";
//	static String operEqual="";
	
	static Stack<String> st;
	
	public CalDesign(String title) {
		super(title);
		design();
		this.addWindowListener(new WindowAdapterTest() {		// 익명클래스 > 닫을 때만 메모리에 올라간다.
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void design() {
		Container ct = this.getContentPane();
		
		valueField = new JTextField();
		valueField.setEditable(false);
		valueField.setHorizontalAlignment(JTextField.RIGHT);
		valueField.setText("0");
		
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		num0 = new JButton("0");
		plus = new JButton("+");
		minus = new JButton("-");
		mul = new JButton("*");
		divide = new JButton("/");
		equal = new JButton("=");
		back = new JButton("back");
		clear = new JButton("clear");

		jp = new JPanel(new GridLayout(4,5));
//		jp = new JPanel();
//		jp.setLayout(new GridLayout(4,5));
		
		jp.add(num1);
		jp.add(num2);
		jp.add(num3);
		jp.add(num4);
		jp.add(num5);
		jp.add(num6);
		jp.add(num7);
		jp.add(num8);
		jp.add(num9);
		jp.add(num0);
		jp.add(plus);
		jp.add(minus);
		jp.add(mul);
		jp.add(divide);
		jp.add(equal);
		jp.add(back);
		jp.add(clear);
		
		ct.add(valueField, BorderLayout.PAGE_START);
		ct.add(jp, BorderLayout.CENTER);
		
		st = new Stack<>();
		
		// 숫자 입력
		num1.addActionListener(new Number(valueField));
		num2.addActionListener(new Number(valueField));
		num3.addActionListener(new Number(valueField));
		num4.addActionListener(new Number(valueField));
		num5.addActionListener(new Number(valueField));
		num6.addActionListener(new Number(valueField));
		num7.addActionListener(new Number(valueField));
		num8.addActionListener(new Number(valueField));
		num9.addActionListener(new Number(valueField));
		num0.addActionListener(new Number(valueField));

		// 연산자
		plus.addActionListener(new Operator(valueField));
		minus.addActionListener(new Operator(valueField));
		mul.addActionListener(new Operator(valueField));
		divide.addActionListener(new Operator(valueField));
		
		// 결과
		equal.addActionListener(new Equal(valueField));
		
		// 초기화
		clear.addActionListener(new Clear(valueField));
		

		// 지우기
		back.addActionListener(new Back(valueField));
	}
}
