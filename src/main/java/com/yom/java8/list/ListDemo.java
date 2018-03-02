package com.yom.java8.list;

import com.yom.java8.dto.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        Person p1 = new Person("Yogendra", 26);
        Person p2 = new Person("Prasoon", 16);
        Person p3 = new Person("Shashnak", 12);
        Person p4 = new Person("Avinash", 36);


        List<Person> personList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

        personList.removeIf(person -> person.getAge() < 20);

        personList.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));

        personList.forEach(System.out::println);
    }
}
