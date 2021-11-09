package com.example.extra;

public class TimeComplexity {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
        }
        long endTime = System.nanoTime();
        long loopTime = (-1) * (startTime - endTime);
        System.out.println(loopTime + " time in nanoseconds ");
    }
}
