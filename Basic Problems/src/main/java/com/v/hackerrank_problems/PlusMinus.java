package com.v.hackerrank_problems;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
	public static void main(String[] args) {
//		int[] arr = { -4, 3, -9, 0, 4, 1 };
		List<Integer>arr=Arrays.asList(-4, 3, -9, 0, 4, 1);

		plusMinus(arr);
	}

	private static void plusMinus(List<Integer> arr) {
		// TODO Auto-generated method stub
		int negative=0;
		int positive=0;
		int neutral=0;

		for(int i=0;i<arr.size();i++) {
			int num = (int) Math.signum(arr.get(i));
			switch(num)
			{
			case 0:neutral++; break;
			case 1:positive++; break;
			case -1:negative++; break;
			}

		}
		DecimalFormat df=new DecimalFormat("0.000000");
		System.out.println(df.format((double) positive / arr.size()));
        System.out.println(df.format((double) negative / arr.size()));
        System.out.println(df.format((double) neutral / arr.size()));



	}

}
