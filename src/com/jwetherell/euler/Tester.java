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
            
            System.out.println("Problem 1.");
            long before = System.nanoTime();
            int result = Problem1.solve(array);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
            
            System.out.println("Problem 1 ideal solution.");
            before = System.nanoTime();
            result = Problem1.ideal(size);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
        }
        
        {
            System.out.println("Problem 2.");
            long before = System.nanoTime();
            int result = Problem2.solve();
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
            
            System.out.println("Problem 2 ideal solution.");
            before = System.nanoTime();
            result = Problem2.ideal();
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
        }
        
        {
            System.out.println("Problem 3.");
            long before = System.nanoTime();
            long result = Problem3.solve();
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
            
            System.out.println("Problem 3 ideal solution.");
            before = System.nanoTime();
            result = Problem3.ideal();
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
        }
    }
}
