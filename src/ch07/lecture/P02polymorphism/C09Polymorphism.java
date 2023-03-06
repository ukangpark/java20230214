package ch07.lecture.P02polymorphism;

public class C09Polymorphism {
	public static void main(String[] args) {
		//자동타입변환
		Weapon o1 = new Gun();
		Weapon o2 = new Bow();
		Weapon o3 = new Sword();
		
		o1.attack();//총으로 공격합니다.
		o2.attack();//활을 쏩니다.
		o3.attack();//검을 휘두릅니다.
		
		//Gun배열의 객체
		Gun[] o4 = new Gun[3];
		o4[0] = new Gun();
		o4[1] = new Gun();
		o4[2] = new Gun();
		
		o4[0].attack();//총으로 공격합니다.
		o4[1].attack();//총으로 공격합니다.
		o4[2].attack();//총으로 공격합니다.
		
		//Weapon배열의 객체
		Weapon[] o5 = new Weapon[5];
		o5[0] = new Weapon();//공격합니다.
		o5[1] = new Gun();//총으로 공격합니다.
		o5[2] = new Bow();//활을 쏩니다.
		o5[3] = new Sword();//검을 휘두릅니다.
		
		o5[0].attack();
		o5[1].attack();
		o5[2].attack();
		o5[3].attack();
	}

}
