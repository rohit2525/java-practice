package com.example.string;

import java.util.Arrays;

/*
*     Input: N = 10
    Output: 0 1 1 2 3 5 8 13 21 34
    Here first term of Fibonacci is 0 and second is 1, so that 3rd term = first(o) + second(1) etc and so on.

    Input: N = 15
    Output: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377  */
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFibonacci(10)));
    }

    static int[] getFibonacci(int limit) {

        int[] fibArr = new int[limit];
        fibArr[0] = 0;
        fibArr[1] = 1;
        for (int i = 2; i < limit; i++)
            fibArr[i] = fibArr[i - 2] + fibArr[i - 1];

        return fibArr;
    }
}
