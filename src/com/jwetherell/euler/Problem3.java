package com.jwetherell.euler;


/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?
 * http://projecteuler.net/problem=3
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem3 {

    public static final long solve(long n) {
        long largest = 0;
        long sqrt = (long)Math.sqrt(n);
        for (long i=2; i<sqrt; i++) {
            if (n%i==0 && isPrime(i)) largest = i;
        }
        return largest;
    }
    
    private static final boolean isPrime(long value) {
        for (int i=2; i<value; i++) {
            if (value%i==0) return false;
        }
        return true;
    }
    
    public static final long ideal(long n) {
        long largest = 0;

        if (n%2==0) {
            n = n/2;
            largest = 2;
            while (n%2==0) {
                n = n/2;
            }
        } else {
            largest = 1;
        }
        
        long max = (long)Math.sqrt(n);
        int factor = 3;
        while (n>1 && factor<max) {
            if (n%factor==0) {
                n = n/factor;
                largest = factor;
                while (n%factor==0) {
                    n = n/factor;
                }
                max = (long)Math.sqrt(n);
            }
            factor += 2;
        }
        
        if (n==1) return largest;
        return n;
    }
}
