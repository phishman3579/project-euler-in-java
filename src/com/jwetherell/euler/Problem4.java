package com.jwetherell.euler;


/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit 
 * numbers is 9009 = 91 × 99. Find the largest palindrome made from the product of two 3-digit numbers.
 * http://projecteuler.net/problem=4
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem4 {

    public static final long solve(int digits) {
        long largest = Integer.MIN_VALUE;

        int min = (int)Math.pow(10, digits-1);
        int max = (int)Math.pow(10, digits);
        for (int i=min; i<max; i++) {
            for (int j=min; j<max; j++) {
                int value = i*j;
                if (value>largest && isPalindrone(value)) {
                    largest = value;
                }
            }    
        }

        return largest;
    }

    private static final boolean isPalindrone(int number) {
        char[] string = String.valueOf(number).toCharArray();
        int length = string.length;
        int half = length/2;
        for (int i=0; i<half; i++) {
            int last = (length-1)-i;
            if (string[i]!=string[last]) return false;
        }
        return true;
    }
    
    public static final long ideal(int digits) {
        long largest = Integer.MIN_VALUE;

        int min = (int)Math.pow(10, digits-1);
        int max = (int)Math.pow(10, digits);
        for (int i=max-1; i>=min; i--) {
            for (int j=i; j>=min; j--) {
                int value = i*j;
                if (value>largest && isPalindrone(value)) {
                    largest = value;
                    break;
                }
            }    
        }

        return largest;
    }
}
