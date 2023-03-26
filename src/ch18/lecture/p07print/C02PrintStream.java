package ch18.lecture.p07print;

import java.io.*;

public class C02PrintStream {
	public static void main(String[] args) {
		String name = "output/print2.txt";
		
		try (
		PrintStream ps = new PrintStream(name);) {
			
			ps.println(9999);
			ps.println(9.99999);
			ps.println(false);
			ps.println("hello world");//문자단위스트림이아니여도 문자열 출력가능
			ps.println("더 글로리");//문자단위스트림이아니여도 문자열 출력가능
			
			System.out.println();//지금까지 써온 출력코드를 살펴보면 out은 printStream타입(초창기에 만들어진 출력 코드기때문에 초창기에는 printStream을 사용함)
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
