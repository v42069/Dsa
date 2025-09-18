package com.v.hackerrank_problems;

public class Staircase {

	public static void main(String[] args) {

		int a=6;
		staircase(a);


	}

	private static void staircase(int a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a;i++) {
			for(int j=i;j<a;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}


}
