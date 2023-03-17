package ch17.exercise.exam08;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		Map<String, List<Member>> map = new HashMap<>();
		
		for (Member member : list) {
			List<Member> val = map.get(member.getJob());
			
			if(val == null) {
				val = new ArrayList<>();
				map.put(member.getJob(), val);
			}
			val.add(member);
		}
		
		System.out.println("[개발자");
		List<Member> dev = map.get("개발자");
		for (Member d : dev) {
			System.out.println(d);
		}
		System.out.println();
		
		System.out.println("[디자이너]");
		List<Member> dis = map.get("디자이너");
		for (Member s : dis) {
			System.out.println();
		}
		
	}


}
