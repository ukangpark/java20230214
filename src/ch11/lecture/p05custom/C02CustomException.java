package ch11.lecture.p05custom;

public class C02CustomException {
	public static void main(String[] args) throws Exception {
		Exception e = new Exception();//파라미터없는 생성자를 만듦
		Exception e2 = new Exception("some message");//파라미터있는 생성자 만듦
		
//		System.out.println(e.getMessage());
//		System.out.println(e2.getMessage());
				
		throw e;
//		throw e2;
	}

}
