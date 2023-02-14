package ch02.lecture.p01type;

public class C10String {
	public static void main(String[] args) {
		//String (참조타입)
		//문자열 저장
		
		String s1;
		s1 = "hello world";
		s1 = "h";
		s1 = "";
		
		char c1 = '가';
//		s1 = c1; //x 다른 타입의 값을 옮겨담을 수 없음
		
		String s2 = "i am \"ironman\""; //큰따옴표는 역슬래시 사용
		System.out.println(s2);
		
		String s3 = "i \\"; // 역슬래시를 나타내고 싶을 때
		
		String s5 = "<h1>\n\thello \n\t<span>world</span>\n</h1>";
		System.out.println(s5);
		
		//text block (3개씩 2개 총6개의 따옴표)
		//첫번째 엔터 무시
		//가장 작은 들여쓴 줄이 들여쓰기 기준
		//작은따옴표 큰따옴표를 자유롭게 사용가능
		String s6 = """
				<h1>
					'hello'
					<span>"world"</span>
				</h1>
				""";//마지막 3개의 따옴표를 사용하여 들여쓰기 조절하기 꿀팁
		System.out.println(s6);
	}
}
