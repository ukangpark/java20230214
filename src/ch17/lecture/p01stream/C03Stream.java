package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C03Stream {
	public static void main(String[] args) {
		
	//collection -> stream
//	List<Integer> list = List.of(9,8,7,1,2,3,0);
	Collection<Integer> list = List.of(9,8,7,1,2,3,0);
	
//	Stream<Integer> stream1 = list.stream();
//	long count = stream1.count();
//	System.out.println(count);
	
	System.out.println(list.stream().count());
	
	Stream<Integer> stream2 = list.stream();
	Optional<Integer> max = stream2.max(Integer::compareTo);
	System.out.println(max.get());

	}
}
