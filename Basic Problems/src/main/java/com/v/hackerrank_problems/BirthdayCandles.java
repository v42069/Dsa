package com.v.hackerrank_problems;

import java.util.Arrays;
import java.util.List;

public class BirthdayCandles {
	public static void main(String[] args) {

		List<Integer> can=Arrays.asList(3,2,1,3);
		System.out.println(birthdayCakeCandles(can));
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		int maxCount=0;
		int max=Integer.MIN_VALUE;

		int start=0;
		int end=0;

		for(int i:candles) {
			if(i>max) {
				max=i;
				maxCount=1;
			}
			else if(max==i) {
				maxCount++;
			}


		}
		return maxCount;

	}
}
