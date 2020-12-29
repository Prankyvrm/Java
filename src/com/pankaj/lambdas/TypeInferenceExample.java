package com.pankaj.lambdas;

public class TypeInferenceExample {
    public static void main(String[] args) {
        //StringLengthFinder stringLengthFinder = str -> str.length();
        //System.out.println(stringLengthFinder.findLengthOfString("Hello"));
        printFromLambdas(str -> str.length());
    }

    public static void printFromLambdas(StringLengthFinder stringLengthFinder){
        System.out.println(stringLengthFinder.findLengthOfString("Hellp World"));
    }
}

interface StringLengthFinder{
    int findLengthOfString(String str);
}
