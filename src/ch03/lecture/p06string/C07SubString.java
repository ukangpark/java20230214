package ch03.lecture.p06string;

public class C07SubString {
	public static void main(String[] args) {
		//substring
		//문자열의 일부를 리턴
		//return type : String
		
		String str1 = "가나다라 마바사 아자가카타파하 하하하하호오히";
		//첫번째 파라미터 : 시작 index(포함)
		//두번째 파라미터 : 종료 index(포함안됨)
		String res1 = str1.substring(0,2);
		System.out.println(res1);
		
		System.out.println(str1.substring(5, 8));
		
		System.out.println(str1.substring(0, str1.length()));
		
		//파라미터 하나 : 입력한 인덱스부터 시작 ~ 끝까지
		System.out.println(str1.substring(4));
		
		//파라미터가 인덱스를 벗어나면 오류
		String str2 = "java";
//		System.out.println(str2.substring(2, 5));
		
	}

}
