package ch18.exercise.exam10;

import java.io.*;
import java.util.*;

public class Exam10_2 {
	public static void main(String[] args) {

		// 파일명 입력 받는 코드 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원본 파일 경로: ");
		String oldfile = sc.next(); 
		
		System.out.print("복사 파일 경로: ");
		String newfile = sc.next();
		
		String origin = oldfile;
		String copy = newfile;
		
		File f = new File(origin);
		if(!f.exists()) {
			System.out.println("원본 파일이 존재하지 않습니다.");
			f.mkdirs();
		}
		
		

		// 복사하는 코드 작성

		try (
				FileInputStream fis = new FileInputStream(origin);
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(copy);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {

				if (oldfile.equals(bos)) {
					bis.transferTo(bos);
					System.out.println("복사가 성공되었습니다.");
				}
			
			fos.flush();
			bos.flush();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
