package com.core.interview.programs;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
		List<? extends Number> foo4 = new ArrayList<Integer>(); // Integer extends Number
		List<? extends Number> foo5 = new ArrayList<Double>();  // Double extends Number
//		foo3.add(20);
//		foo4.add(10);
//		foo5.add(30);
		System.out.println("foo3:"+foo3);
		System.out.println("foo4:"+foo4);
		System.out.println("foo5:"+foo5);
		
		List<? super Integer> foo6 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
		List<? super Integer> foo37 = new ArrayList<Number>();   // Number is a superclass of Integer
		List<? super Integer> foo38 = new ArrayList<Object>();   // Object is a superclass of Integer
		
		foo6.add(10);
		//foo6.add(10.2);
		foo37.add(12);
		//foo37.add(12.5d);
		
		System.out.println("foo6:"+foo6);
		System.out.println("foo37:"+foo37);
		System.out.println("foo38:"+foo38);
		
		List<? super Number> foo39 = new ArrayList<Number>();
		foo39.add(13);
		foo39.add(14.5);
		foo39.add(15.5d);
		
	}

}
