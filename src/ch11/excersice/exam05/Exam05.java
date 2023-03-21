package ch11.excersice.exam05;

public class Exam05 {
	public static void main(String[] args) {
		
	}
	
	public static void m1() throws Exception {
		//ClassNotFoundException는 CheckedException이기때문에 반드시 잡아줘야함
		method1();
	}
	
	public static void method1() throws NumberFormatException, ClassNotFoundException {
	}

}
