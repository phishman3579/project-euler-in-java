package com.jwetherell.euler;


/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?
 * http://projecteuler.net/problem=3
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem3 {
    
    private static final long NUMBER = 600851475143l;
    
    public static final long solve() {
        long result = Integer.MAX_VALUE;
        long sqrt = (long)Math.sqrt(NUMBER);
        for (long i=2; i<sqrt; i++) {
            if (NUMBER%i==0 && isPrime(i)) result = i;
        }
        return result;
    }
    
    private static final boolean isPrime(long value) {
        for (int i=2; i<value; i++) {
            if (value%i==0) return false;
        }
        return true;
    }
    
    public static final long ideal() {
        long largest = 0;

        return largest;
    }
}
