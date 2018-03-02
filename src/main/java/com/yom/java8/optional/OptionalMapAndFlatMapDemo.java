package com.yom.java8.optional;

import java.util.Optional;

public class OptionalMapAndFlatMapDemo {

    public static void main(String[] args) {

        Optional<String> optionalName = Optional.of("Yogendra");
        Optional<String> emptyName = Optional.empty();

        System.out.println("UpperCase of optionalName " + optionalName.map(String::toUpperCase));
        System.out.println("UpperCase of emptyName " + emptyName.map(String::toUpperCase));


        Optional<Optional<String>> optionalOptionalString = Optional.of(Optional.of("Mishra"));
        System.out.println("UpperCase of double optionalName " + optionalOptionalString);
        System.out.println("Map of optional square optionalName " + optionalOptionalString.
                map(name -> name.map(String::toUpperCase)));

        System.out.println("FlatMap of optional square Name " + optionalOptionalString.
                flatMap(n -> n.map(String::toUpperCase)));


    }
}
