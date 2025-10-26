//linear search Algorithm


       //It compares each element with search element.
       //It is used for small size of data.

//Binary Search Algorithm
       //It is used for large size of data.
       //array must be sorted before searching.

package com.v.array;

import java.util.Arrays;
//import java.util. Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class P28 {
	public static void main(String[] args) {
//		int[] a = {9,5,13,1,3};
		int[] a = {5,7,9,13,32,33,42,54,56,88};
		int search = 10;
		Arrays.sort(a);
		int sp = 0, ep = a.length-1;
		while (sp <= ep) {
			int mid = sp + (ep - sp) / 2;
			if (search == a[mid]) {
				System.out.println("Element is Present at "+mid);
				break;
			} else if (search > a[mid]) {
				sp = mid + 1;
			}else if (search < a[mid]) {
				ep = mid - 1;
			}
		}
		if (sp > ep) {
			System.out.println("Element is not Present");
		}
	}
}
