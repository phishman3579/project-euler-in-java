package com.jwetherell.euler;


/**
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the 
 * sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * http://projecteuler.net/problem=6
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem6 {

    public static final long solve(int numbers) {
        long result = 0;
        long sumOfSquares = 0;
        long squareOfSum = 0;
        for (int i=1; i<=numbers; i++) {
            sumOfSquares += (long)Math.pow(i, 2);
            squareOfSum += i;
        }
        squareOfSum = (long)Math.pow(squareOfSum, 2);
        result = Math.abs(sumOfSquares-squareOfSum);
        return result;
    }

    public static final long ideal(int numbers) {
        long result = 0;
        long sumOfSquares = numbers*(numbers+1)/2;
        long squareOfSum = (2*numbers+1)*(numbers+1)*numbers/6;
        sumOfSquares = (long)Math.pow(sumOfSquares, 2);
        result = Math.abs(sumOfSquares-squareOfSum);
        return result;
    }
}
