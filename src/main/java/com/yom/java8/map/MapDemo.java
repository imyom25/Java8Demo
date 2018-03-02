package com.yom.java8.map;

import com.yom.java8.dto.City;
import com.yom.java8.dto.Person;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {


        Person p1 = new Person("Yogendra", 26);
        Person p2 = new Person("Prasoon", 16);
        Person p3 = new Person("Shashnak", 12);
        Person p4 = new Person("Avinash", 36);


        List<Person> personList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

        City delhi = new City("Delhi");
        City mumbai = new City("Mumbai");
        City banglore = new City("Banglore");
        City chennai = new City("Chennai");


        Map<City, List<Person>> locationMap = new HashMap<>();
        //putIfAbsent
        locationMap.putIfAbsent(delhi, new ArrayList<>());
        locationMap.get(delhi).add(p1);

        //computeIfAbsent
        locationMap.computeIfAbsent(mumbai, city -> new ArrayList<>()).add(p2);
        locationMap.computeIfAbsent(banglore, city -> new ArrayList<>()).add(p3);
        locationMap.computeIfAbsent(mumbai, city -> new ArrayList<>()).add(p4);

        //GetOrDefault
        System.out.println("People from Chennai " + locationMap.getOrDefault(chennai, Collections.EMPTY_LIST));
        System.out.println("People from Delhi " + locationMap.getOrDefault(delhi, Collections.EMPTY_LIST));
        System.out.println("People from Mumbai " + locationMap.getOrDefault(mumbai, Collections.EMPTY_LIST));
        System.out.println("People from Banglore " + locationMap.getOrDefault(banglore, Collections.EMPTY_LIST));


    }
}
