package ch15.lecture.p06stack;

import java.util.*;

public class C01Stack {
	public static void main(String[] args) {
		//LIFO, 후입선출, Stack
		//주요 메소드
		//push : 새 아이템 추가
		//pop : 아이템 꺼내기(삭제)
		
		Stack<String> stack = new Stack<>();
		
		stack.push("backho");
		stack.push("chisoo");
		stack.push("taesup");
		stack.push("daeman");
		stack.push("taewoong");
		
		System.out.println(stack.size());//5
		
		String s1 = stack.pop();//taewoong (마지막에 들어간게 나옴)
		System.out.println(s1);
		
		while (stack.size()>0) {
			System.out.println(stack.pop());//전체탐색을 위해 꺼냄
			//먼저들어간 것 부터 전체탐색!!
		}
		System.out.println(stack.size());//0 전체탐색을 위해 꺼냈으니까
	}

}
