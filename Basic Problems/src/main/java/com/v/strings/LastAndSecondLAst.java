//WAP Last and Second-Last
//Given a String create a new String made up of its last two letters,
//reversed and separated by a space.

//Example:
//Input: 'bat'
//output: 't a'

package com.v.strings;

public class LastAndSecondLAst {
	public static void main(String[] args) {
		String s = "bat";
		int last = s.length() - 1;
		int slast = s.length() - 2;
		System.out.println(s.charAt(last) + " " + s.charAt(slast));
	}
}
