//Find the average of largest and smallest numbers in an array?
//
//unsorted integer
//
//Example:
//
//Input Case 1:
//
//input: [1,4,3,2]
//
//output: 2.5
//
//solution: average = (1+4)/2=>5/2 => 2.5
//
//input: [1,4,3,4]
//
//output: 3
//
//solution: average = (1+4+4)/3 =>9/3 => 3

package com.v.array;

public class AverageLargestAndSmallest {
	public static void main(String[] args) {
		int[] a = {1,4,3,4};
//		int[] a = {1,4,3,2};
		int large=a[0];
		int small=a[0];
		int count=0;
		double sum=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>large) {
				large=a[i];
			}
			else if(a[i]<small) {
				small=a[i];
			}
		}
		for(int i = 0; i<a.length; i++) {
			if(a[i] == small || a[i] == large) {
				count++;
				sum=sum+a[i];
			}
		}
		double average = sum/count;
		System.out.println(average);
	}
}
