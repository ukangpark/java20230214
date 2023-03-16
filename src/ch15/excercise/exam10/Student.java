package ch15.excercise.exam10;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	@Override
	public int compareTo(Student o) {
//		if(score < o.score) return -1;
//		else if(score == score) return 0;
//		else return 1;
		
		return this.score - o.score;
	}
	
	
	public Student (String id, int score) {
		this.id = id;
		this.score = score;
	}
	

}
