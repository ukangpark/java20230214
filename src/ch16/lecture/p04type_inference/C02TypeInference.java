package ch16.lecture.p04type_inference;

import java.util.*;

public class C02TypeInference {
	//지역변수만 가능
//	var field = 3;//필드에선 일어나지 않음
	
	public static void main(String[] args) {
		
	//지역변수 타입 추론 var
	//var 사용
	//선언과 동시에 초기화 할 때만 사용가능
	int a = 3;
	String b = "java";//넣어주는 값에 따라 타입유추 가능
	
	var c = 5;
	var d = "java";
	
//	var e;
//	e = 9; // 선언과 동시에 초기화 할 때만 가능하니까 불가
	
	Box<String> box1 = new Box<String>();
	Box<String> box2 = new Box<>();
	var box3 = new Box<String>();//오른쪽타입에 의해서 앞의 타입이 유추됨
	
	var list1 = new ArrayList<List<String>>();
	
	//재할당 시, 같은 타입만 가능
	var f = 10;//f는 int로 추론
	f = 11;
//	f = 3.14;//불가 이때 f의 타입은 처음들어간 값의 타입으로 정해졌기 때문에 다른 타입은 할당안됨
	
	//var 사용시 읽기 쉬운 코드인가??를 고민하고 써야함. 생략이 너무 많이 됬기 때문에
	var list2 = new ArrayList<String>();
	
	// 긴 코드...
	
	//이건 ok
	//프로그래머가 코드를 읽는데 무리가 없다.
	for (String item : list2) {
		
	}
	
	//권장하지 않음
	for (var item : list2) {
		//String 타입인지 뭔지 위의 코드자체가 너무 길기 때문에 유추하기 힘듦
		//프로그래머가 코드를 읽는데 무리가 있다.
	}
	
	//var는 키워드가 아님
	int var = 3;//변수명으로도 사용가능 -> 하지만 변수명으로 사용하지 말 것
	
	}
}
