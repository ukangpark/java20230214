package ch11.lecture.p04throw;

public class C01Throw {
											//던지는 객체 타입 명시
	public static void main(String[] args) throws Throwable{
	//던지는 코드를 작성해보자
	//catch는 던지는 걸 잡았으니까 실행됬겠죠~?
		
	//Throwable 타입의 객체를 던질 수 있음
		Throwable a = new Exception();
				
		throw a; //던지는 코드
		//객체를 던지면 해당 코드가 있는 메소드에 표시해줘야함

	}
}
