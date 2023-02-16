package ch03.exercise;

public class Q05 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = (double) (lengthTop+lengthBottom)*height/2;
		double area2 = (lengthTop+lengthBottom)*height*1.0/2;
		double area3 = (lengthTop+lengthBottom)*height/2.0;
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
	}

}
