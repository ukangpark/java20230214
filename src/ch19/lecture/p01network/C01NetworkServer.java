package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C01NetworkServer {
	public static void main(String[] args) {
		// IP주소(내가어떻게 할수없음)
		// Port번호 필요(내가 결정할수있음)
		int port = 50500;

		// port번호를 사용하여 내 port번호의 프로그램을 생성함? : ServerSocket
		// 입출력시스템이니까 썼으면 닫아줘야함
		try (ServerSocket serverSocket = new ServerSocket(port);) {
			System.out.println("연결 기다리는중....");
			//누군가 소켓을 통해 무언가 만들어가기를 기다리는 중
			// socket객체를 만들어줘야 서버프로그램으로부터 socket을 꺼내줄수있음
			try (
					Socket socket = serverSocket.accept();//상대방이 연결될수있게 해줌
					OutputStream os = socket.getOutputStream();
					OutputStreamWriter osw = new OutputStreamWriter(os);
					BufferedWriter bw = new BufferedWriter(osw);) {
				
				bw.write("Hello hyejin");
				
				bw.flush();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("프로그램종료");

	}
}
