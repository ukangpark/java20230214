package ch02.lecture.p02type;

public class C13Expression {
	public static void main(String[] args) {
		//연산 중 자동 형변환
		
		byte b1 = 30;
		byte b2 = 10;
		
//		byte b3 = b1 + b2; //byte, short, char, int의 연산 결과는 int
		int i3 = b1 + b2; //정수 타입에 담아주면됨
		
		byte b4 = (byte)(b1+b2);//굳이  byte에 담고 싶으면 형변환 해줘야함
		byte b5 = 30 + 10;//값의 결과만을 출력하기 때문에 이코드는 가능
		
		// 정수간의 연산에서 long이 포함된 연산의 결과는 long
		long l6 = 30;
		long l7 = 10;
//		int i8 = l6 + l7;
		long l8 = l6 + l7;
		
		int i9 = 20;
		long l10 = i9 + l7;
		
		int i10 = (int) (i9 + l7);
		
		//정수와 실수끼리 연산 결과는 실수
		int i11 = 30;
		double d11 = 3.14;
		
		double d12 = i11 + d11;
		
	}
}
