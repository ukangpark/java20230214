package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C06Server {
	public static void main(String[] args) {
		// 서버소켓을 만들고 accept한다음에 인풋아웃풋작성
		// 서버
		int port = 50500;
		try (ServerSocket severSocket = new ServerSocket(port);) {
			// 연결을 기다리는건 여러번 할 수 있음
			while (true) {
				System.out.println("연결기다리는중..");
				// 소켓열기
				Socket socket = severSocket.accept();
				Thread t = new Thread(() -> {
					try (
							InputStream is = socket.getInputStream();
							BufferedInputStream bis = new BufferedInputStream(is);
							InputStreamReader isr = new InputStreamReader(bis);) {

						char[] data = new char[1024];
						int len = 0;
						System.out.println("입력받는중...");
						while ((len = isr.read(data)) != -1) {
							String input = new String(data, 0, len);
							System.out.println(input);
						}

						socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				t.start();

				System.out.println("프로그램종료");
			}
		}catch (Exception e2) {
			e2.printStackTrace();
		}

	}

}
