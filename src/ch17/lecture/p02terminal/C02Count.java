package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C02Count {
	public static void main(String[] args) {
		//count
		IntStream stream1 = IntStream.range(0, 100);
		long count1 = stream1.count();
		System.out.println(count1);
		
		
		List<String> list = List.of("java","css","spring");
		Stream<String> stream2 = list.stream();
		long count2 = stream2.count();
		System.out.println(count2);
		
		//간략하게 만들수있음
		long count3 = list.stream().count();
		System.out.println(count3);
		
		//중간연산자들이 최종연산자앞에서 중간중간 들어갈수있음
//		list.stream().map(s -> s+s).filter(s->s.startsWith("c")).count();
		//코드가 길어지기때문에 중간연산자마자 enter
		//메소드들이 사슬처럼 연결되있다. method chaining
		long count4 = list.stream()
					.map(s -> s+s)	
					.filter(s->s.startsWith("c"))
					.count();
	}

}
