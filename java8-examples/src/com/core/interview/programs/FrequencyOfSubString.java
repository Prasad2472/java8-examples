package com.core.test;

public class FrequencyOfSubString {

	public static void main(String[] args) {
		//https://www.geeksforgeeks.org/frequency-substring-string/
		System.out.println("No Of Coccuracens:" + numberOccurances("dhimanman", "man"));
		System.out.println("No Of Coccuracens:" + numberOccurances("aaaaa", "aa"));
		System.out.println("No Of Coccuracens:" + numberOccurances("banana", "nn"));
	}

	public static int numberOccurances(String s, String subString) {

		char[] arr = s.toCharArray();
		int n = arr.length;
		char[] subStringArr = subString.toCharArray();
		int count = 0;
		int m = subStringArr.length;

		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				// System.out.println("arr[i + j]:" + arr[i + j] + " subStringArr[j]:" +
				// subStringArr[j] + " i:" + i + " j:" + j);
				if (arr[i + j] != subStringArr[j])
					break;
			}
			if (j == m) {
				count++;
				// System.out.println("Pattern Match at Index:" + i);
			}

		}

		return count;
	}
}
