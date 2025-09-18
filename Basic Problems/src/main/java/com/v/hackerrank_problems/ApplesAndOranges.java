package com.v.hackerrank_problems;

import java.util.Arrays;
import java.util.List;

public class ApplesAndOranges {

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		// Write your code here

		int []appleLength=new int[apples.size()];
	    int []orangesLength=new int[oranges.size()];

	    int appleCount=0;
	    int orangeCount=0;

	    for(int i=0;i<apples.size();i++){
	        appleLength[i]=apples.get(i)+a;
	    }
	    for(int i=0;i<oranges.size();i++){
	        orangesLength[i]=oranges.get(i)+b;
	    }

	    for(int acost:appleLength) {
	    	if(acost>=s && acost<=t ) {
	    		appleCount++;
	    	}
	    }
	    for(int acost:orangesLength) {
	    	if(acost>=s && acost<=t ) {
	    		orangeCount++;
	    	}
	    }

	    System.out.println(appleCount +" "+ orangeCount);

	}

	public static void main(String[] args) {

		List<Integer>apples=Arrays.asList(2,3,-4);
		List<Integer>oranges= Arrays.asList(3,-2,-4);

		countApplesAndOranges(7, 10, 4, 12, apples, oranges);
	}

}
