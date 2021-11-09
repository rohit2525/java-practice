package com.example.string;

public class Spiral {
    public static void main(String[] args) {
        Integer input[][] = {{1, 2, 3, 4, 5},
                {3, 5, 6, 7, 5},
                {2, 1, 3, 4, 4,},
                {3, 4, 4, 5, 7}};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(input[i][j]);
            }
        }
    }
}
