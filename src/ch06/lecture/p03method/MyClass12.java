package ch06.lecture.p03method;

public class MyClass12 {
	
	int method1() {
		
		//1. 메소드 종료 
		//2. 오른쪽 값을 호출한 곳으로 return(반환)한다.
		//오른쪽 값은 메소드 리턴타입과 일치해야함
		return 3;
	}
	
	int method2() {
		//메소드에 리턴타입을 명시하면
		//해당타입의 값을 꼭 리턴 해야함
		if (true) { // if문안에서 return을 썼지만 메소드오류 
					// 왜? -> if문을 실행하면서 return값을 못 만날수도 있기 때문에 오류 냄 (리턴은 꼭만나야함!!)
			return 3;
			
		}
		
		return 5;
	}
	
	//자동형변환
	int method3() {
		int a = 3;
		
		return a;
	}
	
//	int method4() {
//		long a = 3L;
//		
//		return a;//오류 
//	}
	
	int method5() {
		short a = 6000;
		
		return a;//short이 int로 형변환이 되기 때문에 오류아님
	}
	
	double method6() {
		double d = 3.14;
		
		return d;
	}
	
	double method7() {
		long l = 33;
		
		return l; //long이 double로 자동형변환 되어 오류아님
	}
	
	void method8() {
		//return 3; //void는 리턴값이 없을 때 사용하는 리턴타입이기 때문에 return값을 반환하면 안됨
					//쓴다면 메소드 종료 역할로만 사용가능
	}

}
