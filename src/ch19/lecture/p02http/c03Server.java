package ch19.lecture.p02http;

import java.io.*;
import java.net.*;

public class c03Server {
	public static void main(String[] args) {
		// 응답
		int port = 80;

		try (
				ServerSocket serverSocket = new ServerSocket(port);) {

			System.out.println("요청을 기다리는중");

			while (true) {
				Socket socket = serverSocket.accept();

				Thread t = new Thread(() -> {
					
				try (	socket;//Socket을 닫아줄수있음
						OutputStream os = socket.getOutputStream();
						PrintStream ps = new PrintStream(os);) {

					String body = """
							<h1> 혜진아 안녕? </h1>
							<h1> 내꺼훔쳐보는 사람 누구얏! </h1>
							<h1> This is NAVER!! </h1>
							<h3> 다른 사이트로 이동 </n3>
							<ul>
								<li><a href="https://www.daum.net">daum</a></li>
								<li><a href="https://www.google.com">google</a></li>
							</ul>
							""";

					int length = body.getBytes().length;// 바이트의 길이를 알려주면됨

					// 첫 줄
					ps.println("HTTP/1.1 200 OK");

					// 두번째 줄부터 헤더들
					// 꼭들어가야하는 헤더 2개
					// 1.어떤 형식의 콘텐트인지 알려줘야함
					ps.println("Content-Type: text/html; charset=utf-8");
					// 2.본문의 길이가 얼만지 알려줘야함
					ps.println("Content-Length: " + length);

					// 빈줄이 한번들어가고 다음줄부터 본문
					ps.println();
					ps.println(body);

					ps.flush();
				}catch (Exception e) {
					// TODO: handle exception
				}
				});
				
				t.start();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("서버 종료");
	}

}
