package com.core.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		List<Integer> source = Arrays.asList(1, 2, 5, 6, 7, 1, 9, 5, 4, 5, 3);
		List<Integer> destination = removeDuplicatesJava8(source);
		System.out.println("source: " + source);
		System.out.println("destination: " + destination);
	}

	private static List<Integer> removeDuplicatesJava8(List<Integer> source) {
		return source.stream().distinct().collect(Collectors.toList());

	}
}
