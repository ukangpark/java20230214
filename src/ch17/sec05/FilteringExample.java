package ch17.sec05;

import java.util.*;

public class FilteringExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("hong");
		list.add("shin");
		list.add("gam");
		list.add("shin");
		list.add("shinMin");
		
		//중복 요소 제거
		list.stream()
		.distinct()
		.forEach(System.out::println);
		System.out.println();
		
		//shin으로 시작하는 요소만 필터링
		list.stream()
		//test메소드 파라미터로 요소들을 받아서, 그요소들을 재정의
		.filter(s -> s.startsWith("shin"))
		//String의 startsWith메소드 : 주어진 문자열을 시작으로하면 true, 그렇지않으면 false
		.forEach(System.out::println);
		System.out.println();
		
		//중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
		list.stream()
		.distinct()
		.filter(s -> s.startsWith("shin"))
		.forEach(System.out::println);
	}

}
