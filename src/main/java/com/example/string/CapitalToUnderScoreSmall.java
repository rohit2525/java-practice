package com.example.string;

//CornerStone" to "corner_stone
public class CapitalToUnderScoreSmall {
    public static void main(String[] args) {
        String input = "CornerStone";
        StringBuilder op = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                if (i == 0)
                    op.append(Character.toLowerCase(input.charAt(i)));
                else
                    op.append("_").append(Character.toLowerCase(input.charAt(i)));
            } else
                op.append(input.charAt(i));
        }
        System.out.printf(op.toString());
    }
}
