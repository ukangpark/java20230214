package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C01OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		//바이트 단위를 문자단위로 변환하기
		String fileName = "output/byte1.txt";
		OutputStream os = getOutput(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(os);//위에서 받아온 아웃풋스트림을 writer로 감싼다. 
		
		
//		os.write('a'); //영어는 한바이트여서 바이트단위에서도 사용가능
//		os.write('b');
////		한글을 쓰고싶은데(2바이트)
//		os.write('한');//출력되지 않음
		//아웃풋으로 문자단위스트림을 쓸 수있다.
		//OutputStreamWriter
		osw.write('a');
		osw.write('b');
		osw.write('한');
		
		osw.close();//안닫으면 flush가 실행이 안됨 닫아주자~~
		
	}

	public static OutputStream getOutput(String fileName) throws FileNotFoundException {
		OutputStream os = new FileOutputStream(fileName);
		
		return os;
	}
}
