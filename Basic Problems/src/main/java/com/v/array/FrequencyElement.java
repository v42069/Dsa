//WAP to find the frequency of all the element in given array.

package com.v.array;

//import java.util.Arrays;
//import java.util. Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyElement {
	public static void main(String[] args) {
		int[] a= {1,1,1,2};
		Map<Integer, Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i],map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
	}
}


