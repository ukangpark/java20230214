package ch11.lecture.p03finally;

public class C03Finally {
	public static void main(String[] args) {
		
		try {
			boolean a = true;
			if (a) {
				return;
			}
		//무조건 실행시키고 싶은 코드가 있다면, catch블럭 없이 try finally문을 사용할수있음
		//예외상황 상관없이 사용가능하다는 말
		//하지만 catch문을 사용한다면 finally는 마지막에 작성되야함
		}finally {
			System.out.println("finally block");
		}
	}

}
