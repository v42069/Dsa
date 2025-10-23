// WAP find two numbers whose sum is equal to target and print the index

package com.v.array;

public class TwoNumSumEqualToTarget {
	public static void main(String[] args) {
		int[] a = {5,4,3,1,2,6};
		int target = 10;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
