package com.core.interview.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		Integer[] source = { 1, 2, 5, 6, 7, 1, 9, 5, 4, 5, 3 };
		removeDuplicates(source);

		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + ",");
		}
		System.out.println("----------------------");
	}

	private static Integer[] removeDuplicates(Integer[] arr) {
//Bubble sort
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		return null;
	}

	public static Integer[] removeDuplicatesJava8(Integer[] arr) {

		return Arrays.stream(arr).distinct().toArray(Integer[]::new);

	}

}
