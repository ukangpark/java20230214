package ch05.lecture.p09main;

public class C01MainArguments {
	public static void main(String[] args) {
		
		//아규먼트 없이 실행
		//java C01MainArguments
		
		//아규먼트 전달 실행
		//java C01MainArguments Hello Java'
		
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
//		System.out.println(args[2]);//오류
		System.out.println("명령문들...");
	}

}
