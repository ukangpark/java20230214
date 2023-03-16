package ch15.lecture.p07treeSet;

import java.util.*;

public class C02TreeSet {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.addAll(Set.of(3, 1, 10, 20, 3000, 15, 7, 9, 2500, 100));
		
		System.out.println(set);
		
		//first
		System.out.println(set.first());
		
		//last
		System.out.println(set.last());
		
		//lower 어떤 값 기준으로 작은 것을 알고싶다
		System.out.println(set.lower(50));
		
		//higher 어떤 값 기준으로 큰 것을 알고 싶다.
		System.out.println(set.higher(50));
		
		//floor (lower와 비슷) 어떤 값을 포함하여 어떤 값 기준으로 작은 것을 알고싶다.
		
		System.out.println(set.floor(20));
		
		//ceiling (higher와 비슷) 어떤 값을 포함하여 어떤 값 기준으로 큰 것을 알고싶다.
		System.out.println(set.ceiling(50));
		
		//거꾸로 정렬된 navigableSet 리턴
//		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println(set.descendingSet());
	}

}
