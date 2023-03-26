package ch17.lecture.p03intermediate;

import java.util.*;

public class C03distinct {
	public static void main(String[] args) {
		//distinct 중복 제거
		List<Integer> list = List.of(3,1,2,0,1,2,3);
		long count = list.stream()
			.count();
		System.out.println(count); //7
		
		long count2 = list.stream()
			.distinct() // 중복된 원소를 제거 / 중간 연산 메소드
			.count(); //최종 연산 메소드
		System.out.println(count2); //4
	}

}
