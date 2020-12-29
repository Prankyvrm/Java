package com.pankaj.lambdas;

public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        //Regular Implementation using concrete class
        Greeting helloWorldGreeting = new HelloWorldGreeting();

        //Using Anonymous Inner Class
        Greeting anoInnerClass= new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        };

        //Using Lamdas
        Greeting myLamdaGreeting = ()-> System.out.println("Hello World");

        //Executing all 4 implementations
        greeter.greet(helloWorldGreeting);
        greeter.greet(anoInnerClass);
        greeter.greet(myLamdaGreeting);

        //We can directly pass on Lamdas as well.See below sout
        greeter.greet(() -> System.out.println("Hello World"));



    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}

interface Greeting {
    public void perform();
}


class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}

