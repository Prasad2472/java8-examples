package com.core.test;

public class TernarySearch {

	public static void main(String[] args) {
		/**
		 * Ternary search is a decrease(by constant) and conquer algorithm that can be
		 * used to find an element in an array. It is similar to binary search where we
		 * divide the array into two parts but in this algorithm, we divide the given
		 * array into three parts and determine which has the key (searched element). We
		 * can divide the array into three parts by taking mid1 and mid2 which can be
		 * calculated as shown below. Initially, l and r will be equal to 0 and n-1
		 * respectively, where n is the length of the array.
		 * 
		 * It is same as the binary search. The only difference is that, it reduces the
		 * time complexity a bit more. Its time complexity is O(log n base 3) and that
		 * of binary search is O(log n base 2).
		 * 
		 * mid1 = l + (r-l)/3 mid2 = r – (r-l)/3
		 */

		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Ternary Search:" + ternarySearchRecursive(ar, 0, 9, 5));
		System.out.println("Ternary Search:" + ternarySearchRecursive(ar, 0, 9, 50));
		System.out.println("Ternary Search ternarySearchIterative:" + ternarySearchIterative(ar, 0, 9, 5));
		System.out.println("Ternary Search ternarySearchIterative:" + ternarySearchIterative(ar, 0, 9, 50));
	}

	public static int ternarySearchRecursive(int[] arr, int begin, int end, int element) {
		if (end < begin)
			return -1;

		int mid1 = begin + (end - begin) / 3;
		int mid2 = end - (end - begin) / 3;

		if (arr[mid1] == element) {
			return mid1;
		}
		if (arr[mid2] == element) {
			return mid2;
		}
		if (element < arr[mid1]) {
			return ternarySearchRecursive(arr, begin, mid1 - 1, element);
		} else if (element > arr[mid2])
			return ternarySearchRecursive(arr, mid2 + 1, end, element);
		else {
			return ternarySearchRecursive(arr, mid1 + 1, mid2 - 1, element);
		}
	}

	public static int ternarySearchIterative(int[] arr, int begin, int end, int element) {

		while (end >= begin) {
			int mid1 = begin + (end - begin) / 3;
			int mid2 = end - (end - begin) / 3;
			if (arr[mid1] == element) {
				return mid1;
			}
			if (arr[mid2] == element) {
				return mid2;
			}
			if (element < arr[mid1]) {
				end = mid1 - 1;
			} else if (element > arr[mid2]) {
				begin = mid2 + 1;
			} else {
				begin = mid1 + 1;
				end = mid2 - 1;
			}
		}

		return -1;
	}
}
