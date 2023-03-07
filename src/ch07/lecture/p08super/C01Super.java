package ch07.lecture.p08super;

public class C01Super {
	public static void main(String[] args) {
		Sub01 o1 = new Sub01();
	}
}

class Super01 {
	Super01() {
		//이 클래스로 인스턴스 만들 때 해야하는 일 <- 1
		System.out.println("상위 클래스 초기화 코드");
	}
}
class Sub01 extends Super01 {
	Sub01() {
		//그 전에 상위클래스의 초기화 작업 해야함 -> 1을 동작하게함
		//상위 클래스 생성자 호출 코드
		super(); 
		// 꼭 먼저 해야함 (작성하지 않으면 자동으로 삽입됨)
		//먼저 일어나야하기 때문에 다른 코드들보다 뒤에 작성될 수 없음
		
		//이 클래스로 인스턴스 만들 때 해야하는 일 <- 2
		System.out.println("하위 클래스 초기화 코드");
		
	}
	
	
}
