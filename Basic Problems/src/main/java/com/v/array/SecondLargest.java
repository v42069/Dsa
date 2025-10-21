//WAP to find the second largest element of the array

package com.v.array;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a= {17,13,8,15,4,17};
		int large = a[0];
		int secondLarge = a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large)
			{
				secondLarge = large;
				large = a[i];
			}
			else if (a[i] > secondLarge && a [i] != large) {
				secondLarge = a[i];
			}
		}
		System.out.print("The second largest element of the array is " + secondLarge);
	}
}

