package ch11.lecture.p02try_catch;

public class C05MultipleException {
	public static void main(String[] args) {
		//어떠한 코드는 exception을 여러개 발생시킬 수 있음
		
		try {
		int[] a = {0,1,2};
		
		//ArrayIndexOutOfBoundsException
		//ArithmeticException
		int c = 3 / a[3];
		
		}catch(ArithmeticException e) {
			e.printStackTrace();
		//각각의 예외를 잡는 catch문을 여러개 사용하면 됨
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue..");
	}

}
