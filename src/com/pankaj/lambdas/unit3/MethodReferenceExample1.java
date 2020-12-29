package com.pankaj.lambdas.unit3;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->printMessage());
        Thread t2 = new Thread(MethodReferenceExample1::printMessage);
        t1.run();
        t2.run();
    }
    public static void printMessage(){
        System.out.println("Hello");
    }

}
