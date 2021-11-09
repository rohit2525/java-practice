package com.example.extra;

import java.security.SecureRandom;
import java.util.*;

public class RandomNumberGen {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(genRandom());
        }
        System.out.println(findDuplicates(list));
      //  System.out.print(list);
       ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list2.add(randomString(6));
        }
        System.out.println(findDuplicates(list2));
    }

    public static Long genRandom() {
        long ran = new SecureRandom().nextLong();
        return (Math.abs(( (((ran*19571) / (8647))*11311) )% 1000000));
    }

    public static int getRandom2() {
        {
            Random r = new Random(System.currentTimeMillis());
            return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
        }
    }

    private static <T> long findDuplicates(Collection<T> collection) {
        Set<T> uniques = new HashSet<>();
        return collection.stream()
                .filter(e -> !uniques.add(e))
                .count();
    }

    static final String AB = "0123456789abcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    static  String randomString(int len){
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }
}
