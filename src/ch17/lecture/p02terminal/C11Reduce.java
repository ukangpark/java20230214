package ch17.lecture.p02terminal;

import java.util.*;

public class C11Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,4,5,1);
		
		Integer r1 = list.stream()
				.reduce(0, Integer::sum);
		System.out.println("r1: " + r1);
				//optional을 리턴하지않음(초기값이 있으니까)
				//초기값과 첫번째 요소 결과를 냄
				//결과값과 두번째 요소를 연산함
		Integer r3 = list.stream()
				.reduce(Integer::sum)
				.get();
		System.out.println("r3: " + r3);
		//같은 결과가 나옴(연산방식이 다를 뿐)
		
		Integer r2 = list.stream()
				.reduce(1, (a,b) -> a * b);
		
		System.out.println(r2);
	}

}
