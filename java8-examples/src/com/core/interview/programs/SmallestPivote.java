package com.core.test;

public class SmallestPivote {

	public static void main(String[] args) {
		/** Optum -- 
		 * Given an array of numbers, find the index of the smallest array element (the
		 * pivot), for which the sums of all elements to the left and to the right are
		 * equal. The array may not be reordered. Example arr=[1,2,3,4,6]
		 * 
		 * the sum of the first three elements, 1+2+3=6. The value of the last element
		 * is 6. Using zero based indexing, arr[3]=4 is the pivot between the two
		 * subarrays.The index of the pivot is 3.
		 * 
		 * Function Description Complete the function balancedSum in the editor below.
		 * balancedSum has the following parameter(s): int arr[n]: an array of integers
		 * Returns: int: an integer representing the index of the pivot Constraints 3 ≤
		 * n ≤ 1051 ≤ arr[i] ≤ 2 × 104, where 0 ≤ i < nIt is guaranteed that a solution
		 * always exists. Input Format for Custom TestingSample Case 0
		 */
		int arr[] = new int[] { 1, 2, 1 };
		System.out.println(smallestPivote(arr));

	}

	public static int smallestPivote(int[] arr) {

		int totalSum = 0;
		int pivote = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		int leftSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			System.out.println("Leftsum:"+leftSum+", Right:"+(totalSum - (leftSum + arr[i])));
			
			if (leftSum == (totalSum - (leftSum + arr[i]))) {
				pivote = i;
				break;
			}
			leftSum += arr[i];
		}
		System.out.println("Total:" + totalSum);
		return pivote;
	}

}
