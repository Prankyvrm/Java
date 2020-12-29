package com.pankaj.lambdas.unit3;

import com.pankaj.lambdas.exercise.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pankaj", "Verma", 35),
                new Person("Shivani", "Pareta", 30),
                new Person("Sumit", "Malviya", 32),
                new Person("Atharv", "Verma", 2),
                new Person("Sheetal", "Malviya", 30),
                new Person("Advika", "Pareta", 1)
        );

        people.stream()
                .filter(a->a.getfName().startsWith("S"))
                .forEach(System.out::println);


    }
}
