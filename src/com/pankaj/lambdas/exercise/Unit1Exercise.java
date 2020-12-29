package com.pankaj.lambdas.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pankaj","Verma",35),
                new Person("Shivani","Pareta",30),
                new Person("Sumit","Malviya",32),
                new Person("Atharv","Verma",2),
                new Person("Sheetal","Malviya",30),
                new Person("Advika","Pareta",1)
        );


        //Default Sort
        System.out.println("Default Sorting");
        //Java 7 way
        //Collections.sort(people);
        //Java 8
        people = people.stream().sorted().collect(Collectors.toList());
        System.out.println(people);

        //1 Sort List by Last Name
        System.out.println("Last Name Sorting");
        people.sort((o1, o2) -> o1.getlName().compareTo(o2.getlName()));
        System.out.println(people);
        //Create a method that prints all elements in list
        //Create a method that prints all People having Last Name starting with V
    }

}
