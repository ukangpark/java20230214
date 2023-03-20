package ch17.lecture.p03intermediate;

import java.util.*;

public class C07Filter {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,9,-1,0,2,-3,-6,7,8);
		
		list.stream()
			.filter( s -> s > 0) //true면 살아나는 거고, false면 죽음 => 0보다 큰 원소들만 살아남음
			.forEach(System.out::println);
		
		System.out.println("짝수만---------------");
		list.stream()
			.filter(s -> s % 2 == 0)
			.forEach(System.out::println);
		
		System.out.println("홀수만-------------");
		list.stream()
			.filter(s -> s % 2 == 1)
			.forEach(System.out::println);
	}

}
