package ch06.lecture.P07constructor;

public class MyClass04 {
	String model;
	int price;
	
	//생성자
	//파라미터로 받아서 초기화
	 MyClass04(String model, int price) {
		 this.model = model;
		 this.price = price;
	 }
	
	void desc() {
		System.out.println("모델: " + model);
		System.out.println("가격: " + price);
		
	}

}
