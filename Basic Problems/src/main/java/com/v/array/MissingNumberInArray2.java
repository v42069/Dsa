//Given an array nums containing n distinct numbers in the range [0, n],

//return the only number in the range that is missing from the array.

//Input: nums = [9,6,4,2,3,5,7,0,1]

//Output: 8

//Explanation: n = 9 since there are 9 numbers,
//so all numbers are in the range [0,9].
//8 is the missing number in the range since it does not appear in nums.

//Constraints:

//n=nums.length 1 <= n <= 104

//0 <= nums[i] <= n

//All the numbers of nums are unique.

//The formula n * (n + 1) / 2 calculates the sum of the first n natural numbers (including 0).
//		Here, n is the length of the array, which is 9.
//		The sum of numbers from 0 to 9 would be: 45

//After this loop, the value of arraysum will be the
//		sum of all the elements in the array {9, 6, 4, 2, 3, 5, 7, 0, 1}, which is:37
package com.v.array;

public class MissingNumberInArray2 {
	public static void main(String[] args) {
		int[] a = {9,6,4,2,3,5,7,0,1};
		int n = a.length;
		int sum = n *(n+1)/2;
		int arraysum = 0;
		for (int i = 0; i<a.length;i++)
		{
			arraysum = arraysum + a[i];
		}
		System.out.println(sum - arraysum);
	}
}
