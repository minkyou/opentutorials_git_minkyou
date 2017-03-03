package com.pknu.chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class SendText implements ActionListener {
	JTextField inputField;
	static String msg="";
	
	public SendText(JTextField inputField) {
		this.inputField = inputField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// Socket
//		ChatClientSocket ccs = new ChatClientSocket();
//
//		System.out.println(inputField.getText());
//		ccs.send(inputField.getText());
		msg = inputField.getText();
	}
	
}
