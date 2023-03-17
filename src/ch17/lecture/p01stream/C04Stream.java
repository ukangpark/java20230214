package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C04Stream {
	public static void main(String[] args) {
		//collection(Set) -> Stream
		Collection<Integer> set = Set.of(9,2,10,20,21,98,0,3);//중복저장불가
		
		Stream<Integer> stream1 = set.stream();
		long count = stream1.count();
		System.out.println(count);
		
		//위의 코드 간략화
		System.out.println(set.stream().count());
		
		Stream<Integer> stream2 = set.stream();
		Optional<Integer> max = stream2.max(Integer::compareTo);
		System.out.println(max.get());
	}

}
