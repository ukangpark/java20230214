package ch06.excercise.exam15;

public class MemberService {
	
	boolean login(String id, String pw) {
		//return id.equals("hong") && pw.equals("12345");
		if (id.equals("hong") && pw.equals("12345")) {
			return true;
		}
		
		return false;
	}
	
	boolean logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
		return true;
	}

}
