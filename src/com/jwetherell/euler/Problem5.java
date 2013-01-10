package com.jwetherell.euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is
 * the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * http://projecteuler.net/problem=5
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem5 {

    public static final long solve(int max) {
        long smallest = Long.MAX_VALUE;

        long maxNumber = 1;
        long[] numbers = new long[max - 1];
        for (int i = 0; i < max - 1; i++) {
            long value = i + 2;
            numbers[i] = value;
            maxNumber *= value;
        }
        smallest = maxNumber;

        int count = 0;
        long[] primes = new long[max - 1];
        for (long v : numbers) {
            if (isPrime(v)) primes[count++] = v;
        }

        for (long i = numbers[max - 2]; i < maxNumber; i++) {
            if (i < smallest && isDivisible(i, numbers)) {
                smallest = i;
                break;
            }
        }

        return smallest;
    }

    private static final boolean isDivisible(long value, long[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            long v = numbers[i];
            if (value % v != 0) return false;
        }
        return true;
    }

    private static final boolean isPrime(long value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static final long ideal(int max) {
        long smallest = Integer.MAX_VALUE;

        return smallest;
    }
}
