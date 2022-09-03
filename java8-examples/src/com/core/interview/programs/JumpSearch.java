package com.core.test;

public class JumpSearch {

	public static void main(String[] args) {
		/**
		 * Like Binary Search, Jump Search is a searching algorithm for sorted arrays.
		 * The basic idea is to check fewer elements (than linear search) by jumping
		 * ahead by fixed steps or skipping some elements in place of searching all
		 * elements. For example, suppose we have an array arr[] of size n and a block
		 * (to be jumped) of size m. Then we search in the indexes arr[0], arr[m],
		 * arr[2m]…..arr[km] and so on. Once we find the interval (arr[km] < x <
		 * arr[(k+1)m]), we perform a linear search operation from the index km to find
		 * the element x What is the optimal block size to be skipped? In the worst
		 * case, we have to do n/m jumps, and if the last checked value is greater than
		 * the element to be searched for, we perform m-1 comparisons more for linear
		 * search. Therefore, the total number of comparisons in the worst case will be
		 * ((n/m) + m-1). The value of the function ((n/m) + m-1) will be minimum when m
		 * = √n. Therefore, the best step size is m = √n.
		 */

		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int x = 55;
		System.out.println("JumpSearch :" + jumpSearch(arr, x));
		System.out.println("JumpSearch :" + jumpSearch(arr, 616));
		System.out.println("JumpSearch :" + jumpSearch(arr, 21));

	}

	public static int jumpSearch(int[] arr, int element) {

		int size = arr.length;
		int jump = (int) Math.floor(Math.sqrt(size));
		int lastJump = 0;
		int idx = 0;
		while (idx < size && arr[idx] < element) {
			lastJump = idx;
			idx += jump;
		}
		while (idx < size && idx > lastJump) {
			if (arr[idx] == element)
				return idx;
			idx--;
		}

		return -1;
	}

}
