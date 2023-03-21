package ch11.lecture.p04throw;

public class C03Throw {
	public static void main(String[] args) {
//		method1(); //호출한다면 던진다고 명시한 메소드니까 잡을 준비해야함 (try catch로 감싸기)
		
		try {
			method1();//던진걸 받은 메소드는 
		} catch (ClassNotFoundException e) { //catch에서 잡았죠?
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}

}
