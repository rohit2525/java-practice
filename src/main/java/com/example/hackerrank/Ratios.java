package com.example.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
arr=[1,1,0,-1,-1];
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
Print the decimal value of each fraction on a new line with places after the decimal.
There are n=5 elements, two positive, two negative and one zero. Their ratios are 0.4,0.4 and 0.2
. Results are printed as:

0.400000
0.400000
0.200000
*/
public class Ratios {

    public static void main(String[] args) {
        int[] arr= { 1,1,0,-1,-1};
        System.out.println(getRatios(arr));
        int [] arr2 = {-4, 3, -9, 0, 4, 1};
        System.out.println(getRatios(arr2));
    }
    static String getRatios(int[] input){
        double posRatio = (double)IntStream.of(input).filter(i -> i > 0).boxed().collect(Collectors.toList()).size() / input.length;
        double negRatio = (double)IntStream.of(input).filter(i -> i < 0).boxed().collect(Collectors.toList()).size() / input.length;
        double zerosRatio = (double)IntStream.of(input).filter(i -> i == 0).boxed().collect(Collectors.toList()).size() / input.length;

        return String.format("Postive numbers ratio %f, Negative numbers ratio %f, Zero numbers ratio %f",posRatio,negRatio,zerosRatio);
    }
}
