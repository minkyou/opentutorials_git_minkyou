/**
 * 
 */
package com.pknu.chat.client;

/**
 * @author ��α�
 *
 */
public class ChatClientMain {

	/**
	 * @Date 2017. 2. 22. ���� 9:46:18
	 * @author ��α�
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Design
		ChatClientDesign ccd = new ChatClientDesign("ä��");
		ccd.setBounds(400, 100, 300, 600);		// parameter : int x, int y, int width, int height
		ccd.setVisible(true);
		
		// Socket
		ChatClientSocket ccs = new ChatClientSocket();
		ccs.connect();
		
		
	}

}
