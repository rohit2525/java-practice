package com.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*can anyone help me with a logic for genrate te below output:
        Input:12345
        Output:
        51234
        45123
        34512
        23451
        12345*/
public class GenNumbers {
    public static void main(String[] args) {
        String input = "12345";
        long start = System.currentTimeMillis();
        printNumbers(input);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("---------------------------------------------------------------------");
        long start2 = System.currentTimeMillis();
        System.out.println(orderlyQueue(input));
        System.out.println(orderlyQueue(input).size());
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);


    }

    private static void printNumbers(String input) {
        int pos;
        int strLen = input.length();
        for (int i = 0; i < strLen; i++) {
            pos = strLen - 1 - i;
            for (int j = 0; j < strLen; j++) {
                System.out.print(input.charAt(pos));
                pos++;
                if (pos == strLen)
                    pos = 0;
            }
            System.out.println();
        }
    }

    public static List orderlyQueue(String s) {
        List<String> list = new ArrayList<>();
        int length = s.length(), i = length - 1;
        s = s + s;
        while (i >= 0) list.add(s.substring(i, (i--) + length));
        return list;
    }

    /*public static Arrays genRandomInOneLoop(int no) {
        Arrays resultArray[];
        int noOfDigits = no;
      int  count=noOfDigits + 1;
        int rotatedNo=no;
        for count > 0 {
            mod:=rotatedNo % 10
            rem:=rotatedNo / 10
            rotatedNo = mod *int(math.Pow10(noOfDigits)) + rem
            resultArray = append(resultArray, rotatedNo)
            count--
        }
        return resultArray
    }*/
}
