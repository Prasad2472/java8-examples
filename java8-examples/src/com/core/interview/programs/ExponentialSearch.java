package com.core.test;

public class ExponentialSearch {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 40;
		System.out.println("Exponnential:" + exponentialSearch(arr, x));

	}

	public static int exponentialSearch(int[] arr, int key) {
		int idx = 1;
		int n = arr.length;
		if (arr[0] == key)
			return 0;
		if (arr[n - 1] == key)
			return n - 1;
		while (idx < arr.length && arr[idx] <= key)
			idx = idx * 2;

		// BianarySearch
		return binarySearh(arr, idx / 2, Math.min(idx, n - 1), key);
	}

	private static int binarySearh(int[] arr, int start, int end, int key) {

		if (start <= end) {
			if (key == arr[start])
				return start;
			if (key == arr[end])
				return end;

			int mid = start + (end - start) / 2;
			if (arr[mid] == key)
				return mid;

			if (arr[mid] < key)
				binarySearh(arr, mid + 1, end, key);
			else
				binarySearh(arr, start, mid - 1, key);
		}
		return -1;
	}
}
