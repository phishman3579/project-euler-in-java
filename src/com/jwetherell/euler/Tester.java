package com.jwetherell.euler;

import java.text.DecimalFormat;


public class Tester {
    
    private static final DecimalFormat FORMAT = new DecimalFormat("#.######");
    
    public static void main(String[] args) {
        {
            int size = 1000;
            int[] array = new int[size];
            for (int i=0; i<size; i++) {
                array[i] = i;
            }
            
            System.out.println("Problem 1 using loop.");
            long before = System.nanoTime();
            int result = Problem1.solve(array);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
            
            System.out.println("Problem 1 using bits.");
            before = System.nanoTime();
            result = Problem1.solve(size);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
        }
    }
}
