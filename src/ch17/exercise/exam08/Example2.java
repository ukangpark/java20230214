package ch17.exercise.exam08;

import java.util.*;
import java.util.stream.*;

public class Example2 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		Map<String, List<Member>> map = list.stream()
				.collect(Collectors.groupingBy(Member::getJob));
		
		System.out.println("[개발자]");
		map.get("개발자").stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("[디자이너]");
		map.get("디자이너").stream().forEach(System.out::println);

		
	}


}
