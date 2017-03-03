/**
 * ChatManage.java
 * 클라이언트를 관리하는 클래스
 * @Date 2017. 2. 22.
 */
package com.pknu.multichat.server;

import java.util.Iterator;
import java.util.Vector;

public class ChatManage extends Vector<ChatThread> {

	private static final long serialVersionUID = 1L;

	public synchronized void addChatThread(ChatThread thread) {
		this.add(thread);
		System.out.println("[서버]: " + this.size() + "명 접속해있습니다.");
	}
	
	public synchronized void removeChatThread(ChatThread thread) {
		this.remove(thread);
		System.out.println("[서버]: " + this.size() + "명 접속해있습니다.");
	}	

	// Iterator를 이용하는 방법
	public synchronized void sendAllMessage(String msg) {
		Iterator<ChatThread> iterator= this.iterator();
		
		while(iterator.hasNext()) {
			ChatThread chatThread = iterator.next();
			chatThread.sendMessage(msg);
		}
	}
}
