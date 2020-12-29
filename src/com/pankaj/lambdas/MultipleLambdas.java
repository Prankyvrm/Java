package com.pankaj.lambdas;

public class MultipleLambdas {
    public static void main(String[] args) {
        //Lamdas
        LambdaInterface1 lambdaInterface1 = () -> System.out.println("Interface1");
        LambdaInterface2 lambdaInterface2 = (x, y) -> x + y;
        LambdaInterface3 lambdaInterface3 = x -> String.valueOf(x);
        LambdaInterface4 lambdaInterface4 = () -> "Random";
        LambdaInterface5 lambdaInterface5 = ((a, b) -> String.valueOf(a+b));

        lambdaInterface1.foo();
        System.out.println(lambdaInterface2.foo(1,2));
        System.out.println(lambdaInterface3.foo(1));
        System.out.println(lambdaInterface4.foo());
        System.out.println(lambdaInterface5.foo("a",1));
    }


}

interface LambdaInterface1 {
    /**
     * No Input No Output
     */
    void foo();
}

interface LambdaInterface2 {
    /**
     * @param x
     * @param y
     * @return int
     */
    int foo(int x, int y);

}

interface LambdaInterface3 {
    /**
     * @param x
     * @return String
     */
    String foo(int x);

}

interface LambdaInterface4 {
    /**
     * No Input
     * @return String
     */
    String foo();

}

interface LambdaInterface5 {
    /**
     * @param a :String
     * @param b : int
     * @return : String
     */
    String foo(String a, int b);

}


