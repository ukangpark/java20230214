package ch09.lecture.p02anonymous;

public class C09FinalVariable {
	// 로컬클래스는 감싸고 있는 메소드의
	// 지역변수(파라미터)를 사용할 수 있다.
	// 이때, 이 지녁변수(파라미터)는 final이어야 한다.

	public static void main(String[] args) {
		final int i = 10;
//		i = 11;//다시 할당 불가
		class LocalClass {
			void method1() {
				System.out.println(i);
			}
		}
	}

	public void method1() {
		int i = 1;
		// final이 없으면 묵시적으로 final (effectively final)
//		i = 2;//사용하지 못함
		class LocalClass {
			void method1() {
				System.out.println(i);
			}

		}
	}

	// 어디선가 메소드 호출하고 값을 할당받을 때 한번 할당되고 다시 할당불가
	public void method2(final int param) {
		class LoclaClass {
			void method3() {
				System.out.println(param);
			}
		}
	}

	public void method3(int param) {
		//final이 없으면 묵시적으로 final (effectively final parameter)
		//감싸고있는 메소드에서만 일어남
//		param = 3;//안됨
		class LocalClass {
			void method4() {
				System.out.println(param);
			}
		}
	}
}
