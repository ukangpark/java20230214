package ch11.lecture.p02try_catch;

public class C04PrintStackTrace {
	public static void main(String[] args) {
		//unchecked exception
		
		try {
		String a = "java";
		System.out.println(a.charAt(4));//unchecked exception 발생함
		}catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//checked exception은 trycatch문을 반드시 작성해야함
		//control + 1 : trycatch문 자동생성가능
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
