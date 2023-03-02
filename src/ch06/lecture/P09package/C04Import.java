package ch06.lecture.P09package;

import ch06.lecture.P09package.package1.MyClass04;//대표로하는 패키지
//import ch06.lecture.P09package.package2.MyClass04;//안됨 -> 사용하려면 풀네임을 인스턴스생성할때 작성해야함

public class C04Import {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		
		ch06.lecture.P09package.package2.MyClass04 o2 = new ch06.lecture.P09package.package2.MyClass04();
	}

}
