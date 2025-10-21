//WAP to find the third smallest element of the array
package com.v.array;
public class ThirdSmallestElement {
	public static void main(String[] args) {
		int[] a= {7,13,8,15,4,2};
		int small=a[0];
		int secSmall=a[1];
		int thirdSmall=a[2];

		for (int i = 0; i < a.length; i++) {
		if (a[i] < small) {
			thirdSmall = secSmall;
			secSmall = small;
			small = a[i];
		}
		else if (a[i] < secSmall && a[i] != small) {
			thirdSmall = secSmall;
			secSmall = a[i];
		}
		else if (a[i] < thirdSmall && a[i] != secSmall && a[i] != small) {
			thirdSmall = a[i];
		}
		}
		System.out.println(thirdSmall);
	}
}
