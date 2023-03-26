package ch18.lecture.p02outputstream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
		//스트림 열고
//		OutputStream os = new FileOutputStream("out/output.tex");
		os = new FileOutputStream("out/output.tex");
		//어떤 작업하고
		os.write(1);
		os.flush();
		//작업 끝나면 반드시 닫아야함

		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
//			os.close(); //오류 왜? -> 서로다른 블럭에서 변수를 사용해서 그럼 -> 스트림 여는 코드를 try블럭밖에 선언해야함			
						//밖에 빼줘도 오류 왜 -> null값이 들어갈수도 있기 때문에 -> null체크를 해줘야함
			if (os != null) {
				try {
					os.close();//null체크해줘도 오류 왜 -> checkedExcption을 발생하는 메소드 -> try_catch로 잡아줘야함
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//코드하나 사용하는데 복잡...
			}
		}
	}

}
