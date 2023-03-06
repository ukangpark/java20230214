package ch07.lecture.p03cast;

public class C01Cast {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		a1.breath();
//		a1.run(); //안됨 -> Animal에 run()이 있는게 아니니까
		
		//horse가 가지고 있는 메소드도 실행시키고 싶다!
//		Horse h1 = a1;//오류 -> Animal은 Horse이다 할 수 없으니까 => 강제 형변환필요
		Horse h1 = (Horse)a1;// 강제 형변환(type cast)(Horse) -> 문제가 생길것을 각오하고 실행한 코드 (안전하지 않은 코드)
		h1.run(); //실행됨
		
		//fish가 가지고 있는 메소드도 실행시키고 싶다!
		Animal a2 = new Fish();
		a2.breath();
//		a2.swim();//안됨 -> Animal에 swim()이 있는게 아니니까
		
		Fish f1 = (Fish)a2; // 강제 형변환(type cast)
		f1.swim();//실행됨
	}

}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미로 호흡한다.");
	}
	
	public void swim() {
		System.out.println("헤엄칩니다.");
	}
}

class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐로 호흡한다.");
	}
	
	public void run() {
		System.out.println("달립니다.");
	}
}

class Animal {
	public void breath() {
		System.out.println("호흡한다.");
	}
}
