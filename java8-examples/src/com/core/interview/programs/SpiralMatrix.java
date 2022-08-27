package com.core.test;

public class SpiralMatrix {

	public static void main(String[] args) {

		int[][] arr = {
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		printSprial(arr);
	}

	public static void printSprial(int[][] arr) {

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print("->" + arr[i][j]);
//			}
//			System.out.println();
//		}

		int rowStart = 0, rowEnd = arr.length, colStart = 0, colEnd = arr.length;
		// 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
		while (rowStart < rowEnd && colStart < colEnd) {
			// Print row data
			for (int i = colStart; i < colEnd; i++) {
				System.out.print(" " + arr[rowStart][i]);
			}
			//System.out.println();
			rowStart++;
			// print Last Column
			for (int i = rowStart ; i < rowEnd; i++) {
				System.out.print(" " + arr[i][colEnd - 1]);
			}
			colEnd--;
			//System.out.println();

			// print Last row
			for (int i = colEnd -1; i >= colStart; i--) {
				System.out.print(" " + arr[rowEnd - 1][i]);
			}
			rowEnd--;
			//System.out.println();
			// print column data
			for (int i = rowEnd - 1; i >= rowStart; i--) {
				System.out.print(" " + arr[i][colStart]);
			}
			colStart++;
			//System.out.println();
		}
	}

}
