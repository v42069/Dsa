//WAP to find the sum of each digit of the elements present in the array.
//Input - 74 63 1456 1478
//output - 11 9 16 20
package com.v.array;

public class SumEachDigit
{
	public static void main(String[] args)
	{
		int[] a = {74, 63, 1456, 1478};
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(sumOfDigits(a[i]) + " ");
		}
	}
	public static int sumOfDigits(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			int digit = n % 10;
			sum=digit + sum;
			n = n/10;
		}
		return sum;
     }
}
//
//int[] a = {74, 63, 1456, 1478};
//for (int i = 0; i < a.length; i++)
//{
//	int sum = 0;
//	int n= a[i];
//	while(n != 0)
//	{
//		int digit = n % 10;
//		sum=digit + sum;
//		n = n/10;
//	}
//	System.out.print(sum + " ");
//}
