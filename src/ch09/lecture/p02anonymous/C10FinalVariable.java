package ch09.lecture.p02anonymous;

public class C10FinalVariable {
	
	int j;
	
	public void method1() {
		int i = 3; //effectively final
		j = 99;//필드는 해당이 되지 않기 때문에 할당가능
		j = 100;//필드는 해당이 되지 않기 때문에 할당가능
		class LocalClass {
			void method2() {
				System.out.println(i);
				System.out.println(j);
			}
		}
	}

}
