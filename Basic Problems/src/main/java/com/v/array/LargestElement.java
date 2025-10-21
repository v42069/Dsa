//WAP to find the largest element present in the array

package com.v.array;

public class LargestElement {
	public static void main(String[] args) {
		int[] a= {7,13,8,15,4};
		int large = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > large)
			{
				large = a[i];
			}
		}
		System.out.print("The largest element of the array is " + large);
	}
}
