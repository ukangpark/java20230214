package ch08.excersice.exam08;

import java.io.*;
import java.lang.constant.*;

public class C04Instanceof {
	public static void main(String[] args) {
		String s1 = "java";
		
		System.out.println(s1 instanceof String);//true
		System.out.println(s1 instanceof Object);//true
		System.out.println(s1 instanceof CharSequence);//true
		System.out.println(s1 instanceof Comparable);//true
		System.out.println(s1 instanceof Serializable);//true
		System.out.println(s1 instanceof Constable);//true
		System.out.println(s1 instanceof ConstantDesc);//true
	}

}
