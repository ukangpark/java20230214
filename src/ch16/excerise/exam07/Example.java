package ch16.excerise.exam07;

public class Example {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
//		int max1 = maxOrMin((x, y) -> Math.max(x, y));
		//static 메소드참조로 변경하면
		int max1 = maxOrMin(Math::max);
		System.out.println("최대값: " + max1);
		//3항연산식
		int max2 = maxOrMin((x, y) -> ((x > y)? x : y));
		System.out.println("최대값: " + max2);
		//if문
		int max3 = maxOrMin((x, y) -> {
			if (x>y) {
				return x;
			}else {
				return y;
			}
		});
		System.out.println("최대값: " + max3);
		
		
		//최소값 얻기
//		int min1 = maxOrMin((x, y) -> Math.min(x, y));
		//static 메소드참조로 변경하면
		int min1 = maxOrMin(Math::min);
		System.out.println("최소값: " + min1);
		//3항연산식
		int min2 = maxOrMin((x, y) -> ((x>y)? x : y));
		System.out.println("최소값: " + min2);
	}

}
