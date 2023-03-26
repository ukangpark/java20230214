package ch17.lecture.p03intermediate;

import java.util.*;

public class C06Peek {
	public static void main(String[] args) {
		//중간에 코드들이 잘 실행되고 있는지 확인하고 싶을 때 많이 사용(버그 잡을 때)
		(new Random()).ints(5)
					.peek(System.out::println)//5개의 랜덤한 인티저값이 나옴
					.forEach(System.out::println);//5개의 랜덤한 인티저값이 나옴
					//순서대로 실행되는게 아님!! 최종연산을 만나면 중간연산과 한꺼번에 실행됨
	}

}
