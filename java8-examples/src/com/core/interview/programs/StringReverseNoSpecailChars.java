package com.core.interview.programs;

import java.util.Stack;

public class StringReverseNoSpecailChars {

	public static void main(String[] args) {
		String s = "abcd@efg@h";
		Stack<Character> elements = new Stack<Character>();

		for (Character character : s.toCharArray()) {
			if (Character.isLetter(character)) {
				elements.push(character);
			}
		}
		StringBuilder builder = new StringBuilder();
		for (Character character : s.toCharArray()) {
			if (Character.isLetter(character)) {
				builder.append(elements.pop());
			} else {
				builder.append(character);
			}
		}
		System.out.println("Reverse :" + builder.toString());

	}

	public static void manualReverse() {
		String s = "abcd@efg@h";
		char[] arr = s.toCharArray();
		int end = arr.length - 1;
		for (int i = 0; i < (arr.length / 2); i++) {
			if (!Character.isLetter(arr[i])) {
				continue;
			}
			for (int j = end; j < i; j--) {
				if (Character.isLetter(arr[i])) {
					end = j;
					break;
				}
			}
			char c = arr[i];
			arr[i] = arr[end - i];
			arr[end - i] = c;
			end--;
		}

		System.out.println("Source:" + s);
		System.out.println("StringBuffer reverse:" + new StringBuilder("abcdefgh").reverse());
		System.out.println("Reverse :" + new String(arr));
	}
}
