package ch17.lecture.p02terminal;

import java.util.*;

public class C10Reduce {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		//파라미터 1개인 reduce 기능만 받는것
		Integer sum = list.stream()
			.map(e -> e.length())//문자열의 길이를 int로 가져올수있는 메소드
			.reduce(Integer::sum)
			.get();
		System.out.println(sum);
	}

}
