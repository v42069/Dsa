package com.v.hackerrank_problems;

public class BetweenTwoSets {

//	static int[] calculateCommonMultiple(int a,int b) {
//		int[]arr=new int[10];
//
//		for(int i=0;i<a;i++) {
//
//		}

//	}

	/*
	 * What is GCD? The Greatest Common Divisor (GCD) of two or more integers is the
	 * largest positive integer that divides all the numbers without leaving a
	 * remainder.
	 */

	/*
	 * Certainly! The steps you mentioned are part of a brute force approach to
	 * finding the Greatest Common Divisor (GCD) of two numbers without using the
	 * Euclidean algorithm. Here’s why we do each step:
	 *
	 * 1. Find the smaller of the two numbers Reason: The GCD of two numbers cannot
	 * be larger than the smaller number because a divisor must be less than or
	 * equal to both numbers. For example, if you want the GCD of 48 and 18, it
	 * can’t be larger than 18 since 18 is the smaller number.
	 *
	 * Benefit: This limits our search range, saving us from unnecessarily checking
	 * numbers larger than the smaller number.
	 *
	 * 2. Iterate backward from that smaller number down to 1 Reason: We want the
	 * greatest common divisor, so starting at the largest possible candidate (the
	 * smaller number) and going downward lets us find it early.
	 *
	 * Benefit: This way, the first number that divides both numbers evenly is the
	 * greatest common divisor. So, once we find it, we can stop checking further
	 * smaller numbers.
	 *
	 * 3. For each number, check if it divides both numbers evenly Reason: Dividing
	 * evenly means there is no remainder. Only numbers that divide both numbers
	 * evenly qualify as common divisors.
	 *
	 * Benefit: By checking each candidate divisor for both numbers, we ensure it’s
	 * a common factor.
	 *
	 * 4. The first number found in this iteration that divides both is the GCD
	 * Reason: Because we started from the largest potential factor and moved
	 * downward, the first number that divides both must be the greatest common
	 * divisor.
	 *
	 * Benefit: No need to check smaller numbers once this is found — the search can
	 * stop immediately, optimizing the process slightly.
	 *
	 * Summary This approach systematically checks all possible divisors from
	 * largest to smallest to find the biggest number that divides both numbers
	 * without a remainder. It’s straightforward, easy to understand, and works
	 * correctly for small input numbers. However, it can be inefficient for very
	 * large numbers, which is why the Euclidean algorithm is preferred in practice.
	 */

	static int calculateGCD(int a, int b) {
		int min = Math.min(a, b);
		int gcd = 1; // At minimum, gcd is 1
		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
		}
		return gcd;
	}

	// Eucledian theorem

	public static int eucledianGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	//array of integer
	public static int eucledianGCD(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = eucledianGCD(result, numbers[i]);
        }
        return result;
    }

	//LCM
	public static int calculateLcm(int a,int b) {
		int res=(a*b)/eucledianGCD(a, b);
		return res;
	}

	public static void main(String[] args) {
		int num1 = 48;
		int num2 = 18;

//		int result = calculateGCD(num1, num2);
//		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

//		int result = eucledianGCD(num1, num2);
//		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

		int[] nums = {12, 18, 24};
		int result = eucledianGCD(nums);
		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

	}

}
