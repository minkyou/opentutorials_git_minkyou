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
	JLabel topLine;								// ��ܺ�
	JTextArea showArea;					// ��ȭâ
	JScrollPane scrollBar;
	
	JPanel bottomLine;						// �ϴܺ�
	private JTextField inputField;			// �Է�â
	JButton sendButton;						// '������'��ư
	
	
	public ChatClientDesign(String title) {
		super(title);
		design();
		this.addWindowListener(new WindowAdapterTest() {		// �͸�Ŭ���� > �̺�Ʈ �߻� �ÿ��� �޸𸮿� �ö󰣴�.
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void design() {
		Container ct = this.getContentPane();
		
		// ��ܺ�
		topLine = new JLabel("ID");		// �ӽð�
		ct.add(topLine, BorderLayout.PAGE_START);
		
		// ��ȭâ
		showArea = new JTextArea("Show Text Area");
		showArea.setEditable(false);
		ct.add(showArea, BorderLayout.CENTER);
		
		// ��ũ�ѹ�
//		scrollBar = new JScrollPane();
//		ct.add(scrollBar, BorderLayout.CENTER);
		
		// �ϴܺ�
		bottomLine = new JPanel(new GridLayout(1,2));	// int rows, int cols
		inputField = new JTextField();
		sendButton = new JButton("������");
		bottomLine.add(inputField);
		bottomLine.add(sendButton);
		ct.add(bottomLine, BorderLayout.PAGE_END);
		
		// Action
		sendButton.addActionListener(new SendText(inputField));
	}
}
