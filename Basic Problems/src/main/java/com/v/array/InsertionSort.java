//WAP Selection sort:-
// it is used to sort array ascending order.
// search and sort method.
//two loop needed, outer loop for selection of index of smallest element
// and inner loop for search.
//Start with the first element: Consider the first element in the list as the minimum.
//		Find the smallest element: Compare this element with all other elements in the unsorted portion of the list to find the smallest element.
//		Swap: Once the smallest element is found, swap it with the first element of the unsorted part.
//		Move the boundary: Now the first element is considered sorted,
//		so move the boundary between the sorted and unsorted parts of the list one step to the right.
//		Repeat: Repeat this process for the next unsorted element and so on, until the entire list is sorted.

//Let's sort the array [64, 25, 12, 22, 11] in ascending order:
//
//		Initial array: [64, 25, 12, 22, 11]
//		The smallest element is 11. Swap 11 with 64.
//		Array after first pass: [11, 25, 12, 22, 64]
//		Second pass:
//		Consider the rest of the array [25, 12, 22, 64].
//		The smallest element is 12. Swap 12 with 25.
//		Array after second pass: [11, 12, 25, 22, 64]
//		Third pass:
//		Consider the remaining unsorted part [25, 22, 64].
//		The smallest element is 22. Swap 22 with 25.
//		Array after third pass: [11, 12, 22, 25, 64]
//		Fourth pass:
//		The last two elements [25, 64] are already in order.
//		Array remains [11, 12, 22, 25, 64].
//		Now the array is fully sorted.
package com.v.array;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = {64, 25, 12, 22, 11};
		System.out.println("Before Sorting");
		printArray(a);
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.println("After sorting");
		printArray(a);
	}
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
