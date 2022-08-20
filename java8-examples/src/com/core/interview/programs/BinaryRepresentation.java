package com.core.test;

import java.util.Stack;

public class BinaryRepresentation {

	public static void main(String[] args) {

		System.out.println("Binary:" + Integer.toBinaryString(10));
		ConverToBinary(10);
		convertBinaryToDecimal(1010);
		convertBinaryToDecimal(111);
	}

	public static void ConverToBinary(Integer number) {

		Stack<Integer> stack = new Stack<Integer>();
		int binary;
		while (number != 0) {
			binary = number % 2;
			number = number / 2;
			stack.push(binary);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}

	public static void convertBinaryToDecimal(int binary) {

		int base = 1;
		int decimalValue = 0;
		int temp;
		while (binary != 0) {
			temp = binary % 10;
			binary = binary / 10;
			decimalValue += temp * base;
			base = base * 2;

		}
		System.out.println("Decimal Value:" + decimalValue);
	}

}
