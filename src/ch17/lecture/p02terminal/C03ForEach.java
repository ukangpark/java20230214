package ch17.lecture.p02terminal;

import java.util.*;

public class C03ForEach {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		
//		list.stream().forEach();//consumer을 받음 element들이 forEach의 accept메소드 안으로 하나씩 들어가게됨(Stream의 역할)
		//스트림의 메소드들은 거의 functional interface들이 많음
		//람다와 궁합이 잘맞음
		list.stream()
			.forEach(s -> System.out.println(s));//consumer을 받음 element들이 forEach의 accept메소드 안으로 하나씩 들어가게됨(Stream의 역할)
		
		list.stream()
		.forEach(s -> System.out.println("원소: " + s));//consumer을 받음 element들이 forEach의 accept메소드 안으로 하나씩 들어가게됨(Stream의 역할)

		
	}

}
