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
		//인스턴스 참조 (객체참조 / 객체타입참조)
		//첫번째파라미터(s)의 인스턴스메소드 참조(s.method();)니까 객체타입참조로 바꿀수있음
//		double englishAvg = avg ( s -> s.getEnglishScore() );
		double englishAvg = avg (Student::getEnglishScore);
		System.out.println("영어 평균 점수: " + englishAvg);
		
//		double mathAvg = avg ( m -> m.getMathScore() );
		double mathAvg = avg (Student::getMathScore);
		System.out.println("수학 평균 점수: " + mathAvg);
	}

}
