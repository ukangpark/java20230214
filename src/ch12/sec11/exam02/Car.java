package ch12.sec11.exam02;

public class Car {
	//필드
	private String model;
	private String owner;
	
	public Car() {
		
	}
	public Car(String model) {
		this.model = model;
	}
	
	//메소드
	public String getNodel() {return model;}
	public void setModel(String model) {this.model = model;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
