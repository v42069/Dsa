//A pangram is a sentence where every letter of the English alphabet
//appears at least once.
//
//Given a string sentence containing only lowercase English letters,
//return true if sentence is a pangram, or false otherwise.
//
//Example 1:
//
//Input: sentence = "the quickbrown fox jumps over he lazy dog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
//
//Example 2:
//
//Input: sentence = "jspiders thane"
//Output: false

package com.v.strings;

import java.util.Set;
import java.util.TreeSet;

public class PangramString {
	public static void main(String[] args) {
//		String s = "The quick brown fox jumps over he lazy dog";
		String s = "jspidersthane";
		s = s.toLowerCase();  //to convert into lower case
		Set<Character> set = new TreeSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {  //to remove the space
				set.add(s.charAt(i));
			}
		}
		if(set.size() == 26) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
