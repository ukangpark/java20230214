package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C16Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,2,3,2,2,2);
		
		Map<Integer, Long> r1 = list.stream() //왜 Long? ->counting()(value값)은 long타입을 반환하기 때문에
			.collect(Collectors.groupingBy(e->e, Collectors.counting()));//첫번째 파라미터-key값을 저장 (원소가 key가 되는 거니까 e->e)
													//두번째파라미터(Collector를 받음) 키값들을 어떻게 합쳐줄것인가 (counting을 사용하여 같은 키값의 원소의 갯수를 구해줄것이다) 
		System.out.println(r1);
	}

}
