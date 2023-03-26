package ch18.lecture.p03inputstream;

import java.io.*;

public class C07InputStream {
	public static void main(String[] args) {
		String src = "output/강아지1.jpg";
		String des = "output/강아지1_copy4.jpg";
		
		try(var is = new FileInputStream(src);
				var os = new FileOutputStream(des);) {
			
			//크기까지 같게 만들어줄수있는 메소드
			is.transferTo(os);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
