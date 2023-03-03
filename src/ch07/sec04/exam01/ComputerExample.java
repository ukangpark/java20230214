package ch07.sec04.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		//재정의하지 않은 superclass의 결과가 나옴
		Computer computer = new Computer();
		System.out.println("원 면적: " + computer.areaCircle(r));
	}
}
