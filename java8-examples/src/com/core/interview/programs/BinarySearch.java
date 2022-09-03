package com.core.test;

public class BinarySearch {

	public static void main(String[] args) {
		/**
		 * Binary Search is a searching algorithm used in a sorted array by repeatedly
		 * dividing the search interval in half. The idea of binary search is to use the
		 * information that the array is sorted and reduce the time complexity to O(Log
		 * n).
		 */

		int[] arr = { 2, 3, 4, 10, 40, 65 };
		System.out.println(binarySearch(arr, 155));
		System.out.println(binarySearch(arr, 40));
		System.out.println(binarySearch(arr, 65));
		System.out.println("recursiveSerach: " + recursiveSearch(arr, 0, 6, 40));
		System.out.println("recursiveSerach:" + recursiveSearch(arr, 0, 6, 65));
	}

	public static int binarySearch(int[] arr, int element) {

		int lowerBound = 0;
		int upperBound = arr.length - 1;
		int mid = 0;
		while (lowerBound <= upperBound) {
			mid = lowerBound + (upperBound - lowerBound) / 2;
			// mid = (upperBound + lowerBound) / 2;
			System.out.println("Lower:" + lowerBound + "  upper:" + upperBound + " mid:" + mid);

			if (arr[mid] == element) {
				return mid;
			}
			if (element > arr[mid]) {
				lowerBound = mid + 1;
			} else {
				upperBound = mid - 1;
			}
		}

		return -1;
	}

	public static int recursiveSearch(int[] arr, int begin, int end, int element) {

		if (end < begin) {
			return -1;
		}
		int mid = (begin + end) / 2;
		if (arr[mid] == element) {
			return mid;
		}
		if (element > arr[mid])
			return recursiveSearch(arr, mid + 1, end, element);
		else
			return recursiveSearch(arr, begin, mid - 1, element);
	}
}
