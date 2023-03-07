package ch07.lecture.p07sealed;

public class C03Sealed {
	
}

sealed class Super03 permits Sub031 {}
//봉인 해제도 가능
non-sealed class Sub031 extends Super03 {}
//아무클래스나 상속 가능
class Sub0311 extends Sub031 {}
