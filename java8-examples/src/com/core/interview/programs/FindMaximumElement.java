package com.core.test;

public class FindMaximumElement {

	public static void main(String[] args) {
		// Given an array of integers which is initially increasing and then decreasing,
		// find the maximum value in the array.
		int[] arr = { 8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1 };
		System.out.println("Maximum Element:" + findMaximum(arr));

		arr = new int[] { 1, 3, 50, 55, 60, 7, 6 };
		System.out.println("Maximum Element:" + findMaximum(arr));
		System.out.println("Using Binary Search:" + findMaximumUsingBinarySearch(arr, 0, 6));
		arr = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("Maximum Element:" + findMaximum(arr));

		System.out.println("Using Binary Search:" + findMaximumUsingBinarySearch(arr, 0, 4));
	}

	public static int findMaximum(int arr[]) {

		int maxElement = 0;
		// Time Complexity is O(n)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxElement)
				maxElement = arr[i];
		}

		return maxElement;
	}

	// the problem statement is first increase then decrease, so we can apply
	// BinarySearch to find the Maximum before decreasing
	public static int findMaximumUsingBinarySearch(int[] arr, int start, int end) {

		if (start == end)
			return arr[start];

		if (end == (start + 1) && arr[start] >= arr[end])
			return arr[start];

		if (end == (start + 1) && arr[end] > arr[start])
			return arr[end];

		int mid = start + (end - start) / 2;
		if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
			return arr[mid];

		if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1])
			return findMaximumUsingBinarySearch(arr, mid + 1, end);
		else
			return findMaximumUsingBinarySearch(arr, start, mid - 1);
	}

}
