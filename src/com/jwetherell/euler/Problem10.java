package com.jwetherell.euler;

/**
 * Find the sum of all the primes below two million. http://projecteuler.net/problem=10
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem10 {

    public static final long solve(int number) {
        long result = 2;
        for (int i = 3; i < number; i += 2) {
            if (Utilities.isPrime(i)) result += i;
        }
        return result;
    }

    /*
     * Uses Sieve of Eratosthenes
     */
    public static final long ideal(int number) {
        boolean[] sieve = new boolean[number];

        for (int i = 2; Math.pow(i, 2) < sieve.length; i++) {
            if (!sieve[i]) {
                for (int j = (int) Math.pow(i, 2); j < sieve.length; j += i) {
                    sieve[j] = true;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i < sieve.length; i++) {
            if (!sieve[i]) sum += i;
        }

        return sum;
    }
}
