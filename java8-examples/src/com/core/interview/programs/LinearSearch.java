package com.core.test;

public class LinearSearch {
/**
Linear Search is defined as a sequential search algorithm that starts at one end and goes through each element of a list until the desired element is found, 
otherwise the search continues till the end of the data set
**/
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
