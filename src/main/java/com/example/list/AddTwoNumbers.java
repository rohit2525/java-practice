package com.example.list;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.*/



public class AddTwoNumbers {

    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(2,4,3);
        List<Integer> l2= Arrays.asList(5,6,4);
        addReverseNumbers(l1,l2);
    }
    static void addReverseNumbers(List<Integer> l1, List<Integer> l2)
    {
        int[] a1 = l1.stream().mapToInt(i->i).toArray();
        int[] a2 = l2.stream().mapToInt(i->i).toArray();
        int i1 = 0,i2=0,i3=0;
        for(int i=0;i<l1.size();i++)
        {
            i1 += Math.pow(10,i) * l1.get(l1.size()-1-i);
        }
        for(int i=0;i<l2.size();i++)
        {
            i2 += Math.pow(10,i) * l2.get(l2.size()-1-i);
        }
        i3=i1+i2;
        System.out.println(IntStream.of(i3));


//        /IntStream.range(0,l1.size()>l2.size()?l1.size():l2.size()).forEach();
    }
}
