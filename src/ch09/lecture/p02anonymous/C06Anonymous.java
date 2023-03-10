package ch09.lecture.p02anonymous;

public class C06Anonymous {
	public static void main(String[] args) {
		class Sub06 extends MyClass06 {
			@Override
			void mymethod() {
				System.out.println("로컬클래스 재정의1");
			}
		}
		MyClass06 o1 = new Sub06();
		method1(o1);
		
		//위의 클래스를 줄이면
		MyClass06 o2 = new MyClass06() {
			@Override
			void mymethod() {
				System.out.println("로컬클래스 재정의2(익명클래스");
			}
		};
		method1(o2);
		
		//위의 코드를 더 줄이면 method1을 호출할때 파라미터 o2를 넣어줌
		method1(new MyClass06() {
			@Override
			void mymethod() {
				System.out.println("로컬클래스 재정의3 (익명클래스, 아규먼트)");
			}
		});
	}
	
	public static void method1(MyClass06 param) {
		param.mymethod();
	}
}

abstract class MyClass06 {
	abstract void mymethod();
}
