//WAP to find the binary equivalent for all the elements of the array by

//taking the input from the user

package com.v.array;

import java.util.Scanner;

public class BinaryEquivalent {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(binary(a[i]) + " ");
		}
	}

	public static String binary(int n)
	{
		String binary="";
		while(n != 0)
		{
			int remainder=n%2;
			binary=remainder+binary;
			n=n/2;
		}
		return binary;
	}
}

//public class P10 {
//public static void main(String[] args)
//{
//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter the size of array");
//	int n = sc.nextInt();
//	int[] a = new int[n];
//	for (int i = 0; i < a.length; i++)
//	{
//		System.out.println("Enter the elements for index" + i);
//		a[i]=sc.nextInt();
//	}
//	for (int i = 0; i < a.length; i++) {
//	int num = a[i];
//	String binary="";
//	while(num!=0)
//	{
//		int remainder=num%2;
//		binary=remainder+binary;
//		num=num/2;
//	}
//	System.out.print(binary + " ");
//	}
//}
//}





