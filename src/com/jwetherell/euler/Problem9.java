package com.jwetherell.euler;


/**
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * http://projecteuler.net/problem=9
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class Problem9 {

    public static final long solve(int number) {
        for (int c=3; c<number; c++) {
            for (int b=2; b<c; b++) {
                int bSq = (int)Math.pow(b,2);
                int cSq = (int)Math.pow(c,2);
                int aSq = cSq-bSq;

                int abSq = aSq+bSq;
                if (abSq!=cSq) continue;
                
                int a = (int)Math.sqrt(aSq);
                if (a>=b) continue;

                aSq = (int)Math.pow(a,2);
                bSq = (int)Math.pow(b,2);
                cSq = (int)Math.pow(c,2);
                if ((aSq+bSq)!=cSq) continue;
                
                if ((a+b+c)==number) {
                    return (a*b*c);
                }
            }
        }
        return 0;
    }

    public static final long ideal(int number) {
        int s2 = number/2;
        int limit = (int)(Math.ceil(Math.sqrt(s2)))-1;
        for (int m=2; m<limit; m++) {
            if (s2%m!=0) continue;
            int sm = s2 / m;
            while (sm%2==0) { // reduce the search space by
                sm /= 2;      // removing all factors 21
            }
            
            int k=0;
            if (m%2==1) {
                k = m+2;
            } else {
                k = m+1;
            }
            
            while (k<(2*m) && k<=sm) {
                if (sm%k==0 && Utilities.gcd(k,m)==1) {
                    int d = s2/(k*m);
                    int n = k-m;
                    int a = d*(m*m-n*n);
                    int b = 2*d*m*n;
                    int c = d*(m*m+n*n);
                    return (a*b*c);
                }
                k += 2;
            }
        }
        return 0;
    }

}
