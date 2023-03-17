package ch17.lecture.p02terminal;

import java.util.*;

public class C04Match {
	public static void main(String[] args) {
		//match (모두 boolean타입 리턴) match는 predicate를 받음 predicate는 test추상메소드를 지님 -> test메소드에 원소들을 하나씩 대입
		//allMatch
		//anyMatch
		//noneMatch
		
		List<Integer> list = List.of(3,5,7,9,10);
		
		//allMatch
		boolean r1 = list.stream().allMatch(e -> e > 0);//모두 0보다 큰가
		System.out.println(r1);//true
		
		//anyMatch
		boolean r2 = list.stream().anyMatch(e -> e < 0);//하나라도 음수가 있는가
		System.out.println(r2);//false
		
		//noneMatch
		boolean r3 = list.stream().noneMatch(e -> e < 0);//모두 음수가 아닌가
		System.out.println(r3);//true
	}

}
