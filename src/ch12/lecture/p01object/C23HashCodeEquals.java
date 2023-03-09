package ch12.lecture.p01object;

import java.util.*;

public class C23HashCodeEquals {
	public static void main(String[] args) {
		//중복 없는 원소의 모임(Collection)
		Set set = new HashSet();
		
		System.out.println(set.size());//0 집합이 처음만들어졌으니까
		
		set.add(100);
		
		System.out.println(set.size());//1 하나의 원소가 들어갔으니까
		
		set.add(200);
		
		System.out.println(set.size());//2 두개의 원소가 들어갔으니까
		
		set.add(100);
		
		System.out.println(set.size());//2 중복이되는 원소니까 안들어감 (존재하지않은원소만 추가)
	}

}
