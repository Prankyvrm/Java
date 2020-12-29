package com.pankaj.lambdas.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingBlock {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int key = 0;

        process(arr, key, (a, k) -> {
            try {
                System.out.println(a / k);
            } catch (ArithmeticException e) {
                System.err.println("Divide by Zero");
            }
        });
    }

    public static void process(int arr[], int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int a : arr) {
            biConsumer.accept(a, key);
        }
    }
}
