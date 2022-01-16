package com.example.leetcode;

/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).*/
public class ReverseNumber {
    public static void main(String[] args) {
        int x = 123;
        int rev=0;
        int temp =0;
        while(x!=0)
        {
            temp=x%10;
            rev=rev*10+temp;
            x=x/10;
        }
        System.out.println(rev);

        int y=-456;
        System.out.println(reverseStringBuilder(y));
    }
        static int reverseStringBuilder(int y)
        {
            StringBuilder sb = new StringBuilder().append(Math.abs(y)).reverse();
            return  y<0?Integer.parseInt(sb.toString())*-1:Integer.parseInt(sb.toString());
        }
}
