package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.*;

public class Sub01 extends Super01 {
	public void method2() {
		method1(); // 상속받은거여서 된다.
		this.method1();//상속받은건 자기라 할수있으니까 this가능
		super.method1();//부모메소드니까 super가능
	}
	public void method3() {
		Super01 o1 = new Super01(); 
//		o1.method1(); //안됨 -> 다른 패키지여서 안됨
	}
}
