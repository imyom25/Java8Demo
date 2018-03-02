package com.yom.java8.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumer {

    public static void main(String[] args) {

        List<String> data = Arrays.asList("one", "two", "three", "four");

        List<String> result = new ArrayList<>();

        Consumer<String> c1 = System.out::println;

        Consumer<String> c2 = result::add;

        data.forEach(c1.andThen(c2));

        System.out.println("Result size is: " + result.size());
    }
}
