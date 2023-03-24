package ch14.lecture.p04.name;

public class C04Name {
	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {
			
			//생성자 파라미터에 2개의 값을 줌 (첫번째-현재쓰레드에 이름불러옴, 두번째-불러온쓰레드의 이름을 바꾸고싶은 이름을 넣어줌)
			Thread.currentThread().getName();
			
		}, "작업 쓰레드1");
		
		t1.start();
	}

}
