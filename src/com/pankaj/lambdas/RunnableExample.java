package com.pankaj.lambdas;

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Anonymous Inner Class Runnable");
            }
        });

    thread.run();

    //Using Lamdas
    Thread  lambdaThread= new Thread(() -> System.out.println("Inside Lambda Runnable"));
    lambdaThread.run();

    }

}
