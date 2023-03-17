package ch17.lecture.p01stream;

import java.util.stream.*;

public class C07Stream {
	public static void main(String[] args) {
		//IntStream(일반스트림에는 없고 IntStream에만 있는 메소드)
		//특정영역에있는 int를 Stream으로 만들어주는 역할
		IntStream stream1 = IntStream.range(0, 10);//0~9 (시작값(포함됨), 종료값(포함안됨))
		System.out.println(stream1.count());//10
		
		IntStream stream2 = IntStream.rangeClosed(0, 10);//0~10 (시작값(포함됨), 종료값(포함))
		System.out.println(stream2.count());//11
		
	}

}
