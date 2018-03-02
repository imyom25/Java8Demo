package com.yom.java8.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20);

        Integer reductionSum =
                numbers.stream()
                        .reduce(0, Integer::sum);

        System.out.println("result of sum: " + reductionSum);

        Optional<Integer> reductionMax =
                numbers.stream()
                        .reduce(Integer::max);

        System.out.println("result of max: " + reductionMax);


    }
}
