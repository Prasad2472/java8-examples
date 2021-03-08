package com.core.interview.programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddArrayToSet {

	public static void main(String[] args) {
		Integer[] arr = { 2, 6, 4, 2, 3, 3, 1, 7 };
		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(arr));
		System.out.println("set:" + set);

	}

}
