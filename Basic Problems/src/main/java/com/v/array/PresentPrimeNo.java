//WAP to print all the prime number present in the array

package com.v.array;

public class PresentPrimeNo {
	public static void main(String[] args) {
		int [] a = {7,2,4,52,31,56,74,11};
		for (int i = 0; i < a.length; i++)
		{
			int count = 0;
			for (int j = 1; j <=a[i]; j++)
			{
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2)
			{
				System.out.println(a[i] + " Prime Number");
			}
			else
			{
				System.out.println(a[i] + " Not a Prime Number");
			}
		}
	}
}
