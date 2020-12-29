package com.pankaj.lambdas.exercise;

import java.util.*;

public class Unit1ExerciseUsingJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pankaj", "Verma", 35),
                new Person("Shivani", "Pareta", 30),
                new Person("Sumit", "Malviya", 32),
                new Person("Atharv", "Verma", 2),
                new Person("Sheetal", "Malviya", 30),
                new Person("Advika", "Pareta", 1)
        );

        /* Problem 1: Default Sort */
        System.out.println("Default Sorting");
        //Option 1
        System.out.println("Option 1");
        Collections.sort(people);
        print(people);

        //Shuffling
        System.out.println("Shuffled");
        Collections.shuffle(people);
        print(people);


        //Option 2
        System.out.println("Option 2");
        people.sort(null);
        print(people);

        Collections.shuffle(people);

        /*2 Sort List by Last Name*/
        System.out.println("Last Name Sorting");

        // Option 1 Using Collections.sort
        System.out.println("Option 1 Using Collections.sort");
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getlName().compareTo(o2.getlName());
            }
        });
        print(people);

        Collections.shuffle(people);
        // Option 1 Using people.sort
        System.out.println("Option 1 Using people.sort");
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getlName().compareTo(o2.getlName());
            }
        });
        print(people);
        //Create a method that prints all elements in list


        //Create a method that prints all People having Last Name starting with V

        System.out.println("Filter on Basis of Last Name Starting with M");
        List<Person> filterdPeople =filterListBasedOnCondition(people, new CheckCondition() {
            @Override
            public boolean checkIfValid(Person person) {
                return person.getlName().startsWith("M");
            }
        });
        print(filterdPeople);

        //Create a method that prints all People having First Name starting with S

        System.out.println("Filter on Basis of First Name Starting with S");
        List<Person> filterdPeople2 =filterListBasedOnCondition(people, new CheckCondition() {
            @Override
            public boolean checkIfValid(Person person) {
                return person.getfName().startsWith("S");
            }
        });
        print(filterdPeople2);
    }

    public static void print(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static List<Person> filterListBasedOnCondition(List<Person> people, CheckCondition checkCondition) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : people) {
            if (checkCondition.checkIfValid(person)) {
                filteredList.add(person);
            }

        }
        return filteredList;
    }

}

interface CheckCondition {
    boolean checkIfValid(Person person);
}