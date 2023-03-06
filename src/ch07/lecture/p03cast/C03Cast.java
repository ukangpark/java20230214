package ch07.lecture.p03cast;

public class C03Cast {
	public static void main(String[] args) {
		method1(new Animal()); //자동형변환
		method1(new Horse()); //자동형변환
		method1(new Fish()); //자동형변환
		
		System.out.println("실행 흐름 이어감..");
	}

	public static void method1(Animal a) {
		a.breath(); //호흡한다. 폐로 호흡한다. 아가미로 호흡한다.
		
		//만약 말 객체이면 실행
//		if (a instanceof Horse){
		Horse h = (Horse) a;
		h.run(); //exception 발생
//		}
		
	}
}
