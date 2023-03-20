package ch17.lecture.p03intermediate;

import java.util.*;

public class C09Map {
	public static void main(String[] args) {
		
		List<String> list = List.of("java", "html", "css");
		
		list.stream()
		.map(s -> "hello " + s)//맵핑되는 타입도 같아야하는가? 파라미터로 받는 타입과 리턴하는 타입이 달라도 되니까 다른 타입을 맵핑시켜도 됨
		.forEach(System.out::println);
	}

}
