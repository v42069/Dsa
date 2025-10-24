// WAP magic value in bubble sort using clone method Array and magic value
//
//You are given an array a comprising n integers.
//You have to calculate the magic value of the array.

//Magic value of an array is equal to the difference between
//the sum of good integers in an array and
//the sum of the bad integers in an array
//
//Good integers are the ones whose Indexes are not changed in an array
//when sorted rest are bad
//
//Input format:-
//
//First line of input contain a single integer
//
//Second line of input contain n space separated integers,
//elements of array
//
//Output format:-
//
//Output a single integer magic value of array

//sample input 1:

// 10

// 0 4 0 0 1 3 4 1 0 2

package com.v.array;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 0, 4, 0, 0, 1, 3, 4, 1, 0, 2 };
		int[] b = a.clone();  //copy of an object
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length-1; j++) {
				if (b[j] > b[j+1]) {
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		int good = 0, bad = 0;
		for (int i = 0; i<b.length;i++) {
			if (a[i] == b[i]) {
				good = good + a[i];
			} else {
				bad = bad + a[i];
			}
		}
		System.out.println(good - bad);
	}
}
