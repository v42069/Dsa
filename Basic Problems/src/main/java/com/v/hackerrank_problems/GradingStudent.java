package com.v.hackerrank_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudent {
	public static int roundUpToMultipleOf5(double number) {
	    return (int)(Math.ceil(number / 5.0) * 5);
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> ans=new ArrayList<>();
		for(int grade:grades) {
			if(grade<38) {
				ans.add(grade);
			}

			else {
                int rounded = roundUpToMultipleOf5(grade);
                if (rounded - grade < 3) {
                    ans.add(rounded);
                } else {
                    ans.add(grade);
                }
            }
		}
		return ans;
	}

	public static void main(String[] args) {

		List<Integer> grades=Arrays.asList(73,67,38,33);

		List<Integer> gradingStudents = gradingStudents(grades);

		gradingStudents.forEach(s->System.out.println(s));


	}

}
