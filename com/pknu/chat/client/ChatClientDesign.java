package com.pknu.chat.client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.pknu.design.WindowAdapterTest;

public class ChatClientDesign extends JFrame {

	private static final long serialVersionUID = 1L;
	JLabel topLine;								// 상단부
	JTextArea showArea;					// 대화창
	JScrollPane scrollBar;
	
	JPanel bottomLine;						// 하단부
	private JTextField inputField;			// 입력창
	JButton sendButton;						// '보내기'버튼
	
	
	public ChatClientDesign(String title) {
		super(title);
		design();
		this.addWindowListener(new WindowAdapterTest() {		// 익명클래스 > 이벤트 발생 시에만 메모리에 올라간다.
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void design() {
		Container ct = this.getContentPane();
		
		// 상단부
		topLine = new JLabel("ID");		// 임시값
		ct.add(topLine, BorderLayout.PAGE_START);
		
		// 대화창
		showArea = new JTextArea("Show Text Area");
		showArea.setEditable(false);
		ct.add(showArea, BorderLayout.CENTER);
		
		// 스크롤바
//		scrollBar = new JScrollPane();
//		ct.add(scrollBar, BorderLayout.CENTER);
		
		// 하단부
		bottomLine = new JPanel(new GridLayout(1,2));	// int rows, int cols
		inputField = new JTextField();
		sendButton = new JButton("보내기");
		bottomLine.add(inputField);
		bottomLine.add(sendButton);
		ct.add(bottomLine, BorderLayout.PAGE_END);
		
		// Action
		sendButton.addActionListener(new SendText(inputField));
	}
}
