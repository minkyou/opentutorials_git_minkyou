package com.pknu.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket ss;
	private Socket inner_Socket;
	private BufferedReader br;
//	private BufferedWriter bw;
	private PrintWriter pw;
	
	public void serverSocket() throws Exception {
		ss = new ServerSocket(8889);
		System.out.println("���� ������ �����Ǿ����ϴ�.");
		while(true) {
			System.out.println("Ŭ���̾�Ʈ ���� ���");
			inner_Socket = ss.accept();
			System.out.println("Ŭ���̾�Ʈ ���� ����");
			getMessage(inner_Socket);
		}
	}

	public void getMessage(Socket inner_Socket) throws Exception {
		this.inner_Socket = inner_Socket;
		
		br = new BufferedReader(new InputStreamReader(inner_Socket.getInputStream()));	// 1byte > 2bytes
		
//		bw =  new BufferedWriter(new OutputStreamWriter(inner_Socket.getOutputStream()));
//		bw.write("qwer);
//		bw.flush();
		// PrintWriter�� �ٷ� ����
		pw = new PrintWriter(inner_Socket.getOutputStream(), true);		// PrintWrite�� �Ķ���ͷ� OutputStream�� �ٷ� ���� �� �ִ�.
		String temp = br.readLine();
		System.out.println("���� �ʿ��� Ŭ���̾�Ʈ�κ��� ���� ���ڿ� ��� : " + temp);
		
		if(br != null) br.close();
		if(ss != null) inner_Socket.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		Server server = new Server();
		server.serverSocket();
	}
}
