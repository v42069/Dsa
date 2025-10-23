//WAP to remove an element at specific index from an array

//  we cannot modify original array

//  create a new array with one less index of original array.

package com.v.array;

public class RemoveElementAtSpecificIndex {
	public static void main(String[] args) {
		String[] a = {"Zero","One","Two","Three","Four","Five","Six"};
		int index = 3; //Index from where the value has to be removed
		a = removeFromIndex(a, index);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static String[] removeFromIndex(String[] a, int index) {
		if (index < 0 || index >= a.length) {
			System.out.println("Index does not exist");
			return a;
		} else {
			String[] b = new String [a.length - 1];
			for (int i = 0; i < b.length; i++) {
				if (i<index)
				{
					b[i] = a[i];
				} else {
					b[i] = a[i + 1];
				}
			}
			return b;
		}
	}
}
