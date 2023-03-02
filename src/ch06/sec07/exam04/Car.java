package ch06.sec07.exam04;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car() {}										//1.생성자(기본생성자)
	
	Car(String model) {								//2.파리미터1개가지는 생성자
		this.model = model;
	}
	
	Car(String model, String color) {				//3.파라미터2개가지는 생성자
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {	//4.파라미터3개가지는 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
