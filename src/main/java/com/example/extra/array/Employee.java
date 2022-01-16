package com.example.extra.array;

import lombok.Data;

import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;

@Data
public class Employee {
    private int eNo;
    private String eName;
    private Date eDob;
    private Long eSal;


    public static void main(String[] args) {
        String ename = "rohit";
        String ename2 = ename;
        HashMap<String, String> map = new HashMap<>();
        map.put(ename, "exyz");
        map.put(ename2, "pqr");
        //System.out.println(map);

        String internString = "shubham";
        internString = internM1(internString);
        System.out.println(internString);


        String newString = new String("shubham");
        newM1(newString);
        System.out.println(newString);

        StringBuilder name = new StringBuilder("shubham");
        builderM1(name);
        System.out.println(name);




    }

    public static String internM1(String a) {
        return "rohit";
    }

    public static void newM1(String a) {
        a = new String("rohit");
    }

    public static void builderM1(StringBuilder a) {
      a.append("shahid");
        //  a = new StringBuilder("rohit");
    }

    /* String name= SCP--> data1 --> shubham

    String a= SCP --> rohit

//reference as a value pass ho raha hai
    //name --> shubham --> a-->shubham rohit

    *
    * */

}
