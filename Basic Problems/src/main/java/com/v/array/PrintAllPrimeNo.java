//WAP to print all the prime number present in the array
//A prime number is defined as a number greater than 1 that is divisible by exactly two distinct positive divisors: 1 and itself.
// However, the loop only runs until n-1, which means it is not checking whether n is divisible by itself.
package com.v.array;

public class PrintAllPrimeNo {
	public static void main(String[] args) {
		int [] a = {7,2,4,52,31,56,74,11};
		for (int i = 0; i < a.length; i++) {
			if (isPrimeNo(a[i]))
			{
				System.out.println(a[i]);
			}
		}
	}
		public static boolean isPrimeNo(int n) {
			int count = 0;
			for (int i = 1;i <= n; i++)
			{
				if(n % i == 0)
				{
					count++;
				}
			}
			return count == 2;
		}
}
