package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C02NetworkClient {
	public static void main(String[] args) {
		//클라이언트에서도 소켓을 만들어줘야함
		//ip주소도 알아야하고(내컴푸터의 아이피주소)
		String ip = "172.30.1.40";
		//port번호도 알아야함(서버에서만든 포트번호)
		int port = 50500;
	
	try(
		Socket s = new Socket(ip, port);
		InputStream is = s.getInputStream();//inputstream으로 읽어야하니까 input을 가져와!
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);) {
		
		char[] buf = new char[1024];
		int len = 0;
		while((len = br.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		System.out.println();
	}catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("프로그램종료");
	}

}
