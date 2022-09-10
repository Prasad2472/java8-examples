package com.core.test;

import java.util.Arrays;

public class TwoElementsSumClosestToZero {

	public static void main(String[] args) {
		// Two elements whose sum is closest to zero
		// {1, 60, -10, 70, -80, 85};
		int arr[] = { 1, 60, -10, 70, -80, 85, 83 , 79};
		findClosestSum(arr);

	}

	public static void findClosestSum(int[] arr) {
		// Sort an array
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int minSum = Integer.MAX_VALUE;
		int leftIdx = 0;
		int rightIdx = 0;
		int sum;
		while (left < right) {
			sum = arr[left] + arr[right];
			if (Math.abs(sum) < Math.abs(minSum)) {
				minSum = sum;
				leftIdx = left;
				rightIdx = right;
			}
			if (sum < 0)
				left++;
			else
				right--;

		}
		System.out.println("Closest Sum elements are: " + arr[leftIdx] + "<--->" + arr[rightIdx]);

	}

}
