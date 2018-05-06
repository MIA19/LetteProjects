package de.lette.task.other;

import java.util.Arrays;

public class PrimeNumbers {

    public boolean[] fillTheSieve(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for(int i = 2; (i * i) <= n; i++)
        {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int n = 200;
        boolean[] t = new PrimeNumbers().fillTheSieve(n);
        for (int i = 2; i <= n; i++) {
            if (t[i])
                System.out.print(i + ", ");
        }
    }
}
