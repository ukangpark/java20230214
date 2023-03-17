package ch17.lecture.p02terminal;

import java.util.*;

public class C08MaxMin {
	public static void main(String[] args) {
		int[] arr = {3,1,9,0,2,4,5};
		int max = Arrays.stream(arr)
				.max()
				.getAsInt();
		
		System.out.println(max);
		
		int min = Arrays.stream(arr)
				.min()
				.getAsInt();//IntStream은 getAsInt메소드를 가짐(get이 없음) optionalInt구현클래스를 리턴함
		
		System.out.println(min);
	}

}
