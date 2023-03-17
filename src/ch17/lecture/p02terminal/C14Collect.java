package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C14Collect {
	public static void main(String[] args) {
		//3개의 메소드를 재정의한 메소드를 가진 클래스 넣어주면 됨 Collectors
		List<Integer> list = List.of(1,2,5,9,10);
		
		List<Integer> r1 = list.stream()
			.collect(Collectors.toList());//Collectors의 안의 List로 만들어주는 메소드(toList())
		
		System.out.println(r1);
		
		
		
	}

}
