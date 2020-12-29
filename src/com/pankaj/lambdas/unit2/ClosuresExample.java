package com.pankaj.lambdas.unit2;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //Value of b will always be final.If we change it then lambda will throw compile time error
        completeProcess(a, i -> System.out.println(i + b));
        //b=b+10;
        System.out.println(b);
    }

    public static void completeProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
