package com.core.test;

public class InterpolationSearch {

	public static void main(String[] args) {

		/**
		 * y = mx + c (General Equation of Line) y is data element at x index.
		 * 
		 * arr[hi] = m * hi + c  -->1
		 * arr[lo] = m* lo +c ---> 2
		 * x = m*pos + c  -->3
		 *  equation 1- 2
		 *  arr[hi] - arr[lo] = m(hi-lo);
		 *  m = (arr[hi] - arr[lo])/(hi-lo);
		 *  equation 3 - 2
		 *  
		 *  x- arr[lo] = m(pos - lo)
		 *  m(pos - lo) = x - arr[lo];
		 *  pos - lo = (x - arr[lo])\m;
		 *  
		 *  pos - lo = (x - arr[lo]) * ( (hi -lo)/(arr[hi] - arr[lo]));
		 *  pos = lo+ (x - arr[lo]) * ( (hi -lo)/(arr[hi] - arr[lo]));
		 * 
		 */

		int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

		int n = arr.length;
		int x = 18;
		System.out.println("Interpolation Search :" + interpolationSearch(arr, 0, n - 1, x));

	}
	
	
	public static int interpolationSearch(int[] arr, int lo, int hi, int key) {

		if (lo <= hi && key >= arr[lo] && key <= arr[hi]) {
			//int pos = lo + ((key - arr[lo]) * ((hi - lo) / (arr[hi] - arr[lo])));
			int pos = lo + (((key - arr[lo]) * (hi - lo)) / (arr[hi] - arr[lo]));
			
			System.out.println("pos:"+pos);
			if (arr[pos] == key)
				return pos;
			if (arr[pos] < key) {
				return interpolationSearch(arr, pos + 1, hi, key);
			} else {
				return interpolationSearch(arr, lo, pos - 1, key);
			}
		}

		return -1;
	}

}
