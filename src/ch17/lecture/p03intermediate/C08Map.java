package ch17.lecture.p03intermediate;

import java.util.*;

public class C08Map {
	public static void main(String[] args) {
		//어떤 요소를 다른 요소로 맵핑(변환)
		List<Integer> list = List.of(2,1,0,3,9);
		
		list.stream()
			.map(s -> 0)// -> 5개의 원소가 각각 0으로 맵핑됨 //파라미터로 Function을 받음 추상메소드인 apply를 재정의 apply는 파라미터 타입과 리턴타입이 다름(T타입을 받아서 R타입을 리턴) 
			.forEach(System.out::println);
		
		System.out.println("짝수로 맵핑");
		list.stream()
			.map(e -> e * 2)//곱하기 2한 원소가 되서, 다음 스트림으로 넘어감
			.forEach(System.out::println);
	}

}
