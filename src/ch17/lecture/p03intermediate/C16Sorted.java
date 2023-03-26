package ch17.lecture.p03intermediate;

import java.util.*;

public class C16Sorted {
	public static void main(String[] args) {
		//sorted : 정렬된 stream return
		//또 네추럴 오더링... 또 Comparable.....구현해야함
		//natural ordering 자동정렬
		List<String> list = List.of(
				"chisoo",
				"backho",
				"taewoong",
				"taesup",
				"daeyeon"
				);
		
		list.stream()
			.sorted() // 자동 정렬 (오름차순) => list는 natural ordering이기 때문에 실행가능
			.forEach(System.out::println);
	}

}
