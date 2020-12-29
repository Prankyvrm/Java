package com.pankaj.lambdas.unit3;

import com.pankaj.lambdas.exercise.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionsIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pankaj", "Verma", 35),
                new Person("Shivani", "Pareta", 30),
                new Person("Sumit", "Malviya", 32),
                new Person("Atharv", "Verma", 2),
                new Person("Sheetal", "Malviya", 30),
                new Person("Advika", "Pareta", 1)
        );

        System.out.println("Using For Loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("For In Loop");
        for (Person p:people){
            System.out.println(p);
        }

        System.out.println("Using list.forEach Using Lambda");
        people.forEach((p)-> System.out.println(p));

        System.out.println("Using list.forEach Using Method Reference");
        people.forEach(System.out::println);
    }
}
