package com.yom.java8.optional;

import java.util.Optional;

public class OptionalFilter {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.of("ABD");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println(stringOptional.filter(name->name.equals("ABD")));
        System.out.println(stringOptional.filter(name->name.equalsIgnoreCase("abd")));
        System.out.println(emptyOptional.filter(name->name.equals("ABD")));


    }
}
