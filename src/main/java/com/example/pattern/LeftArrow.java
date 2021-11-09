package com.example.pattern;

public class LeftArrow {
    public static void main(String[] args) {
int n=5;

        for (int row = 0; row <= n; row++) {
            for (int space = n; space >= row; space--) {
                System.out.print(" ");
            }
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("****************************************");
        for (int row = 0; row <= n; row++) {
            for (int space = 0; space <= row; space++) {
                System.out.print(" ");
            }
            for (int column = n; column >= row; column--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}