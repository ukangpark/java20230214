package ch11.lecture.p02try_catch;

public class C01TryCatch {
	public static void main(String[] args) {
		int a = 0;
		int b = 3;
		
		//안쪽에 있는 코드는 예외를 발생할 수 있겠군 
		try {//exception이 발생할 수 있는 코드 작성 앞뒤 코드 들어가도 무방함
//			int a = 0;
//			int b = 3;
		int c = b / a; // 예외를 만났다!! 객체가 생성됨!! 그 순간 바로 catch로 객체 잡아서 고침(바로 다음줄에 있는 코드는 실행되지 않음)
		System.out.println(1);
		}catch(ArithmeticException e) {
			//발생한 exception을 잡아서 실행하는 코드 작성
			//jvm이 프로그램을 실행하다가 잘못된걸 만나면 객체를 만나서 던짐-> 던진 걸 잡음=>catch -> 어떤걸 잡는지 ()안에 작성해야함
			//던저진 객체의 참조값을 받을 변수를 지정해야함=> e
//			e.printStackTrace();
			System.out.println(2);
		}
		System.out.println("continue...");
	}

}
