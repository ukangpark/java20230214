package ch18.exercise.exam10;

import java.io.*;

public class Exam10 {
	public static void main(String[] args) {

		// 파일명 입력 받는 코드 작성
		String origin = "output/강아지1.jpg";
		String copy = "output/강아지1_copy10.jpg";

		// 복사하는 코드 작성

		try (
				InputStream is = new FileInputStream(origin);
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new FileOutputStream(copy);
				BufferedOutputStream bos = new BufferedOutputStream(os);
				) {

				if (origin.equals(origin)) {
					bis.transferTo(bos);
				} else {
					System.out.println("원본파일이 존재하지 않습니다.");
				}
			System.out.println("복사가 성공되었습니다.");
		
			bos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
