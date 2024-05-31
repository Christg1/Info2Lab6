package lab6;

import java.util.Random;

public class PrimeChecker {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
    	int[] testNumbers = {2, 3, 4, 5, 10, 17, 19, 20, 23, 24};
        for (int p : testNumbers) {
            System.out.println(p + " is prime? " + isPrime(p));
        }
    	
    	Random rand = new Random();
        int numTrials = 100;

        // Test for 20-bit numbers
        int[] bit20Numbers = new int[numTrials];
        for (int i = 0; i < numTrials; i++) {
            bit20Numbers[i] = rand.nextInt((1 << 20) - 1) + 1;
        }

        // Test for 40-bit numbers
        long[] bit40Numbers = new long[numTrials];
        for (int i = 0; i < numTrials; i++) {
            bit40Numbers[i] = rand.nextLong() & ((1L << 40) - 1);
            if (bit40Numbers[i] == 0) bit40Numbers[i] = 1; // ensure non-zero numbers
        }

        long start, end;

        // Measure time for 20-bit numbers
        start = System.nanoTime();
        for (int n : bit20Numbers) {
            isPrime(n);
        }
        end = System.nanoTime();
        long time20Bit = end - start;

        // Measure time for 40-bit numbers
        start = System.nanoTime();
        for (long n : bit40Numbers) {
            isPrime((int)n);
        }
        end = System.nanoTime();
        long time40Bit = end - start;

        System.out.println("Time for 20-bit numbers: " + time20Bit + " ns");
        System.out.println("Time for 40-bit numbers: " + time40Bit + " ns");
    }
    }
    
