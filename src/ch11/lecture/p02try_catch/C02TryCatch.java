package ch11.lecture.p02try_catch;

public class C02TryCatch {
	public static void main(String[] args) {
		//정상 실행됬을 때 실행
		//실행됨 시작
		try {
			int a = 1;
			int b = 2;
			
			int c = b / a;// 예외발생 코드가 아님 정상작동되니까 다음 코드로 넘어감
			
			System.out.println(1);//요게 실행될 수 있음
		}catch (ArithmeticException e) {
			System.out.println(2);// 예외가 발생하지 않았으니까 catch 실행되지 않음
		}
		
		System.out.println("continue..");
	}

}
