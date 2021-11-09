package com.example.pattern;

public class RightArrow {
    public static void main(String[] args) {
        int n = 5;


        for (int row = 0; row <= n; row++) {
            System.out.print("                         ");
            for (int column = 0; column <= row; column++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("********************************");
        for (int row = 0; row <= n; row++) {
            System.out.print("                         ");

            for (int column = n; column >= row; column--) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}