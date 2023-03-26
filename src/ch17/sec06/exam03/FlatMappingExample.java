package ch17.sec06.exam03;

import java.util.*;

public class FlatMappingExample {
	public static void main(String[] args) {
		//문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("I am a best developer");
		list1.stream()
			.flatMap(e -> Arrays.stream(e.split(" ")))
			.forEach(System.out::println);
		
		System.out.println();
		
		//문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream()
			.flatMapToInt(e -> {
				String[] strArr = e.split(",");
				int[] intArr = new int[strArr.length];
				for (int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			})
			.forEach(System.out::println);
		System.out.println();
		
		list2.stream()
			.flatMap(e -> Arrays.stream(e.split(",")))
			.map(s -> s.trim())
			.mapToInt(e -> Integer.parseInt(e))
			.forEach(System.out::println);
		System.out.println();
		
		list2.stream()
			.flatMap(s -> Arrays.stream(s.split("\\s*,\\s*")))
			.mapToInt(Integer::parseInt)
			.forEach(System.out::println);
	}

}
