package ch08.excersice.exam08;

import java.io.*;
import java.lang.constant.*;

public class C05Intanceof {
	public static void main(String[] args) {
//		method("java");
//		method(new StringBuilder("java"));
		method(new StringBuffer(""));
	}

public static void method(CharSequence c) {
	System.out.println(c instanceof String);
	System.out.println(c instanceof Object);//t
	System.out.println(c instanceof CharSequence);//t
	System.out.println(c instanceof Comparable);//t
	System.out.println(c instanceof Serializable);//t
	System.out.println(c instanceof Constable);
	System.out.println(c instanceof ConstantDesc);
}
}
