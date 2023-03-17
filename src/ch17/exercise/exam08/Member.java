package ch17.exercise.exam08;

public class Member {
	private String name;
	private String job;
	public Member(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}

	@Override
	public String toString() {
		return "{name:" + name + ", job:" + job + "}";
	}
	
	
	
	
	

}
