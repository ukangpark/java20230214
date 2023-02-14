package ch02.sec04;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6; //3*10^6
		
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("ver3: " + var3);
		System.out.println("ver4: " + var4);
		System.out.println("ver5: " + var5);
	}

}
