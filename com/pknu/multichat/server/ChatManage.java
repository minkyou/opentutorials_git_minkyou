/**
 * ChatManage.java
 * Ŭ���̾�Ʈ�� �����ϴ� Ŭ����
 * @Date 2017. 2. 22.
 */
package com.pknu.multichat.server;

import java.util.Iterator;
import java.util.Vector;

public class ChatManage extends Vector<ChatThread> {

	private static final long serialVersionUID = 1L;

	public synchronized void addChatThread(ChatThread thread) {
		this.add(thread);
		System.out.println("[����]: " + this.size() + "�� �������ֽ��ϴ�.");
	}
	
	public synchronized void removeChatThread(ChatThread thread) {
		this.remove(thread);
		System.out.println("[����]: " + this.size() + "�� �������ֽ��ϴ�.");
	}	

	// Iterator�� �̿��ϴ� ���
	public synchronized void sendAllMessage(String msg) {
		Iterator<ChatThread> iterator= this.iterator();
		
		while(iterator.hasNext()) {
			ChatThread chatThread = iterator.next();
			chatThread.sendMessage(msg);
		}
	}
}
