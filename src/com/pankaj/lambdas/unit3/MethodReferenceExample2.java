package com.pankaj.lambdas.unit3;

import com.pankaj.lambdas.exercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pankaj", "Verma", 35),
                new Person("Shivani", "Pareta", 30),
                new Person("Sumit", "Malviya", 32),
                new Person("Atharv", "Verma", 2),
                new Person("Sheetal", "Malviya", 30),
                new Person("Advika", "Pareta", 1)
        );
        //Method reference :Lambda for Consumer is replaced by Method Reference. (a)->method(a)
        filterListBasedOnCondition(people, p -> true,System.out::println);//
    }


    public static void filterListBasedOnCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}
