package ch16.excerise.exam08;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	private static double avg(Function <Student> t) {
		double sum = 0;
		for (Student s : students) {
			double score = t.apply(s);
			sum += score;
		}
		return sum / students.length;
		
		
	};
	
	
	public static void main(String[] args) {
		double englishAvg = avg ( s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg ( m -> m.getMathScore() );
		System.out.println("수학 평균 점수: " + mathAvg);
	}

}
