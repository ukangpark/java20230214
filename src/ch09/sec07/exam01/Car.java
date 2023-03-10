package ch09.sec07.exam01;

public class Car {
	//필드에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	//필드에 익명 자식 객체 대입
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};
	
	//메소드(필드 이용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	//메소드(로컬 변수 이용)
	public void run2() {
		//로컬 변수에 익명 자식 객체 대입
		//익명클래스를 로컬클래스로 만듦
		Tire tire = new Tire() {
			@Override
			public void roll() {//원래가지고있던게 맘에 안듦 하위클래스를 만듦 이 메소드에서만 사용할꺼라서 따로 클래스 안만듦
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}

	//메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
}
