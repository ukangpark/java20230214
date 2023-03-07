package ch07.lecture.p08super;

public class C03Super {
}

class Super03 {
	Super03(int i) {
	}
}

//왜 오류? -> 파라미터 없는 생성자가 자동으로 생성되지 않았기 때문에
class Sub03 extends Super03 {
	Sub03() {
		//자동으로 삽입되는 상위클래스 기본생성자 호출 코드
		//는 동작하지 않음 (왜? 없으니까)
//		super();
		//따라서 명시적 호출해야함
		super(3);
	}
}