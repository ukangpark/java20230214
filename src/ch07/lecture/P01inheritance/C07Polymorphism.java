package ch07.lecture.P01inheritance;

public class C07Polymorphism {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		Animal a2 = new Fish();
		
		a1.breath();//폐로 호흡한다.
		a2.breath();//아가미로 호흡한다.
	}

}

class Animal {
	public void breath() {
		System.out.println("호흡한다.");
	}
}

class Horse extends Animal {
	public void breath() {
		System.out.println("폐로 호흡한다.");
	}
}
	class Fish extends Animal {
		public void breath() {
			System.out.println("아가미로 호흡한다.");
		}
	}
