package ch06.lecture.P09package;

//static import
// : static 멤버(field, method)
//import static ch06.lecture.P09package.package1.MyClass05.name;
//import static ch06.lecture.P09package.package1.MyClass05.method1;
//import static ch06.lecture.P09package.package1.MyClass05.method2;
//코드가 읽기 어려울수있기때문에 조심해서 사용해야함

import static ch06.lecture.P09package.package1.MyClass05.*;

public class C05StaticImport {
	public static void main(String[] args) {
		
		String n = name;
		
		method1();
		method2();
	}
}
