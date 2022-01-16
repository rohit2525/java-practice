package com.example.string;

import java.util.Arrays;
import java.util.stream.Collectors;

/*//input: ("abc.def.ghi", "pqr.mno.stu")//output: (abc,def,ghi,pqr,mno,stu)*/
public class Random2 {
    public static void main(String[] args) {
        String input1 = "abc.def.ghi";
        String input2 = "pqr.mno.stu";

        System.out.println(
                Arrays.stream(input1.concat(".")
                        .concat(input2).split("\\."))
                          .collect(Collectors.joining(",")));

        String[] inArr = {"abc.def.ghi", "pqr.mno.stu"};
        //  System.out.println( Arrays.stream(inArr).);


    }
}
