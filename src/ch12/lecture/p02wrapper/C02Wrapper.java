package ch12.lecture.p02wrapper;

public class C02Wrapper {
	public static void main(String[] args) {
		int i1 = 3;
		
		//현재버전 (자동으로 포장, auto boxing)
		Integer o1 = i1; //초기버전에선 불가했음 참조타입이고 기본타입이니까
		
		//예전버전(포장, boxing)
		Integer o2 = new Integer(i1); //객체를 생성해줘야했었음
		
		//권장 버전 (포장, boxing) 포장한 결과를 리턴해줌
		Integer o3 = Integer.valueOf(i1);
		
		Number o4 = i1; //auto boxing과 자동형변환이 한꺼번에 일어남
		Object o5 = i1; //auto boxing과 자동형변환
		
		
		i1 = o1;
	}

}
