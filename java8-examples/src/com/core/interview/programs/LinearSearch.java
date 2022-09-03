package com.core.test;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 5, 40, 6, 3, 84, 25, 44 };
		System.out.println(findElement(arr, 155));
		System.out.println(findElement(arr, 44));
	}

	public static int findElement(int[] arr, int find) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				return i;
			}
		}
		return -1;
	}
}
