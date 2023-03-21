package ch11.lecture.p03finally;

public class C01Finally {
	public static void main(String[] args) {
		try {
			int a = 0;
			int c = 3 / a;
			
			//exception이 발생했냐에 따라서 실행되는 출력문들이 다름
			System.out.println("try block continue..");
		}catch(ArithmeticException e) {
			System.out.println("@@@exception!!@@@");
		}finally {
			//exception 발생 유무와 상관 없이 항상 실행되는 블럭 : finally
			System.out.println("finally block @@@");
		}
		
		System.out.println("continue");
	}

}
