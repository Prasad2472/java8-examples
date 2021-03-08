package com.core.interview.programs;

public class SecondMaxElementInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 5, 15, 6, 8, 9, 12, 20, 20, 18, 21 };
		findSecondMaxElement(arr);
		int[] copy = arr;
		arr = null;

		System.out.println(copy[3]);
		Integer i = new Integer(10);
		Integer j = new Integer(10);
		System.out.println("i==j: " + (i.intValue() == j.intValue()));
	}

	public static void findSecondMaxElement(int[] arr) {
		int max = 0;
		int seconMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				seconMax = max;
				max = arr[i];
			} else if (arr[i] > seconMax && arr[i] != max) {
				seconMax = arr[i];
			}
		}
		System.out.println("Max: " + max + " SeconMax:" + seconMax);
		arr[3] = 22;
	}
}
