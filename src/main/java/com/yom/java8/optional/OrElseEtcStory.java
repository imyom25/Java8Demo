package com.yom.java8.optional;

import java.util.Optional;

public class OrElseEtcStory {


    public static void main(String[] args) {

        String value = "MSD";
        String defaultValue = "value";

        String valueWithOrElse = Optional.ofNullable(value).orElse(defaultValue);
        System.out.println("valueWithOrElse " + valueWithOrElse);

        String valueWithOrElseGet = Optional.ofNullable(value).orElseGet(() -> defaultValue);
        System.out.println("valueWithOrElseGet " + valueWithOrElseGet);

        Optional.ofNullable(null).orElseThrow(IllegalArgumentException::new);


    }
}
