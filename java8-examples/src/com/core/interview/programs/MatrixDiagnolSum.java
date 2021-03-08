package com.core.interview.programs;

public class MatrixDiagnolSum {

	public static void main(String[] args) {

		int[][] input = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int diagnolSum = 0;

		for (int i = 0; i < input.length; i++) {
			System.out.println("i:" + i + ",(input.length - 1) - i: " + ((input.length - 1) - i));
			if (i == ((input.length - 1) - i)) {
				diagnolSum = diagnolSum + input[i][i];
			} else {
				diagnolSum = diagnolSum + input[i][i] + input[i][(input.length - 1) - i];
			}
		}
		System.out.println("");
		System.out.println("diagnolSum:" + diagnolSum);
	}

}
