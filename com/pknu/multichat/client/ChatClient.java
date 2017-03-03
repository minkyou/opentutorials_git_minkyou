/**
 * ChatClient.java
 * 채팅 클라이언트 기능 구현 클래스
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
	
	JLabel topLine;					// 상단부
	JTextArea showArea;		// 대화창
	JPanel bottomLine;			// 하단부
	JTextField inputBox;			// 입력창
	JButton sendButton;			// '보내기'버튼

	BufferedReader br;
	PrintWriter pw;
	Socket chatSocket;
	
	boolean flag;
	String nickName;

	public ChatClient(String nickName) throws Exception {
		super(nickName+"의 채팅창");
		this.nickName = nickName;
		design();
		connect();
		new Thread(this).start();			// Runnable 구현
		
		// 익명클래스 > 이벤트 발생 시에만 메모리에 올라간다.
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
		
		// 상단부
		topLine = new JLabel(nickName);
		ct.add(topLine, BorderLayout.PAGE_START);
		
		// 대화창
		showArea = new JTextArea("");
		showArea.setEditable(false);
		showArea.setLineWrap(true);			// 자동 줄바꿈
		ct.add(new JScrollPane(showArea), BorderLayout.CENTER);	// scroll-bar 붙임
		
		// 하단부
//		bottomLine = new JPanel(new GridLayout(1,2));			// int rows, int cols
		bottomLine = new JPanel();
		inputBox = new JTextField(15);
		sendButton = new JButton("보내기");
		bottomLine.add(inputBox);
		bottomLine.add(sendButton);
		ct.add(bottomLine, BorderLayout.PAGE_END);
		
		// Action
		inputBox.addActionListener(this);			// JTextField의 Enter키 이벤트 발생
		sendButton.addActionListener(this);
	}
	
	// 소켓 연결
	public void connect() {
		try {
			chatSocket = new Socket("127.0.0.1", 8889);
			br = new BufferedReader(new InputStreamReader(chatSocket.getInputStream()));
			pw = new PrintWriter(chatSocket.getOutputStream(), true);
		} catch (Exception e) {
			System.out.println("연결 실패");
		}
		this.sendMessage("["+nickName+"] 님이 입장하셨습니다.");
	}
	
	// Runnable의 run() 메서드 구현
	@Override
	public void run() {
		try {
			// Server로부터 받는 데이터를 읽어들임
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
	
	// 메시지 전송
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

	// 접속 종료
	public void stop() {
		String endOfMsg = "!@#$";		// EOM : End of Message
		try {
			sendMessage("["+nickName+"] 님이 퇴장하셨습니다." + endOfMsg);
			chatSocket.close();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
