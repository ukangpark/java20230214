package ch17.lecture.p02terminal;

import java.util.*;

public class C12Collect {
	public static void main(String[] args) {
		//수집하는 역할
		List<Integer> list = List.of(1,2,3,9,8,7);
		//3개의 파라미터를 받는것 / 1개의 파라미터를 받는것(이걸많이씀)
		list.stream()
			.collect(() -> new ArrayList<>()/*ArrayList::new*/,(a,b) -> a.add(b)/*List::add*/,(a,b) -> a.addAll(b)/*List::addAll*/);//첫번째 파라미터(여러원소들을 수집하는 곳)우리원소가 들어갈 객체를 리턴함 Supplier의 메소드 T타입
							//두번째 파라미터(어떻게 수집할 건가)스트림에있는 각 원소들을 첫번째 파라미터의 객체에 넣을거야
							//세번째 파라미터(합쳐?뭘...?) 여러개로 나눠진 ArrayList를 어떻게 합칠것인가
//		System.out.println(r1);
	}

}
