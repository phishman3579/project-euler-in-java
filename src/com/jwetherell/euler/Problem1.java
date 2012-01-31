package com.jwetherell.euler;


/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of 
 * these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 * http://projecteuler.net/problem=1
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem1 {
    
    public static final int solve(int[] array) {
        int sum = 0;
        for (int v : array) {
            if (v % 3 == 0) sum += v;
            else if (v % 5 == 0) sum += v;
        }
        return sum;
    }
    
    public static final int solve(int max) {
        return sumDivisibleBy(max-1,3)+sumDivisibleBy(max-1,5)-sumDivisibleBy(max-1,15);
    }
    
    private static final int sumDivisibleBy(int max, int n) {
        int p = max/n;
        return n*(p*(p+1))/2;
    }
}
