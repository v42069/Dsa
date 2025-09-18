package com.v.hackerrank_problems;

public class NumberLineJumps {

	public static String kangaroo(int x1, int v1, int x2, int v2) {

		for (int i = 0; i < 10000; i++) {
			if (x1 == x2) {
				return "YES";
			}
			if ((v1 > v2 && x1 > x2) || (v2 > v1 && x2 > x1)) {
				break;
			}
			x1 += v1;
			x2 += v2;
		}
		return "NO";

	}

	public static void main(String[] args) {

		kangaroo(0 ,3 ,4 ,2);

	}

}
