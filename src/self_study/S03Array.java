package self_study;

public class S03Array {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int num1 = 1;
		int num2 = 2;
		
		int index = 0;
		int[] answer = numbers;
		for (int i=num1; i<=num2; i++) {
			answer[i] = numbers[i];
			index++;
			
			System.out.println(answer[index]);
		}
	}

}
