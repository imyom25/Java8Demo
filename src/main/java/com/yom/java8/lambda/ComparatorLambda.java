package com.yom.java8.lambda;

import java.util.*;

/**
 * Created by yogendra on 4/2/18.
 */
public class ComparatorLambda {

    public static void main(String[] args) {

        /* Old School Way
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(),s2.length());
            }
        };*/

        Comparator<String> comparatorLambda = Comparator.comparingInt(String::length);

        List<String> list = Arrays.asList("#", "####", "###", "##");
        Collections.sort(list, comparatorLambda);

        for (String s : list) {
            System.out.println(s);
        }

    }
}
