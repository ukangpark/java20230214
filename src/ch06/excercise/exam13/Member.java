package ch06.excercise.exam13;

public class Member {
	private String name;
	private String id;
	private String pw;
	private int age;
	private boolean married;
	
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	//setter 만들기
	public void setName (String name) {this.name = name;}
	public void setId (String id) {this.id = id;}
	public void setPw (String pw) {this.pw = pw;}
	public void setAge (int age) {this.age = age;}
	public void setMarried (boolean married) {this.married = married;}
	
	//getter 만들기
	public String getName() {return this.name;}
	public String getId() {return this.id;}
	public String getPw() {return this.pw;}
	public int getAge() {return this.age;}
	public boolean isMarried() {return married;}
	

}
