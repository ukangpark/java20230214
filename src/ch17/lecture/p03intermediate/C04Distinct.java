package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C04Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(1);
		list.add(0);
		list.add(0);
		
		Stream<Integer> stream1 = list.stream();//최종연산을 만나기 전까지는 실행하지 않음
		Stream<Integer> stream2 = stream1.distinct();//최종연산을 만나기 전까지는 실행하지 않음
		
		list.add(2);
		
		//최종 연산 실행시 중간연산이 한번에 실행됨
		long count1 = stream2.count();//최종연산이 일어나야 중간연산이 한꺼번에 일어남
		System.out.println(count1);
		
		// 중간연산이 실행되는 모습을 보여주기 위한 소스코드 (이렇게 쓰면 안됨)
		
		
	}

}
