package ch09.Excercise.exam04;

public class CarExample {
	public static void main(String[] args) {
		//인스턴스 중첩 클래스
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		
		//static 중첩 클래스
		Car.Engine engine = new Car.Engine();
	}

}
