package ch18.lecture.p02outputstream;

import java.io.*;

public class C03Close {
	public static void main(String[] args) {
		
		//try-with-resources
		//try 뒤에 ()둥근 괄호를 사용하여 스트림을 생성해주면 자동으로 닫아줌(close역할을 자동으로 해주는것)
		//auto closable타입만 들어갈 수 있음 
		//닫아준다는 보장을 한다!!
		try (OutputStream os = new FileOutputStream("");){
//			OutputStream os = new FileOutputStream("");//try안에 안하고
			os.write(1);
			os.flush();
//			os.close();//자동으로 닫아주는 방법이있어 안써줘도됨
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
