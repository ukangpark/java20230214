package ch04.lecture.p02switch;

public class C05Switch {
	public static void main(String[] args) {
		// switch case (:) statement
		// switch labeled (->) statement

		// expression = statement의 한 부분
		// switch case (:) expression
		// switch labeled (->) expression

		int val = 1;
		String res = switch (val) {
						case 1: {
							yield "값1";
						}
						case 2: {
							yield "값2";
						}
						case 3 : {
							String r = "값" + val;
							yield r;
						}
						default: {
							yield "기본 값";
						}
						};
						
		String res2 = switch (val) {
						case 1 -> {
							yield "값";
						}
						case 2 -> {
							yield "값2";
						}
						case 3 -> {
							String r = "값" + val;
							yield r;
						}
						default -> {
							yield "기본값";
						}
						};			

	}

}
