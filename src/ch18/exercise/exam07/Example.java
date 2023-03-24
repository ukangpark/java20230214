package ch18.exercise.exam07;

import java.io.*;

public class Example {
	public static void main(String[] args) {
		String filePath
		= "src/ch18/exercise/exam07/Example.java";
		
		try(
			FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr);
				) {
			
			int rowNumber = 0;
			String rowData = null;
			
			while((rowData = br.readLine()) != null) {
				rowNumber++;
//				System.out.println(rowNumber + ":" + rowData);
				System.out.printf("%3s:%s%n", rowNumber,rowData);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
