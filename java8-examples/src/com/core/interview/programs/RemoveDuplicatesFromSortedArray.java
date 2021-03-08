package com.core.interview.programs;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
		 int uniqIndex = 0;
		for (int i = 0; i < arr.length -2; i++) {
			if(arr[i] != arr[i+1]) {
				arr[uniqIndex++] = arr[i];
			}
		}
		//copy last element
		arr[uniqIndex++] = arr[arr.length -1];
		for (int i = 0; i < arr.length -2; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
