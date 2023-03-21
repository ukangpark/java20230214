package ch11.lecture.p04throw;

public class C02Throw {
	public static void main(String[] args) {
		
//		method1(); //던진걸 여기서 잡으면됨 try catch문으로 감싸기
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
								//던졌으니까 받아야함
	public static void method1() throws Exception {
	//throw 키워드로 객체를 던지면 throws로 어떤 메소든지 간에 상관없고 명시해야함
		
		throw new Exception();//건너건너 완성	
	}
}
