package com.pankaj.lambdas.exercise;

public class Person implements Comparable<Person>{
    private String fName;
    private String lName;
    private int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * Natural Ordering in alpha sorting of first Name and Last Name
     * @param o
     * @return
     */
    @Override
    public int compareTo(Person o) {
        String fullName=fName.concat(lName);
        String fullNameOfOtherPerson=o.getfName().concat(o.getlName());
        return fullName.compareTo(fullNameOfOtherPerson);
    }
}
