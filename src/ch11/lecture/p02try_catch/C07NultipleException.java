package ch11.lecture.p02try_catch;

public class C07NultipleException {
	public static void main(String[] args) {
		try {
		int[] a = {0,1};
		
		//ArrayIndexOutOfBoundsException => RuntimeException이다. 할 수 있음
		//ArithmeticException => RuntimeException이다. 할 수 있음
		int c = 3 / a[0];
		
		//두개의 공통된 상위 타입인 RuntimeException으로 한번에 사용할 수 있음(다형성)
		
		}catch(Throwable e) { //object는 안됨 왜 -> 던진것만 잡을 수 있기 때문에
			e.printStackTrace();
			
		}
		
		System.out.println("continue..");
	}


}
