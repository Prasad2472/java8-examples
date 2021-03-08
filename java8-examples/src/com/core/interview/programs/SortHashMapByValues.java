package com.core.interview.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortHashMapByValues {

	public static void main(String[] args) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("Hello", 1);
		unsortedMap.put("Prasad", 4);
		unsortedMap.put("Srihith", 3);
		unsortedMap.put("world", 2);
		unsortedMap.put("Sriyansh", 8);
		unsortedMap.put("Sriyansh", 5);
		sortUsingJava8(unsortedMap);
	}

	public static void sortUsingJava8(Map<String, Integer> unsortedMap) {
		Set<Entry<String, Integer>> entries = unsortedMap.entrySet();
//		Map<String, Integer> sortedMap = entries.stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		/**
		 * Another way
		 */
		Map<String, Integer> sortedMap = entries.stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("unsortedMap:"+unsortedMap);
		System.out.println("sortedMap:"+sortedMap);
		for (Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println("Key :"+entry.getKey()+"  value:"+entry.getValue());	
		}

	}
}
