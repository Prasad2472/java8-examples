package com.core.interview.programs;

public class BubbleSortExample {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 6, 7, 1, 9, 5, 4, 5, 3 };

		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

	/**
	 * Time Complexity of Worst case O(n^2) Best case is O(n) Space complexity is
	 * O(n) 
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		boolean isSwapped = false;
		for (int i = 0; i < arr.length - 1; i++) {
			// The Completion of each Iteration "j" it will have the sorted element at the
			// end so "arr.length - 1 - i"
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped) {
				break;
			}
		}
	}

}
