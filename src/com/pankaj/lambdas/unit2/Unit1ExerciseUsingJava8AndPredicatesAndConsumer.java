package com.pankaj.lambdas.unit2;

import com.pankaj.lambdas.exercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseUsingJava8AndPredicatesAndConsumer {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pankaj", "Verma", 35),
                new Person("Shivani", "Pareta", 30),
                new Person("Sumit", "Malviya", 32),
                new Person("Atharv", "Verma", 2),
                new Person("Sheetal", "Malviya", 30),
                new Person("Advika", "Pareta", 1)
        );


        /*2 Sort List by Last Name*/
        System.out.println("Last Name Sorting");
        // Option 1 Using Collections.sort
        System.out.println("Option 1 Using Collections.sort");
        Collections.sort(people,(o1,o2)-> o1.getlName().compareTo(o2.getlName()));

        Collections.shuffle(people);

        // Option 1 Using people.sort
        System.out.println("Option 1 Using people.sort");
        people.sort((o1,o2)-> o1.getlName().compareTo(o2.getlName()));


        //Create a method that prints all elements in list

        //Create a method that prints all People having Last Name starting with V
        System.out.println("Filter on Basis of Last Name Starting with M");
        filterListBasedOnCondition(people,p->p.getlName().startsWith("M"),p-> System.out.println(p.getlName()));

        //Create a method that prints all People having First Name starting with S
        System.out.println("Filter on Basis of First Name Starting with S");
        filterListBasedOnCondition(people, (p) -> p.getfName().startsWith("S"),p-> System.out.println(p.getfName().toUpperCase()));

        //Create a method that prints all People Full Name in CAPS
        System.out.println("No Filter");
        filterListBasedOnCondition(people,p->true,p-> System.out.println((p.getfName()+" "+p.getlName()).toUpperCase()));
    }



    public static void filterListBasedOnCondition(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}

