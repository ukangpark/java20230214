package ch15.lecture.p03set;

import java.util.*;

public class C03RemoveIf {
	public static void main(String[] args) {
		//iterator는 너무 길고, 간결한 코드를 사용해서 원하는 것을 지우고 싶을 때 
		//default 메소드 (boolean타입)
		//Predicate라는 객체(interface)를 받음 구현해야하는 메소드는 test메소드(boolean타입리턴함)
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		
		set.removeIf(e -> (e.length() % 2 == 0)/*test메소드를 람다로 재정의한것*/);
		
//		Predicate o1 = new Predicate() {	
//		@Override
//		public boolean test(Set e) {
//			if (e.length() % 2 == 0) {
//				return true;
//			}
//			return false;
//		}
//		}
		
		
		System.out.println(set);
	}

}
@FunctionalInterface
interface Predicate {
	boolean test(Set e);
}