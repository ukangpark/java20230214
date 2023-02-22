package ch05.lecture.p01array;

public class C04Method {
	
	public static void main(String[] args) {
		methodName(3, 4);// 메소드 호출(실행) 
		//파라미터의 목록이 생성되어있으면 같은 파라미터를 사용해야함(js와 차이점)
		
		methodName2(new int[3]);
		
		methodName2 (new int[] {1, 2, 3});
	}
	
	public static void methodName2(int[] arr) {
		
	}
	
	//method
	//js의 함수와 같은 개념(기능)
	//접근범위 static인지아닌지 리턴타입 메소드명(파라미터 목록들) {}
	public static void methodName(int param1, int param2) {
		
	}
}
