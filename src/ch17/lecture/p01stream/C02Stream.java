package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C02Stream {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(9,8,7,1,2,3);
		long count = stream1.count();
		System.out.println(count);
		
		Stream<Integer> stream2 = Stream.of(9,8,7,1,2,3);
		Optional<Integer> max = stream2.max(Integer::compare);
		
		System.out.println(max.get());
		
		//컬렉션에 있는 요소들을 가지고 스트림을 만들수있음(주로사용하는일)
	}

}
