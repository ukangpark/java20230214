package ch08.lecture.p05cast;

public class C03Instanceof {
	public static void main(String[] args) {
		MyInterface02 o1 = new MyClass021();
		MyInterface02 o2 = new MyClass022();
		
		boolean a = o1 instanceof MyClass021; //true
		boolean b = o1 instanceof MyInterface02; //true
		boolean c = o1 instanceof MyClass022; //false
		
		System.out.println(o2 instanceof MyClass022); //true
		System.out.println(o2 instanceof MyInterface02); //true
		System.out.println(o2 instanceof MyClass021); //false
		
		
		
	}

}
