package com.company.challenges;

public class PalindromNumber {
//    Given an integer x, return true if x is palindrome integer.
//    An integer is a palindrome when it reads the same backward as forward.
//    For example, 121 is a palindrome while 123 is not.
    public static boolean isPalindrome(int x) {
        StringBuilder reversedXSB = new StringBuilder(Integer.toString(x)).reverse();
        return Integer.toString(x).equals(reversedXSB.toString());

    }
}
