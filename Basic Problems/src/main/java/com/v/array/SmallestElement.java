//WAP to find the smallest element present in the array

package com.v.array;

public class SmallestElement {
	public static void main(String[] args) {
		int[] a= {7,13,8,15,4};
		int small = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < small)
			{
				small = a[i];
			}
		}
		System.out.print("The smallest element of the array is " + small);
	}
}
