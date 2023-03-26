package ch14.lecture.p02sleep;

public class C01Sleep {
	public static void main(String[] args) throws Exception {
		System.out.println("maint thread start");
		
		Thread.sleep(2000); //2초뒤 다음 코드 시작
		System.out.println("maint thread end");
		
		
	}

}
