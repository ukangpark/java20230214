package ch11.lecture.p04throw;

public class C11Throw {
	public static void main(String[] args) {
		//checkedException을 사용할 경우, throws로 넘기거나 catch로 잡거나 할수있음
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
								//throws로 넘기거나 catch로 잡거나
	public static void method1() throws ClassNotFoundException {
		Class.forName("");
	}

}
