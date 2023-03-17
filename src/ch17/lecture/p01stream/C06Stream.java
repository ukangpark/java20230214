package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C06Stream {
	public static void main(String[] args) {
		//원소가 참조타입인 스트림
		Stream<String> stream1 = Stream.of("java", "spring", "css");
		Stream<Integer> stream9 = Stream.of(4,3,6,90);
		//원소가 기본타입인 스트림
		IntStream stream2 = IntStream.of(3,9,10,1);
		LongStream stream3 = LongStream.of(3,9,10,1);
		DoubleStream stream4 = DoubleStream.of(3.14,9.8,10.8,1.0);
		
		int[] intarr = {9,6,3,1};
//		Stream<Integer> stream6 = Arrays.stream(intarr);//안됨 
		//-> 원소가 기본타입(int)이기 때문에 기본타입을 위한 스트림(IntStream)을 사용해야함
		IntStream stream5 = Arrays.stream(intarr);
		
	}


}
