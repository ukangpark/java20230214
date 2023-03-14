package ch15.lecture.p01list;

import java.util.*;

public class C01List {
	//java.util.(<-패키지안에있음)List(interface)
	//순서가 있는 컬렉션
	//순서가 있기 때문에 각 원소를 index로 사용할수있음
	//각 아이템(element,원소)는 index로 접근 가능
	
	public static void main(String[] args) {
		//새 리스트 만들기
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();
//		var list = new ArrayList<String>();
		
		//element 추가 add메소드
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("java");//순서가 있기 때문에 중복된 원소 사용가능
		
		//element 얻기 get메소드
		list.get(0);
		list.get(1);
		//사용할거면 변수에 담기
		String e1 = list.get(2);
		String e2 = list.get(3);
		
		//list 크기 size메소드
		int size = list.size();
		
		//특정 index의 element 지우기 remove메소드
		//지운 후 오른쪽의 값이 왼쪽에 채워짐
		list.remove(2);//2번인덱스가 사라졌으니 크기는 3이됨
		System.out.println("지운후 크기 : " + list.size());//3
		System.out.println("지운후 2번 index의 값 : " + list.get(2));//3번인덱스가 2번인덱스로->java
		
		//특정 idex의 값 바꾸기 set메소드
		list.set(2, "react");
	}

}
