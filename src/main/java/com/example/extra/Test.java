package com.example.extra;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class A {
    void m1() throws IOException {
        System.out.println("In m1 A");
    }
}

class B extends A {
    //Below we cannot throw Exception, Since child class cannot throw higher exception then parent class
    void m1() {
        System.out.println("In m1 B");
    }
}

public class Test {

/*    public static void main(String[] args) {
        A a=new B();
        try {
            a.m1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        Integer[] i = {6, 7, 8, 9, 1, 2, 3, 4, 5};

        Map<Integer, List<Integer>> collect = Arrays.stream(i).collect(Collectors.groupingBy(e -> e % 2));


      collect.entrySet().stream()
                .filter(m -> m.getKey() == 0)
                .collect(Collectors.toList());


    }
}