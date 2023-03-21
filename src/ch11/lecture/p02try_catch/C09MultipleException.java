package ch11.lecture.p02try_catch;

public class C09MultipleException {
	public static void main(String[] args) {
		try {
			// 여러 exception 발생 가능
			// 상위타입으로 한방에 잡아도 되고, | (or)사용해도 됨
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
//		}catch (NullPointerException e) {
//			e.printStackTrace();
//		}
	}

}
