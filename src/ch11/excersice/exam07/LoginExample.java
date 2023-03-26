package ch11.excersice.exam07;

public class LoginExample {
	public static void main(String[] args) {
		
		try {
			login("whiet", "12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String pw) throws Exception {
		//id가 blue가 아니라면 NotExistIDException을 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디없음");
		}
		//pw가 12345가 아니라면 WrongPasswordException을 발생시ㅣㅁ
		if(!pw.equals("12345")) {
			throw new WrongPasswordException("비번틀림");
		}
	}

}
