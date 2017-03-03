package com.pknu.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	BufferedReader br;
	PrintWriter pw;
	Socket client;
	
	public Client() {
		connect();
	}
	
	public void connect() {
		try {
			System.out.println("�������� ������ �õ��մϴ�.");
			client = new Socket("127.0.0.1", 8889);
			System.out.println("���� ����");
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream(), true);
			pw.println("777777777777");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� ����");
		} finally {
			try {
				if(client != null) client.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Client ci = new Client();
		
	}
}
