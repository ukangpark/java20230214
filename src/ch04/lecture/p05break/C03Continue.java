package ch04.lecture.p05break;

public class C03Continue {
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("실행문1");
			
			if (false) {
			continue;
			}
			
			System.out.println("실행문2");
			
		}
	}

}
