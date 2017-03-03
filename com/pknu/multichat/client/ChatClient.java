/**
 * ChatClient.java
 * ä�� Ŭ���̾�Ʈ ��� ���� Ŭ����
 * @Date 2017. 2. 22.
 */
package com.pknu.multichat.client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;
	
	JLabel topLine;					// ��ܺ�
	JTextArea showArea;		// ��ȭâ
	JPanel bottomLine;			// �ϴܺ�
	JTextField inputBox;			// �Է�â
	JButton sendButton;			// '������'��ư

	BufferedReader br;
	PrintWriter pw;
	Socket chatSocket;
	
	boolean flag;
	String nickName;

	public ChatClient(String nickName) throws Exception {
		super(nickName+"�� ä��â");
		this.nickName = nickName;
		design();
		connect();
		new Thread(this).start();			// Runnable ����
		
		// �͸�Ŭ���� > �̺�Ʈ �߻� �ÿ��� �޸𸮿� �ö󰣴�.
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				stop();
				System.exit(0);
			}
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				inputBox.requestFocus();
			}
		});
	}
	
	public void design() {
		Container ct = this.getContentPane();
		
		// ��ܺ�
		topLine = new JLabel(nickName);
		ct.add(topLine, BorderLayout.PAGE_START);
		
		// ��ȭâ
		showArea = new JTextArea("");
		showArea.setEditable(false);
		showArea.setLineWrap(true);			// �ڵ� �ٹٲ�
		ct.add(new JScrollPane(showArea), BorderLayout.CENTER);	// scroll-bar ����
		
		// �ϴܺ�
//		bottomLine = new JPanel(new GridLayout(1,2));			// int rows, int cols
		bottomLine = new JPanel();
		inputBox = new JTextField(15);
		sendButton = new JButton("������");
		bottomLine.add(inputBox);
		bottomLine.add(sendButton);
		ct.add(bottomLine, BorderLayout.PAGE_END);
		
		// Action
		inputBox.addActionListener(this);			// JTextField�� EnterŰ �̺�Ʈ �߻�
		sendButton.addActionListener(this);
	}
	
	// ���� ����
	public void connect() {
		try {
			chatSocket = new Socket("127.0.0.1", 8889);
			br = new BufferedReader(new InputStreamReader(chatSocket.getInputStream()));
			pw = new PrintWriter(chatSocket.getOutputStream(), true);
		} catch (Exception e) {
			System.out.println("���� ����");
		}
		this.sendMessage("["+nickName+"] ���� �����ϼ̽��ϴ�.");
	}
	
	// Runnable�� run() �޼��� ����
	@Override
	public void run() {
		try {
			// Server�κ��� �޴� �����͸� �о����
			while(!flag) {
				String msg = br.readLine();
				if(msg != null && !msg.equals("")) {
					showArea.append(msg+"\n");
					showArea.setCaretPosition(showArea.getText().length());
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// �޽��� ����
	public void sendMessage(String msg) {
		pw.println(msg);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = inputBox.getText();
		if(!msg.equals("")) {
			sendMessage("[" + nickName + "]: " + msg);
			inputBox.setText("");
		}
	}

	// ���� ����
	public void stop() {
		String endOfMsg = "!@#$";		// EOM : End of Message
		try {
			sendMessage("["+nickName+"] ���� �����ϼ̽��ϴ�." + endOfMsg);
			chatSocket.close();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
