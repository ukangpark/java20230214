package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C14FlatMap {
	public static void main(String[] args) {
		//flatMap :
		// 원래 원소를 다른 원소"들!"로 맵핑
		
		List<Integer> list = List.of(3,4,5);
		
		//map : 1 대 1
		long count = list.stream()
		.map(e -> e)
		.count();
		System.out.println(count);// 1 대 1이니까 맵핑후 3개
		
		//flatMap : 1 대 다(0~?)
		long count2 = list.stream()
				.flatMap(e -> Stream.of(0, 0))//-> 하나의 원소가 들어오면 , 2개의 값을갖는 스트림을 리턴하겠다. => 원소하나를 받아서 어떠한 stream을 리턴해줘야함
				.count();
		System.out.println(count2);//1개가들어오면 2개가 리턴되기때문에 총 토탈 갯수는 6이됨
	}

}
