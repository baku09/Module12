package com.kodilla.good.patterns.strong;

public class Algorithm {
    public long Algorithm(int n){
        if (n < 0){
            throw new IllegalArgumentException("Silnia jest tylko dla liczb naturalnych");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++){
                result *= i;
            }
            return result;
        }
    }
}

