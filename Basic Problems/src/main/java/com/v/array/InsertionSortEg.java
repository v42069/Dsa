//WAP to sort character of your name in descending order

package com.v.array;

public class InsertionSortEg {
	public static void main(String[] args) {
		char[] a = {'s', 'a', 'n', 'd', 'e', 'e', 'p'};
		System.out.println("Before Sorting");
		printArray(a);
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[min]) {
					min = j;
				}
			}
			char temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.println("After sorting");
		printArray(a);
	}
	public static void printArray(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
