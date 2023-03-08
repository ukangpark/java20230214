package ch12.lecture.p01object;

import java.util.*;

public class C01Object {
	// Object
	//모든클래스의 상위 클래스
	
	public static void main(String[] args) {
		String s1 = "java";
		Object o1 = s1;
		
		Scanner sc = new Scanner("");
		Object o2 = sc;
		
		ArrayList list = new ArrayList();
		Object o3 = list;
		
		C01Object o4 = new C01Object();
		Object o5 = o4;
		
		Object o6 = new MyClass01();
		
		//심지어 기본타입도 Object이다.
		int i = 3;
		Object o7 = i; //기본타입은 참조타입에 넣을 수 있음
		//결국다오브젝트
		
	}
}

//extends Object 원래붙어있음. 생략됨
class MyClass01 extends Object {
	
}
