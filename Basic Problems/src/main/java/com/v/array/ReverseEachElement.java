//WAP to reverse each element of the array

//Input - 54 12 36 94

//output - 45 21 63 49

package com.v.array;

public class ReverseEachElement {
	static int rev(int i){
		int temp=i;
		int rev=0;
		while(temp!=0){
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int[] a = {54, 12, 36, 94};
		for (int i = 0; i < a.length; i++) {
			int rev=rev(a[i]);
			a[i]=rev;
			System.out.print(rev + " ");
		}
	}
}
