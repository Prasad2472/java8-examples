package com.core.test;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {

		int ar1[] = { 1, 12, 15, 26, 38 };
		int ar2[] = { 2, 13, 17, 30, 45 };
		// System.out.println("Median of Sorted Arrays :" + findMedian(ar1, ar2));
		System.out.println("Median of Sorted Arrays :" + findMedianBySortingArrays(ar1, ar2));
	}

	public static int findMedian(int[] arr1, int[] arr2) {
		// Since arrays are sorted we can count the Median while comparing
		int n = arr1.length;
		int i = 0;
		int j = 0;
		int m1 = 0;
		int m2 = 0;
		int count = 0;
		for (count = 0; count <= n; count++) {
			System.out.println("Coint :" + count);
			if (i == n) {
				m1 = m2;
				m2 = arr2[0];
				break;
			} else if (j == n) {
				m1 = m2;
				m2 = arr1[0];
				break;
			} else if (arr1[i] <= arr2[j]) {
				m1 = m2;
				m2 = arr1[i];
				i++;
			} else {
				m1 = m2;
				m2 = arr2[j];
				j++;
			}

		}

		return (m1 + m2) / 2;
	}

	static int findMedianBySortingArrays(int[] arr1, int[] arr2) {
		// Since two arrays are sorted then swap all lower elements to one and greater
		// element to other then sort two arrays
		int i = arr1.length - 1;
		int j = 0;
		int n = arr1.length;
		// Swap elements
		int temp = 0;
		while (arr1[i] > arr2[j] && i > 0 && j < n) {
			temp = arr1[i];
			arr1[i] = arr2[j];
			arr2[j] = temp;
			i--;
			j++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return (arr1[n - 1] + arr2[0]) / 2;
	}
}
