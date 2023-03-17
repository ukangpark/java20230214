package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C15Collect {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		//groupBy어떤 그룹으로 묶을 것인가 (같은 길이를 가진 문자열끼리 묶어보자)
		Map<Integer, List<String>> r1 = list.stream()
			.collect(Collectors.groupingBy(s -> s.length()));//키의문자열길이를 value로 가진다.
		System.out.println(r1);
		
		//위의 Stream을 고전적 for문으로 변경
		Map<Integer, List<String>> r2 = new HashMap<>();
		//list를 하나씩 탐색
		for (String s : list) {
			//요소들의 길이를 키값으로 받음
			Integer key = s.length();
			//키의 value를 String타입인 리스트로 만드는데
			List<String> val = r2.get(key);
			//만약 val이 없으면 새로운 리스트를 만들어라
			if (val == null) {
				val = new ArrayList<>();
				r2.put(key, val);
			}
			//아니면 val에 요소를 넣어라
			val.add(s);
			
		}
		
	}

}
