package ch03.lecture.p06string;

public class C04IndexOf {
	public static void main(String[] args) {
		//indexOf
		//특정 문자(열)가 처음 나타나는 위치(index) 확인
		//return type : int
		
		String str1 = "spring";
		
		int a = str1.indexOf("ring"); //2
		System.out.println(a);
		
		int b = str1.indexOf('i'); //3
		System.out.println(b);
		
		String str2 = "java";
		System.out.println(str2.indexOf('a'));
		System.out.println(str2.indexOf("a"));
		
		//없으면 -1 리턴함
		String str3 = "html";
		System.out.println(str3.indexOf("tm"));//1
		System.out.println(str3.indexOf("mt"));//-1
		
	}

}
