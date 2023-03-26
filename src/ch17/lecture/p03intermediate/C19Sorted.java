package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C19Sorted {
	public static void main(String[] args) {
		
		IntStream.range(1, 6)
			.boxed()
			.sorted(Comparator.reverseOrder())//IntStream에 Comparator를 받는 sorted는 존재하지 않기 때문에 IntStream을 참조타입 Stream(Integer)로 변경해야함 -> boxed()
			.forEach(System.out::println);
	}

}
