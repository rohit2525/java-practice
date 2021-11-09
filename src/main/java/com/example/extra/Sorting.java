package com.example.extra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Sorting {
    /*Input: {8, 7, -2, -5, 0, 4, 3, -9}
    Output: {0, 3, 4, 7, 8, -2, -5, -9}
    Or
    Output: {-2, -5, -9, 0, 3, 4, 7, 8}*/
    public static void main(String[] args) {
        Integer[] ip ={8, 7, -2, -5, 0, 4, 3, -9};
        System.out.println(Arrays.toString(customSort(ip,"positiveFirst")));
        System.out.println(Arrays.toString(customSort(ip,"negativeFirst")));

    }
    private static Object[] customSort(Integer[] ip,String sortOrder){
        Object[] op1 = new Object[0],op2 = new Object[0];
            op1 = Arrays.stream(ip).filter(i -> i >= 0).sorted().toArray();
            op2 = Arrays.stream(ip).filter(i -> i < 0).sorted(Comparator.reverseOrder()).toArray();
        if(sortOrder.equals("positiveFirst"))
            return Stream.of(op1, op2).flatMap(Stream::of).toArray();
        else
            return Stream.of(op2, op1).flatMap(Stream::of).toArray();
    }
}



 /*   private static Object[] sortWithPositivefirst(Integer[] ip){
        Object[] op1,op2;
        op1 = Arrays.stream(ip).filter(i -> i >= 0).sorted().toArray();
        op2 = Arrays.stream(ip).filter(i -> i < 0).sorted(Comparator.reverseOrder()).toArray();
        return Stream.of(op1, op2).flatMap(Stream::of).toArray();
    }
    private static Object[] sortWithNegativefirst(Integer[] ip){
        Object[] op1,op2;
        op1 = Arrays.stream(ip).filter(i -> i < 0).sorted(Comparator.reverseOrder()).toArray();
        op2 = Arrays.stream(ip).filter(i -> i >= 0).sorted().toArray();

        return Stream.of(op1, op2).flatMap(Stream::of).toArray();
    }*/
