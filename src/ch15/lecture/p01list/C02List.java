package ch15.lecture.p01list;

import java.util.*;

public class C02List {
	public static void main(String[] args) {
		//list 전체 탐색
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("css");
		list.add("html");
		list.add("spring");
		list.add("react");
		
		//for
		System.out.println("for=================");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//향상된 for
		System.out.println("향상된 for=================");
		for (String e : list) {
			System.out.println(e);
		}
		
		//Iterator(list랑은 궁합이 잘 맞지는 않음) while문과 함께 잘쓰임 무언가 탐색하기위해 만들어진 객체
		System.out.println("Iterator=================");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//forEach 메소드 API  -> (Consumer<? super T> action) <- super니까 값을 action에 건내줌(out이니까)
		//(파라미터로 갖는게 consumer타입 list가 가지고 있는 아이템을 action에 건내줌)
		System.out.println("forEach 메소드=================");
		list.forEach(e -> System.out.println(e));//e와 e가 일치함 (::로 줄일수있음)
		
		System.out.println("forEach 메소드=================");
		list.forEach(System.out::println);//out::println
		
		
	}

}
