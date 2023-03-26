package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C03Server {
	public static void main(String[] args) {
	//서버쪽
	//자기컴퓨터에 포트번호를 생성하고 누군가가 프로그램을 가져가도록 기다림
	int port = 50500;
	System.out.println("연결기다리는중");
	try (
	ServerSocket serverSocket = new ServerSocket(port);
	Socket socket = serverSocket.accept();//socket이 실행되면, 받을 준비를 함
	InputStream is = socket.getInputStream();
	BufferedInputStream bis = new BufferedInputStream(is);
	InputStreamReader isr = new InputStreamReader(bis);) {
		
		char[] buf = new char[1024];
		int len = 0;
		
		while((len=isr.read(buf)) != -1) {
			String data = new String (buf, 0, len);
			System.out.println(data);
		}
		System.out.println();
	}catch (Exception e) {
		// TODO: handle exception
	}
}
}
