package com.core.interview.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {

	public static void main(String[] args) {
		System.out.println("------------------------" + Runtime.getRuntime().availableProcessors());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100000000; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println("Sequential Stream Time Lapsed:" + (end - start));
		// System.out.println("evenSeq:"+evenSeq);
		start = System.currentTimeMillis();
		List<Integer> even = list.parallelStream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		end = System.currentTimeMillis();
		System.out.println("Parallel Stream Time Lapsed:" + (end - start));

		
		// System.out.println("even:"+even);
		/**
		 * Sequential Stream Time Lapsed:1750 Parallel Stream Time Lapsed:109
		 * 
		 */
		/**
		 * Sequential Stream Time Lapsed:3781 Parallel Stream Time Lapsed:21328
		 */
	}

	public static void copy(List<Integer> list) {
		long start = System.currentTimeMillis();
		list.stream().forEach(System.out::println);
		long end = System.currentTimeMillis();
		System.out.println("Sequential Stream Time Lapsed:" + (end - start));
		/**
		 * 99999 Time Lapsed: 540 to 718
		 */

		start = System.currentTimeMillis();
		list.parallelStream().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel Stream Time Lapsed:" + (end - start));
	}

}
