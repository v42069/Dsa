package org.com.v.strings;

public class CheckPalindrome {

    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false; // Not a palindrome, exit immediately
            }
            start++;
            end--;
        }
        return true; // Is a palindrome, loop completed
    }


    public static void main(String[] args) {

        String s="123521";
        boolean isPalindrome=isPalindrome(s);

        System.out.println(isPalindrome);

    }
}
