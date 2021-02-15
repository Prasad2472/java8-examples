package com.java8.stream;

public class ReducerExample {

	public static void main(String[] args) {
		/**
		 * A reduction operation (also called a fold) takes a sequence of input elements
		 * and combines them into a single summary result by repeated application of a
		 * combining operation, such as finding the sum or maximum of a set of numbers,
		 * or accumulating elements into a list. The streams classes have multiple forms
		 * of general reduction operations, called reduce() and collect(), as well as
		 * multiple specialized reduction forms such as sum(), max(), or count(). Of
		 * course, such operations can be readily implemented as simple sequential
		 * loops, as in:
		 */
		
		/*
		 * int sum = 0; 
		 * for (int x : numbers) { 
		 * sum += x; 
		 * }
		 */
		
		//int sum = numbers.stream().reduce(0, (x,y) -> x+y);
		// int sum = numbers.stream().reduce(0, Integer::sum);
		/**
		 *  <U> U reduce(U identity,
              BiFunction<U, ? super T, U> accumulator,
              BinaryOperator<U> combiner);
		 */
		/**
		 * Here, the identity element is both an initial seed value for the reduction
		 * and a default result if there are no input elements. The accumulator function
		 * takes a partial result and the next element, and produces a new partial
		 * result. The combiner function combines two partial results to produce a new
		 * partial result. (The combiner is necessary in parallel reductions, where the
		 * input is partitioned, a partial accumulation computed for each partition, and
		 * then the partial results are combined to produce a final result.)
		 */
	}
}
