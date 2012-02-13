package com.jwetherell.euler;


/**
 * What is the greatest product of four adjacent numbers in any direction 
 * (up, down, left, right, or diagonally) in the 20×20 grid?
 * http://projecteuler.net/problem=11
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem11 {

    public static final long solve(int[][] numbers) {
        long result = 0;
        int size = 4;
        for (int y=0; y<numbers.length-size; y++) {
            for (int x=0; x<numbers.length-size; x++) {
                long maxProduct = getMaxInAllDirections(x,y,size,numbers);
                if (maxProduct>result) result = maxProduct;
            }
        }
        
        return result;
    }

    private static final long getMaxInAllDirections(int startX, int startY, int size, int[][] numbers) {
        // 0 = left->right diag
        // 1 = right->left diag
        // 2 = 0th col
        // 3 = 1th col
        // 4 = 2th col
        // 5 = 3th col
        // 6 = 0th row
        // 7 = 1th row
        // 8 = 2th row
        // 9 = 3th row
        long[] results = {1,1,1,1,1,1,1,1,1,1};
        int adjX = 0;
        int adjY = 0;
        int value = 0;
        for (int y=0; y<size; y++) {
            adjY = startY+y;
            for (int x=0; x<size; x++) {
                adjX = startX+x;
                value = numbers[adjY][adjX];
                if (x==y) {
                    // Left-right
                    results[0] *= value;
                }
                if ((x+y)==3) {
                    // Right-left
                    results[1] *= value;
                }
                // Cols
                results[x+2] *= value;
                // Rows
                results[y+6] *= value;
            }
        }
        
        long max = 0;
        for (long r : results) {
            if (r>max) max = r;
        }
        return max;
    }
    
    public static final long ideal(int[][] numbers) {
        long result = 0;

        return result;
    }

}
