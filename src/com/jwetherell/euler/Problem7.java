package com.jwetherell.euler;


/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * http://projecteuler.net/problem=7
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem7 {

    public static final long solve(int number) {
        int count = 0;
        long i = 2;
        boolean result = false;
        while (true) {
            result = isPrime(i);
            if (result) {
                count++;
                if (count==number) return i;
            }
            i++;
        }
    }
    
    private static final boolean isPrime(long value) {
        for (int i=2; i<value; i++) {
            if (value%i==0) return false;
        }
        return true;
    }

    public static final long ideal(int number) {
        int count = 1;
        long i = 3;
        boolean result = false;
        while (true) {
            result = isIdealPrime(i);
            if (result) {
                count++;
                if (count==number) return i;
            }
            i = i+2;
        }
    }

    /*
     * 1 is not a prime.
     * All primes except 2 are odd.
     * All primes greater than 3 can be written in the form 6k+/-1.
     * Any number n can have only one primefactor greater than n .
     * The consequence for primality testing of a number n is: if we cannot find a number f less than
     * or equal n that divides n then n is prime: the only primefactor of n is n itself
     */
    private static final boolean isIdealPrime(long value) {
        if (value==1) return false;
        if (value<4) return true; //2 and 3 are prime
        if (value%2==0) return false;
        if (value<9) return true; //we have already excluded 4, 6 and 8.
        if (value%3==0) return false;
        
        long r = (long)Math.floor(Math.sqrt(value)); //n rounded to the greatest integer r so that r*r<=n
        int f = 5;
        while (f<=r) {
            if (value%f==0) return false;
            if (value%(f+2)==0) return false;
            f += 6;
        }
        
        return true;
    }
}
