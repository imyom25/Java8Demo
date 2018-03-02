package com.yom.java8.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        Stream<String> data = Stream.of("one", "two", "three", "four");

        Predicate<String> p1 = s -> s.length() > 3;

        Predicate<String> p2 = Predicate.isEqual("three");
        Predicate<String> p3 = Predicate.isEqual("four");

        data.
                filter(p2.or(p3))
                .forEach(System.out::println);

    }

}
