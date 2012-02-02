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
            int FOUR_MILLION = 4000000;

            System.out.println("Problem 2.");
            long before = System.nanoTime();
            int result = Problem2.solve(FOUR_MILLION);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            
            System.gc();
            
            System.out.println("Problem 2 ideal solution.");
            before = System.nanoTime();
            result = Problem2.ideal(FOUR_MILLION);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
        }
        
        {
            long n = 600851475143l;
            
            System.out.println("Problem 3.");
            long before = System.nanoTime();
            long result = Problem3.solve(n);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            
            System.gc();
            
            System.out.println("Problem 3 ideal solution.");
            before = System.nanoTime();
            result = Problem3.ideal(n);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
        }
        
        {
            int digits = 3;
            
            System.out.println("Problem 4.");
            long before = System.nanoTime();
            long result = Problem4.solve(digits);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            
            System.gc();
            
            System.out.println("Problem 4 ideal solution.");
            before = System.nanoTime();
            result = Problem4.ideal(digits);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
        }
        
        {
            int max = 10;
            
            System.out.println("Problem 5.");
            long before = System.nanoTime();
            long result = Problem5.solve(max);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            
            System.gc();
            
            System.out.println("Problem 5 ideal solution.");
            before = System.nanoTime();
            result = Problem5.ideal(max);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
        }
        
        
        {
            int number = 100;
            
            System.out.println("Problem 6.");
            long before = System.nanoTime();
            long result = Problem6.solve(number);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            
            System.gc();
            
            System.out.println("Problem 6 ideal solution.");
            before = System.nanoTime();
            result = Problem6.ideal(number);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            System.gc();
        }
    }
}
