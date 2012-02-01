package com.jwetherell.euler;


/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?
 * http://projecteuler.net/problem=3
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem3 {
    
    private static long NUMBER = 600851475143l;
    
    public static final long solve() {
        long largest = 0;
        long sqrt = (long)Math.sqrt(NUMBER);
        for (long i=2; i<sqrt; i++) {
            if (NUMBER%i==0 && isPrime(i)) largest = i;
        }
        return largest;
    }
    
    private static final boolean isPrime(long value) {
        for (int i=2; i<value; i++) {
            if (value%i==0) return false;
        }
        return true;
    }
    
    public static final long ideal() {
        long largest = 0;

        if (NUMBER%2==0) {
            NUMBER = NUMBER/2;
            largest = 2;
            while (NUMBER%2==0) {
                NUMBER = NUMBER/2;
            }
        } else {
            largest = 1;
        }
        
        int factor = 3;
        while (NUMBER>1) {
            if (NUMBER%factor==0) {
                NUMBER = NUMBER/factor;
                largest = factor;
                while (NUMBER%factor==0) {
                    NUMBER = NUMBER/factor;
                }
            }
            factor += 2;
        }
        
        return largest;
    }
}
