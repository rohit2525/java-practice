package com.example.string;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/*Can anyone know logic of Below program
        String str ="KJYFHRLEWLALO"
        O/P : HELLO*/
public class FibonacciDerivedQuestion {

    public static void main(String[] args) {
        String input = "KJYFHRLEWLALO";
        String expectedOp= "HELLO";
        int size = "Hello".length();
        StringBuilder strBuilder = new StringBuilder(input).append("0");
        strBuilder =strBuilder.reverse();
        StringBuilder op = new StringBuilder();
        int index=1;
        for(int i=0;i<expectedOp.length();i++)
        {
            if(i==0)
                op.append(strBuilder.charAt(index));
                else
            {
                op.append(strBuilder.charAt(index));
            }
        }
    }
}
