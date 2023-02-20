package ch04.lecture.p02switch;

public class C02Switch {
	public static void main(String[] args) {
		//break
		//switch 내 실행 흐름 종료
		
		int val = 1;
		
		switch (val) {
		case 1:
			System.out.println("code 1");
		case 2:
			System.out.println("code 2");
		break;
		case 3:
			System.out.println("code 3");
		default:
		}
	}

}
