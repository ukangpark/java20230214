package ch17.lecture.p02terminal;

import java.util.*;

public class C09Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(9,1,2,3,5);
		
		Integer sum = list.stream()
			.reduce((a,b)-> a+b)//어떤기능이 람다로 들어감(합계구해보자)
					//두개의 값이 들어가서 어떠한 결과를 내는것
					//결과가 첫번째 파라미터에 들어가고 세번째요소가 두번째 파라미터로 들어감
			.get();
		
		System.out.println(sum);
		
		Integer max = list.stream()
				.reduce(Math::max)
				.get();
		System.out.println(max);
		
		Integer min = list.stream()
				.reduce(Math::min)
				.get();
		System.out.println(min);
	}

}
