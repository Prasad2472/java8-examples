package com.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		/**
		 * Interface BiFunction<T,U,R> 
		 * Type Parameters: 
		 * T - the type of the first argument to the function 
		 * U - the type of the second argument to the function
		 * R - the type of the result of the function
		 */
		
		final BiFunction<String, String, String> concat = (s, k) -> s.concat(" ").concat(k);

		System.out.println("BiFunction Concatination: " + concat.apply("Sriyansh", "Srihith"));
		final BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
		System.out.println("Sum of 10, 20: " + sum.apply(10, 20));
		
	}

}
