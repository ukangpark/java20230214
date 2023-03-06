package ch07.lecture.p03cast;

public class C08Instanceof {
	public static void main(String[] args) {
	//버전에 따라 코드 실행여부가 다름
	//강제 형변환을 쉽게 할 수 있는 문법
		Super08 o1 = new Sub08();
		
		if(o1 instanceof Sub08) {
			Sub08 o2 = (Sub08) o1;
			//o2의 메소드 실행
		}
		
		//위의 코드를 한줄로 줄임
		//pattern matching for instanceof
		if(o1 instanceof Sub08 o2) {
			//o2의 메소드 실행
		}
	}
}

class Super08 {}
class Sub08 extends Super08 {}
