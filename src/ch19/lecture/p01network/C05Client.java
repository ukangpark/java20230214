package ch19.lecture.p01network;

import java.io.*;
import java.net.*;
import java.util.*;

public class C05Client {
	public static void main(String[] args) {
		// 클라이언트쪽
		// 요청할 서버의 주소와 포트번호를 알아야함
		// 서버가 먼저 준비가 되어있어야함
		String ip = "172.30.1.65";

		int port = 50500;

		try (
				Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos);) {

			String input = "";
			try(Scanner scanner = new Scanner(System.in);) {
				System.out.println("서버에게 보낼 데이터 작성>");
				input = scanner.nextLine();
			}
			
			ps.println(input);

			ps.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("클라이언트 프로그램 종료");

	}

}
