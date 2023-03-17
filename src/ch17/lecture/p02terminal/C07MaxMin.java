package ch17.lecture.p02terminal;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,4,1,2,10,0);
		
		Integer max = list.stream()
			//stream에 가지는 타입<T>이 natural ordering인지 아닌지 보장할수 없기때문에 comparator을 사용
			.max((x,y)-> x-y)//max가 optional를 리턴하고 optional은 get을 가짐 / comparator를 파라미터로 받음 -> int를 리턴하는 compare를 가지고 있음 음수/0/양수
//			.max(Integer::compare)
			.get();
		System.out.println(max);
		
		Integer min = list.stream()
					.min((x,y)-> x.compareTo(y))
//					.min(Integer::compareTo)
					.get();
		
		System.out.println(min);
	}

}
