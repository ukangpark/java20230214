package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			//여러 exception 발생 가능
			//exception이 발생하면 첫번째 catch부터 순차적으로 확인 후, 잡히고 메소드실행후 다음 흐름으로 넘어감
			//상위타입의 exception이 가장 위에 있으면, 아래에 있는 하위타입의 exception에 도달할수없기때문에 에러발생
//		}catch (RuntimeException e) {
//			//아래 catch 블럭의 exception보다
//			//상위 타입의 exception catch 블럭을 먼저 작성할 수 없다.
//			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (ClassCastException e) {
			e.printStackTrace();
		}catch (Exception e) { //NullPointerException은 여기서 잡히겠죠~?
			e.printStackTrace();
		}
	}

}
