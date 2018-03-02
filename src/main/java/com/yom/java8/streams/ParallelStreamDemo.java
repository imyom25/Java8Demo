package com.yom.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Yogendra", "Amit", "Maggi", "Nana", "Rahul", "Avinash");

        System.out.println("First Parallel Stream ");

        names.parallelStream().forEach(System.out::println);

        System.out.println("Second Parallel Stream ");

        names.parallelStream().forEach(System.out::println);


    }

}
