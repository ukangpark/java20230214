package ch07.lecture.p08super;

public class C02Super {

}

class Super02 {
	Super02() {
		
	}
}

//class Sub02 extends Super02 {} //생략을 풀어써보면,
class Sub02 extends Super02 {
	Sub02() {
		super();
	}
}
