package ch17.lecture.p02terminal;

import java.util.*;

public class C13Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,2,3,2,2,2);
		
		//많이 안쓰니까 넘어가자
		Map<Integer, Integer> r1 = list.stream()
			.collect(HashMap::new,
					(map, e)->map.compute(e, (k,v)->v == null ? 1: v+ 1),
					Map::putAll);
		
		System.out.println(r1);
	}

}
