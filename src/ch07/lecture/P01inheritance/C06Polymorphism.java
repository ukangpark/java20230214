package ch07.lecture.P01inheritance;

public class C06Polymorphism {
	public static void main(String[] args) {
		Sub06 o1 = new Sub06();
		Super06 o2 = o1;//ok
		
		//위에 두줄을 한줄로 표현하면!
		Super06 o3 = new Sub06(); //ok
		
		Super06 o4 = new Super06();
//		Sub06 o5 = o4;//안됨
		
		//위에 두줄을 한줄로 표현하면!
//		Sub o6 = new Super06();//안됨
	}

}
