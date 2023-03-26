package ch11.lecture.p03finally;

public class C02Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			
			if(a) {
				return ;
			}
				System.out.println("try block..");
			
		}catch(NullPointerException e) {
			System.out.println("exception block...");
		}finally {
			//try block안에서 무슨일이 일어나든 상관없이 무조건 실행됨(return이 일어나더라도..)
			System.out.println("finally block..");
		}
		System.out.println("continue..");//해당코드는 return이 됐기 때문에 실행되지 않음
	}

}
