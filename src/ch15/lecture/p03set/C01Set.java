package ch15.lecture.p03set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		//set : 순서없음, 중복안됨
		Set<Integer> set = new HashSet<>();
		
		//add메소드 element 추가
		set.add(30);
		set.add(90);
		set.add(7);
		set.add(3);
		set.add(90);//중복된건들어가지않음
		System.out.println(set);//내가 넣은 순서대로 출력되지 않음
		
		//size메소드 크기확인
		int size = set.size();
		System.out.println(size);//4 왜 5가 아닐까 -> 중복된건들어가지않음
		System.out.println(set);
		
		//remove
		set.remove(3);
		
		System.out.println(set.size());
		System.out.println(set);
		
		//전체탐색 (고전적 for문은 사용안됨 -> index가 없기 때문에)
		System.out.println("향상된 for==============");
		for (Integer e : set) {
			System.out.println(e);
		}
		
		System.out.println("Iterater===============");
		//Set에 주로 쓰임(향상된 for문이 없던시절)
		//Iterator 인터페이스
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()/*탐색할게있는가*/) {
			System.out.println(iter.next()/*다음것을 탐색해라*/);
		}
		
		System.out.println("forEach==================");
		set.forEach(e -> System.out.println(e));
		set.forEach(System.out::println);
	}
	
	

}

