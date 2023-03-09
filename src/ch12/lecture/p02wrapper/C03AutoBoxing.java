package ch12.lecture.p02wrapper;

public class C03AutoBoxing {
	public static void main(String[] args) {
		//autoBoxting
		Byte b = 3;
		Short s = 20000;
		Integer i = 200000;
		Long l = 99L;
		Float f = 3.14F;
		Double d = 3.14;
		Character c = '가';
		Boolean bool = true;
		
		//오른쪽에 있는 값과 상관없이 모두는 오브젝트다 할수있음
		//오브젝트에 넣어서 사용가능
		Object o1 = b;
		Object o2 = bool;
		
		//값을 한번에 넣을 수 있음
		Object o3 = true; 
		Object o4 = 200000;
	}

}
