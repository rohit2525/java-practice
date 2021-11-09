package com.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListspeedTest {

    public static void main(String[] args) {

        List<Integer> aL = new ArrayList<>();

        for(int i=0;i<100000;i++)
        {
            aL.add(i);
        }

        List<Integer> lL = new LinkedList<>();

        for(int i=0;i<100000;i++)
        {
            lL.add(i);
        }

        long initArrayList=System.nanoTime();;
        aL.remove(13000);
        aL.remove(12000);
        aL.remove(27000);

        long comArrayList=System.nanoTime();;
        System.out.println("ArrayList : "+(comArrayList-initArrayList));

        long initLinkedList=System.nanoTime();;
        lL.remove(13000);
        lL.remove(12000);
        lL.remove(27000);
        long comLinkedList=System.nanoTime();

        System.out.println("Linked : "+(comLinkedList-initLinkedList));

    }
}
