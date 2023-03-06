package ch07.excercise.exam10;

public class Computer extends Machine {
	//추상 메소드는 꼭 재정의 되어야 함
	@Override
	public void work() {
		System.out.println("컴퓨터가 실행되고 있음");
	}

}
