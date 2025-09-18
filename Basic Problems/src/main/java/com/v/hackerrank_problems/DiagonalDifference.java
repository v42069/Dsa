package com.v.hackerrank_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {

		List<List<Integer>> matrix = Arrays.asList(
				Arrays.asList(1, 2, 3),
				Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));


		int ls=0;
		int rs=0;
		for(int i=0;i<matrix.size();i++) {
			for(int j=0;j<matrix.get(i).size();j++) {
				if(i==j) {
					ls+=matrix.get(i).get(j);
				}
				if(i+j==matrix.size()-1) {
					rs+=matrix.get(i).get(j);
				}
			}
		}
		System.out.println(ls+" "+rs);


//
//
//		int r = 0;
//		int leftSum = 0;
//		int rightSum = 0;
//		for (List<Integer> row : matrix) {
//			int c = 0;
//			for (Integer col : row) {
//				System.out.println("[" + r + "] " + "[" + c + "] ");
//				if (r == c) {
//					leftSum += col;
//				}
//				if (r + c == row.size() - 1) {
//					rightSum += col;
//				}
//				c++;
//			}
//			r++;
//		}
//		System.out.println(leftSum);
//		System.out.println(rightSum);

	}

}
