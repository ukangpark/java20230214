package ch06.lecture.P09package;

//import로 패키지명 작성
import ch06.lecture.P09package.package1.MyClass01;
import ch06.lecture.P09package.package2.MyClass02;

public class C02Package {
	public static void main(String[] args) {
		//클래스 이름만 쓰면 풀네임으로 간주하겠다. => import
		MyClass01 o1 = new MyClass01();
		MyClass02 o2 = new MyClass02();
	}

}
