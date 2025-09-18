package com.v.hackerrank_problems;

import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 3, 5, 7, 9);
		calculateMinMax(arr);
	}

	private static void calculateMinMax(List<Integer> arr) {
		int maxSum = Integer.MIN_VALUE;
		int minSum = Integer.MAX_VALUE;
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.size(); i++) {
			int sum = 0;
			for (int j = 0; j < arr.size(); j++) {

				if (i != j) {
					sum += arr.get(j);
				}

			}
			if (sum < minSum) {
				minSum = sum;
			}
			if (sum > maxSum) {
				maxSum = sum;
			}

		}
		System.out.println(minSum + " " + maxSum);
	}

}
