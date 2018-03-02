package com.yom.java8.optional;

import java.util.Optional;

public class OptionalDemo {


    public static void main(String[] args) {

        //EMPTY CREATION
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Something is there: " + emptyOptional);

        //WITH VALUE
        Optional<String> nonEmptyOptional = Optional.of("A");
        System.out.println("Something is there: " + nonEmptyOptional);
        System.out.println("Values are "+nonEmptyOptional);

        //isPresent
        boolean isPresent = nonEmptyOptional.isPresent();
        System.out.println("isPresent "+isPresent);

        //IfPresent
        nonEmptyOptional.ifPresent(System.out::println);
        emptyOptional.ifPresent(System.out::println);


        String nullValue = null;
       // Optional<String> nullPointerIssue = Optional.of(nullValue);

        //solve
        Optional<String> nullHandled = Optional.ofNullable(nullValue);
        System.out.println("Values are "+nullHandled);


    }




}
