package ch06.lecture.P10access;

import ch06.lecture.P10access.package1.*;

public class C03AccessModifier {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
//		MyClass03 o2 = new MyClass03(6);//안됨 -> private
//		MyClass03 o3 = new MyClass03("java");//안됨 -> package private
	}

}
