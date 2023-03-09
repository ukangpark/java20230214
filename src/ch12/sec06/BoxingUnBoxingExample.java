package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		System.out.println("Value: " + obj.intValue());
		
		//Unboxing
		int value = obj; //auto Unboxing
		System.out.println("Value: " + value);
		
		//연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
