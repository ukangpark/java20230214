package ch13.lecture.p01generic;

public class C09Inherit {
	

}

class Super09<T> {}
class Sub09<T> extends Super09<T> {}

class Super10<T,U> {}
class Sub10<T, U> extends Super10<T, U> {}

class Super11<T> {}
class Sub11 extends Super11<String> {} //타입을 명시하면 Sub클래스에서 생략가능

class Super12<T, U> {}
class Sub12<T> extends Super12<T, String> {}

class Super13<T> {}
class Sub13<T, U> extends Super13<T> {} //Sub클래스에서 타입파라미터를 추가할수있음

class Super14<T extends Number> {} //T는 Number다.
//class Sub14<T extends Object> extends Super14<T> {} //super보다 상위타입으로 정의할수 없음
//T는 Object이고 Object는 Number다 할수없음

class Super15<T extends Number> {}
class Sub15<T extends Integer> extends Super15<T> {} //super보다 하위타입이거나 같아야함