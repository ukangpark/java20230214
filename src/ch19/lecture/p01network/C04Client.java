package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C04Client {
	public static void main(String[] args) {
		//클라이언트쪽
		//요청할 서버의 주소와 포트번호를 알아야함
		//서버가 먼저 준비가 되어있어야함
		String ip = "172.30.1.40";
		
		int port = 50500;
		
		try (
		Socket socket = new Socket(ip, port);
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		PrintStream ps = new PrintStream(bos);) {
		
		ps.println("클라이언트가 서버로 무언가를 요청함");
		
		ps.flush();
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("프로그램 종료");
	}

}
