package ch05.lecture.p04string;

public class C03Split {
	public static void main(String[] args) {
		//split
		// 특정 문자 패턴으로 문자열을 나누어서 배열로 리턴
		
		String str1 = "hello,java,world,html,css";
		String[] arr1 = str1.split(","); //,기준으로 문자를 나눈다.
		
		System.out.println(arr1.length);
		System.out.println(arr1[0]);
		System.out.println(arr1[4]);
		
		String str2 = "spring react vue angular isp sass";
		String[] arr2 = str2.split(" ");//split은 스트링배열타입이기 때문에 변수에 담아서 쓰려면 스트링배열로 만들어줘야함
		
		System.out.println(arr2.length);
		System.out.println(arr2[0]);
		System.out.println(arr2[arr2.length - 1]);
		
		String str3 = "I'm ironman.";//패턴: 빈문자열
		String[] arr3 = str3.split("");
		
		System.out.println(arr3.length);
		System.out.println(arr3[3]);
		System.out.println(arr3[arr3.length - 1]);
	}

}
