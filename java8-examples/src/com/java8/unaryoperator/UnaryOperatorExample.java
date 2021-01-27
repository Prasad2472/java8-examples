package com.java8.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		/**
		 * Interface UnaryOperator<T> 
		 * Type Parameters: 
		 * T - the type of the operand and
		 * result of the operator
		 */
		UnaryOperator<Integer> square = a -> a * a;
		System.out.println("Unary Operator Test :" + square.apply(10));
		
		UnaryOperator<Integer> doubleNum = number -> number *2;
		System.out.println("Unary Operator Test :" + doubleNum.andThen(square).apply(10));
	}

}
