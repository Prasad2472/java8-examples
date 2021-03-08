package com.core.interview.programs;

public class ReverseStringUsingLoop {

	public static void main(String[] args) {

		String s = "PR@S&D";
		char[] arr = s.toCharArray();
		int startIndex = 0;
		int endIndex = arr.length - 1;
		while (endIndex > startIndex) {
			if (!Character.isLetter(arr[startIndex])) {
				startIndex++;
			} else if (!Character.isLetter(arr[endIndex])) {
				endIndex--;
			} else {
				char temp = arr[startIndex];
				arr[startIndex] = arr[endIndex];
				arr[endIndex] = temp;
				startIndex++;
				endIndex--;
			}
		}
		System.out.println("Reverse String :" + new String(arr));
	}

}
