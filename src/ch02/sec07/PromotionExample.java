package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 18;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floutValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		
		
	}
}
