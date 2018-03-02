package com.yom.java8.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> list2 = Arrays.asList(9, 10, 11);
        List<Integer> list3 = Arrays.asList(12, 13, 14);

        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
        System.out.println(finalList);

        Function<List<?>, Integer> size = List::size;
        Function<List<Integer>, Stream<Integer>> flapMapper = l -> l.stream();


        finalList.stream()
                .flatMap(flapMapper)
                .forEach(System.out::println);

    }
}
