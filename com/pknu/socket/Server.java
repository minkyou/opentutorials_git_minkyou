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
		System.out.println("서버 소켓이 생성되었습니다.");
		while(true) {
			System.out.println("클라이언트 접속 대기");
			inner_Socket = ss.accept();
			System.out.println("클라이언트 접속 성공");
			getMessage(inner_Socket);
		}
	}

	public void getMessage(Socket inner_Socket) throws Exception {
		this.inner_Socket = inner_Socket;
		
		br = new BufferedReader(new InputStreamReader(inner_Socket.getInputStream()));	// 1byte > 2bytes
		
//		bw =  new BufferedWriter(new OutputStreamWriter(inner_Socket.getOutputStream()));
//		bw.write("qwer);
//		bw.flush();
		// PrintWriter은 바로 전송
		pw = new PrintWriter(inner_Socket.getOutputStream(), true);		// PrintWrite는 파라미터로 OutputStream을 바로 받을 수 있다.
		String temp = br.readLine();
		System.out.println("서버 쪽에서 클라이언트로부터 받은 문자열 출력 : " + temp);
		
		if(br != null) br.close();
		if(ss != null) inner_Socket.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		Server server = new Server();
		server.serverSocket();
	}
}
