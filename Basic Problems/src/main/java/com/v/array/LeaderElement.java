//Given an array of integers, find and print all the leaders of the array.
//A leader is defined as an element of the array
//which is greater than all the elements following it.
//The rightmost element is always a leader.
//
//For example:
//
//In the array {8, 7, 4, 3, 5, 2}, leaders are 8, 7, 5 and 2.
//
//Explanation:
//
//8 > 7, 8 > 4,8 > 3, 8 > 5, 8 > 2.
//
//7 > 4,7 > 3,7 > 5, 7 > 2.
//
//5 > 2.
//
//2 is the rightmost element.

package com.v.array;

public class LeaderElement {
	public static void main(String[] args) {
		int[] a= {8, 7, 4, 3, 5, 2};
		for (int i = 0;i<a.length;i++){
			boolean isLeader = true;
			for(int j = i + 1; j < a.length;j++) {
				if (a[i]  < a[j]) {
					isLeader = false;
					break;
				}
			}
			if (isLeader) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
