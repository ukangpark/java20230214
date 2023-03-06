package ch07.lecture.P02polymorphism;

public class C06Polymorphism {
	public static void main(String[] args) {
		
	}
	
	public static Gun getGun() {
		//...
		
		//만났을 때 Gun을 만나게 해야함
		return new Gun();
	}
	
	public static Bow getBow() {
		
	
	//Bow타입의 인스턴스를 리턴하도록 해야함
	Bow b = new Bow();
	return b;
	}
	
	public static Weapon getWeapon() {
		//..
//		Weapon w1 = new Weapon();
//		return w1; //가능
//		
//		Gun gun = new Gun();
//		return gun;//가능
		
		Bow bow = new Bow();
		return bow;//가능
	}
}


