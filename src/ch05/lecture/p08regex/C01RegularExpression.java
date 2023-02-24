package ch05.lecture.p08regex;

import java.util.Arrays;

public class C01RegularExpression {
	public static void main(String[] args) {
		//regular expression
		//정규식, 정규표현식, 정규식표현
		
		String str = "java ,    css, html   ,       spring";
		
		String[] arr1 = str.split(",");
		System.out.println(Arrays.toString(arr1));
		
		//콤마 양옆의 공백을 없애겠다.
		String[] arr2 = str.split("\\s*,\\s*");
		System.out.println("1" + Arrays.toString(arr2));
		
		//콤마 앞의 공백을 없애겠다.
		String[] arr3 = str.split("\\s*,");
		System.out.println("2" + Arrays.toString(arr3));
		
		String[] arr4 = str.split(",\\s*");
		System.out.println("3" + Arrays.toString(arr4));
				
	}

}
