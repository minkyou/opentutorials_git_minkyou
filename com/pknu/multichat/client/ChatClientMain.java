/**
 * ChatClientMain.java
 * 채팅 클라이언트 Main 클래스
 * @Date 2017. 2. 22.
 */
package com.pknu.multichat.client;

import java.util.Random;

public class ChatClientMain {

	public static void main(String[] args) throws Exception {
		
		int randomNum = new Random().nextInt(1000);
		ChatClient ccd = new ChatClient(String.valueOf(randomNum));
		// setBounds(int x, int y, int width, int height)
		ccd.setBounds(400, 100, 300, 600);
		ccd.setVisible(true);
	}

}
