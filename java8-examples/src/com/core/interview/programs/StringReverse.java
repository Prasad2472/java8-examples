package com.core.interview.programs;

public class StringReverse {

	public static void main(String[] args) {

		/**
		 * Reverse String using recurssion, StringBuffer, but this is the most
		 * efficeiant way
		 */
		String label = "HelloWorld";
		char[] arr = label.toCharArray();
		for (int i = 0; i < (arr.length / 2); i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		System.out.println("Source:" + label);
		System.out.println("Reverse :" + new String(arr));
	}

}
