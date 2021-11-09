package com.example.string;

public class Random1 {
    //aZYwks to A-Zz-Yyy-.....
    public static void main(String[] args) {
        String input = "aZYwks";
        StringBuilder op = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <= i; j++) {
                {
                    if (j == i)
                        op.append(Character.toUpperCase(input.charAt(i))).append("_");
                    else
                        op.append(Character.toLowerCase(input.charAt(i)));
                }
            }
            System.out.printf(op.toString());
        }
    }
}
