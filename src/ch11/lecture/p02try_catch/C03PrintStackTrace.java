package ch11.lecture.p02try_catch;

public class C03PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 3;
			
			int c = b / a;
			
			System.out.println("try block continue");
		}catch(ArithmeticException e) {
			//catch block
			//아무것도 작성하지 않으면 예외가 발생했다는 것을 볼 수 없음(문제없는 코드로 인식될수있음)
			//예외가 발생했다는 흔적을 남겨줘야함
//			System.out.println("예외발생");
			e.printStackTrace(); //exception 객체가 가지고 있는 출력된 내용을 출력해라(힌트내용이 나오니까 별일없으며 호출하자)
		}
		
		System.out.println("program continue");
		
	}

}
