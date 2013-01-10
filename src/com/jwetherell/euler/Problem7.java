package com.jwetherell.euler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13. What is the 10
 * 001st prime number? http://projecteuler.net/problem=7
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
                if (count == number) return i;
            }
            i++;
        }
    }

    private static final boolean isPrime(long value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static final long ideal(int number) {
        int count = 1;
        long i = 3;
        boolean result = false;
        while (true) {
            result = Utilities.isPrime(i);
            if (result) {
                count++;
                if (count == number) return i;
            }
            i = i + 2;
        }
    }
}
