package com.jwetherell.euler;

public class Utilities {

    /* isPrime()
     * 1 is not a prime.
     * All primes except 2 are odd.
     * All primes greater than 3 can be written in the form 6k+/-1.
     * Any number n can have only one primefactor greater than n .
     * The consequence for primality testing of a number n is: if we cannot find a number f less than
     * or equal n that divides n then n is prime: the only primefactor of n is n itself
     */
    public static final boolean isPrime(long value) {
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

    /* Euclid's greatest common divisor algorithm
     */
    public static final int gcd(int k, int m) {
        int larger = k;
        int smaller = m;
        if (m>k) {
            smaller = k;
            larger = m;
        }
        
        while (true) {
            larger -= smaller;
            if (smaller==larger) return smaller;
            
            if (smaller>larger) {
                int temp = smaller;
                smaller = larger;
                larger = temp;
            }
        }
    }
}
