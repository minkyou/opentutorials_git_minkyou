/**
 * ChatThread.java
 * 각각의 클라이언트와 소켓 통신하도록 구현한 클래스
 * @Date 2017. 2. 22.
 */
package com.pknu.multichat.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatThread extends Thread {
	Socket socket;
	PrintWriter pw;
	BufferedReader br;
	boolean flag;
	
	public ChatThread(Socket socket) {
		this.socket = socket;
//		initNetwork();		// 
	}
	
	// Stream 생성
	public void initNetwork() {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
//		"] 님이 퇴장하셨습니다."를 사용해도 무방하다.
		String endOfMsg = "!@#$";
		
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			
			while(!flag) {
				String msg = br.readLine();
				
				if(msg != null && !msg.equals("")) {
					if(msg.endsWith(endOfMsg)) {
						ChatServerMain.chatManage.removeChatThread(this);
						msg = msg.substring(0, msg.length() - 5);
						socket.close();
						br.close();
						pw.close();
						flag = true;
					}
					System.out.println(msg);
					ChatServerMain.chatManage.sendAllMessage(msg);
				}
			}
		} catch (Exception e) {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(socket != null) socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void sendMessage(String msg) {
		pw.println(msg);
	}
}
