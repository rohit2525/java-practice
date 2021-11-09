package com.example.extra;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(-1, "Java");
        hm.put(-2, "Test");
        hm.put(-3, "three");
        hm.put(-4, "Selenium");
        hm.put(-5, "Five");
        hm.put(1, "Java");
        hm.put(2, "Test");
        hm.put(3, "three");
        hm.put(4, "Selenium");
        hm.put(5, "Five");
        hm.put(6, "Six");
        hm.put(7, "Automation");
        hm.put(8, "eight");
        hm.put(9, "Nine");
        hm.put(10, "C#");
        hm.put(11, "Eleven");
        hm.put(12, "Twelve");
        hm.put(13, "Thirteen");
        hm.put(14, "Fourteen");
        hm.put(15, "Fifteen");
        hm.put(16, "Sixteen");
        hm.put(17, "Seventeen");
        hm.put(18, "Eighteen");
        hm.put(19, "Nineteen");
        hm.put(20, "Twenty");

        hm.put(21, "Java");
        hm.put(22, "Test");
        hm.put(23, "three");
        hm.put(24, "Selenium");
        hm.put(25, "Five");
        hm.put(26, "Six");
        hm.put(27, "Automation");
        hm.put(28, "eight");
        hm.put(29, "Nine");
        hm.put(30, "C#");
        hm.put(31, "Eleven");
        hm.put(32, "Twelve");
        hm.put(33, "Thirteen");
        hm.put(34, "Fourteen");
        hm.put(35, "Fifteen");
        hm.put(36, "Sixteen");
        hm.put(37, "Seventeen");
        hm.put(38, "Eighteen");
        hm.put(39, "Nineteen");
        hm.put(40, "Twenty");

        hm.put(41, "Eleven");
        hm.put(42, "Twelve");
        hm.put(43, "Thirteen");
        hm.put(44, "Fourteen");
        hm.put(45, "Fifteen");
        hm.put(46, "Sixteen");
        hm.put(47, "Seventeen");
        hm.put(48, "Eighteen");
        hm.put(49, "Nineteen");
        hm.put(50, "Twenty");

        int i = -10;

         //   System.out.println(hm);

        System.out.println(i>>>16);  // The value of 'x>>>29' is 00...0111







        while(i<30)
        {
            Integer j =i;
            System.out.print(j.hashCode()+", ");
            i++;
        }



    }
}
