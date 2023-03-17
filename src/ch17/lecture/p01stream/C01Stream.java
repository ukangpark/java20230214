package ch17.lecture.p01stream;

import java.util.stream.*;

public class C01Stream {
	public static void main(String[] args) {
		//여러원소(element)의 순차적 처리 기능(메소드)을 제공하는 class, interface
		
		//스트림 만들기
		Stream<Integer> stream1 = Stream.of(5,1,3,9,10,0);
		
		//스트림의 메소드 (연산)
		//1.최종 연산(terminal operation)
		//	리턴타입 : Stream이 아닌 것을 리턴함
		//	최종 연산시 중간연산도 같이 실행됨
		
		//갯수 세기 (count)
		stream1.count();//long타입을 리턴함 (Stream아님)
		stream1.findFirst(); //처음만난 원소를 리턴하겠다.->exception발생
		//스트림은 한번흘러간것을 다시 재생불가능 => 최종연산 후 재사용 불가 count라는 최종연산을 했음
		
		//2.중간 연산로 나뉨(intermediate operation)
		//	리턴 타입 : Stream (또다른 스트림을 리턴함-항상그런건아니기때문에 API보기)
	}

}
