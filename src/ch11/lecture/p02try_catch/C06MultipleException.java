package ch11.lecture.p02try_catch;

public class C06MultipleException {
	public static void main(String[] args) {
		try {
		int[] a = {0,1};
		
		//ArrayIndexOutOfBoundsException => RuntimeException이다. 할 수 있음
		//ArithmeticException => RuntimeException이다. 할 수 있음
		int c = 3 / a[0];
		
		//두개의 공통된 상위 타입인 RuntimeException으로 한번에 사용할 수 있음(다형성)
		}catch(RuntimeException e) {
			e.printStackTrace();//실제 인스턴스 메소드가 발생하겠죠~!
			
		}
		
		System.out.println("continue..");
	}

}
