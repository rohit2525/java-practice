package com.example.naveen_auto;

import java.util.Stack;

/*       Can anyone help?
        Input : "ABCD==F=EG="
        Output : ABE*/
public class popUpChar {
    public static void main(String[] args) {
        String input = "ABCD==F=EG=";
        Stack<Character> op = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == (char) ('='))
                op.pop();
            else
                op.push(input.charAt(i));

        }
        System.out.println(op);
    }
}
