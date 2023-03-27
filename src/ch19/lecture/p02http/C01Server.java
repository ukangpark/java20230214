package ch19.lecture.p02http;

import java.io.*;
import java.net.*;

public class C01Server {
	public static void main(String[] args) {
		// 서버가 자주 사용하는 포트번호 : 80(http통신을 위한 포트)
		int port = 80;

		try (
				ServerSocket serverSocket = new ServerSocket(port);) {

			System.out.println("요청을 기다리는 중");

			try (
					Socket socket = serverSocket.accept();
					InputStream is = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);) {

				String line = br.readLine();

				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
				;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("서버 종료");
	}

}
