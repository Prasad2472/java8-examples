package com.core.test;

import java.util.Arrays;

public class NextMaxNumber {

	public static void main(String[] args) {

		System.out.println("Original=1234 Next Maximum=" + nextMaxNumber(1234));
		System.out.println("Original=1243 Next Maximum=" + nextMaxNumber(1243));
		System.out.println("Original=1342 Next Maximum=" + nextMaxNumber(1342));

		char digits1[] = new char[] { '1', '2', '3', '4' };
		int n = digits1.length;
		findNext(digits1, n);
		char digits2[] = new char[] { '1', '2', '4', '3' };
		n = digits2.length;
		findNext(digits2, n);

		char digits[] = new char[] { '1', '3', '4', '2' };
		n = digits.length;
		findNext(digits, n);

	}

	public static int nextMaxNumber(Integer number) {
		// 1234 1243 1324 1342
		int result = 0;
		int[] arr = converToArray(number);
		int i;
		int n = arr.length - 1;
		// Find if any digit greater than
		for (i = n; i > 0; i--) {
			// System.out.println("arr[i]:" + arr[i] + " --arr[i - 1]:" + arr[i - 1] + ",
			// i=" + i);
			if (arr[i] > arr[i - 1]) {
				break;
			}
		}

		if (i == 0) {
			// all the digits are in descending order like 4321 next number is not possible
			// here
			System.out.println("Next Number Not possible");
		} else {
			// find the minimum number which is greater than the i and smallest number from
			// i +1 to n.

			int min = arr[i - 1];
			int minIdex = i;
			int smallerNumber = arr[minIdex];
			for (int j = i; j <= n; j++) {
				// System.out.println("arr[j] :" + arr[j] + " min:" + min + " arr[minIdex]:" +
				// arr[minIdex]);
				if (arr[j] > min && smallerNumber > arr[j]) {
					smallerNumber = arr[j];
					minIdex = j;
				}
			}
			// now Swap arr[i-1] with arr[minIdex]
			int temp = arr[i - 1];
			arr[i - 1] = arr[minIdex];
			arr[minIdex] = temp;
		}
		sortArray(arr, i);
		result = convertoToResultNumber(arr);
		// System.out.println();
		return result;
	}

	private static int convertoToResultNumber(int[] arr) {
		int result;
		int i;
		result = arr[0];
		for (i = 1; i < arr.length; i++) {
			// System.out.print(arr[i]);
			result = result * 10 + arr[i];
		}
		return result;
	}

	private static int[] converToArray(Integer number) {
		int length = number.toString().length();
		int[] arr = new int[length];
		for (int i = arr.length - 1; i >= 0; i--) {
			// System.out.println("number%10=" + number % 10 + " number/10=" + number / 10 +
			// " i=" + i);
			arr[i] = number % 10;
			number = number / 10;
		}
		return arr;
	}

	public static void sortArray(int[] arr, int firstPosition) {
		int temp = 0;
		for (int i = firstPosition; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

	}

	// Utility function to swap two digit
	static void swap(char ar[], int i, int j) {
		char temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	// Given a number as a char array number[],
	// this function finds the next greater number.
	// It modifies the same array to store the result
	static void findNext(char ar[], int n) {
		int i;

		// I) Start from the right most digit
		// and find the first digit that is smaller
		// than the digit next to it.
		for (i = n - 1; i > 0; i--) {
			if (ar[i] > ar[i - 1]) {
				break;
			}
		}

		// If no such digit is found, then all
		// digits are in descending order means
		// there cannot be a greater number with
		// same set of digits
		if (i == 0) {
			System.out.println("Not possible");
		} else {
			int x = ar[i - 1], min = i;

			// II) Find the smallest digit on right
			// side of (i-1)'th digit that is greater
			// than number[i-1]
			for (int j = i + 1; j < n; j++) {
				if (ar[j] > x && ar[j] < ar[min]) {
					min = j;
				}
			}

			// III) Swap the above found smallest
			// digit with number[i-1]
			swap(ar, i - 1, min);

			// IV) Sort the digits after (i-1)
			// in ascending order
			Arrays.sort(ar, i, n);
			System.out.print("Next number with same" + " set of digits is ");
			for (i = 0; i < n; i++)
				System.out.print(ar[i]);
			System.out.println();
		}
	}
}
