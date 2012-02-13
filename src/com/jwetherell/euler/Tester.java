package com.jwetherell.euler;

import java.text.DecimalFormat;


public class Tester {
    
    private static final DecimalFormat FORMAT = new DecimalFormat("#.######");
    
    public static void main(String[] args) {
        /*
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
        */
        /*
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
        */
        /*
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
        */
        /*
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
        */
        /*
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
        */
        /*
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
        */
        /*
        {
            int number = 10001;
            
            System.out.println("Problem 7.");
            long before = System.nanoTime();
            long result = Problem7.solve(number);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            
            System.gc();
            
            System.out.println("Problem 7 ideal solution.");
            before = System.nanoTime();
            result = Problem7.ideal(number);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            
            System.gc();
        }
        */
        /*
        {
            String number = 
                "73167176531330624919225119674426574742355349194934"+
                "96983520312774506326239578318016984801869478851843"+
                "85861560789112949495459501737958331952853208805511"+
                "12540698747158523863050715693290963295227443043557"+
                "66896648950445244523161731856403098711121722383113"+
                "62229893423380308135336276614282806444486645238749"+
                "30358907296290491560440772390713810515859307960866"+
                "70172427121883998797908792274921901699720888093776"+
                "65727333001053367881220235421809751254540594752243"+
                "52584907711670556013604839586446706324415722155397"+
                "53697817977846174064955149290862569321978468622482"+
                "83972241375657056057490261407972968652414535100474"+
                "82166370484403199890008895243450658541227588666881"+
                "16427171479924442928230863465674813919123162824586"+
                "17866458359124566529476545682848912883142607690042"+
                "24219022671055626321111109370544217506941658960408"+
                "07198403850962455444362981230987879927244284909188"+
                "84580156166097919133875499200524063689912560717606"+
                "05886116467109405077541002256983155200055935729725"+
                "71636269561882670428252483600823257530420752963450";
            
            System.out.println("Problem 8.");
            long before = System.nanoTime();
            long result = Problem8.solve(number);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            
            System.gc();
            
            System.out.println("Problem 8 ideal solution.");
            before = System.nanoTime();
            result = Problem8.ideal(number);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            
            System.gc();
        }
        */
        {
            int number = 1000;
            
            System.out.println("Problem 9.");
            long before = System.nanoTime();
            long result = Problem9.solve(number);
            long after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            
            System.gc();
            
            System.out.println("Problem 9 ideal solution.");
            before = System.nanoTime();
            result = Problem9.ideal(number);
            after = System.nanoTime();
            System.out.println("result="+result);
            System.out.println("Computed in "+FORMAT.format(after-before)+" ns");
            System.out.println();
            
            System.gc();
        }
    }
}
