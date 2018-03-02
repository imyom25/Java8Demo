package com.yom.java8.SummaryStatistics;

import com.yom.java8.dto.Person;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class IntSummaryStatisticsDemo {

    public static void main(String[] args) {

        //SIMPLE
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
        System.out.println("SummaryStatistics " + intSummaryStatistics);

        //USE
        Person p1 = new Person("Yogendra", 26);
        Person p2 = new Person("Prasoon", 16);
        Person p3 = new Person("Shashnak", 12);
        Person p4 = new Person("Avinash", 36);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);


        IntSummaryStatistics ageSummaryStatistics = personList.stream().mapToInt(Person::getAge)
                .summaryStatistics();

        System.out.println("ageSummaryStatistics " + ageSummaryStatistics);


    }


}
