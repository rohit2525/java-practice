package com.example.pattern;

public class RightAngle {
    public static void main(String[] args) {
        int n =5;

        for (int row =0;row<=n;row++)
        {
            for (int space =n;space>row;space --)
            {
                System.out.print(" ");
            }
            for(int column=0;column<=row;column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
