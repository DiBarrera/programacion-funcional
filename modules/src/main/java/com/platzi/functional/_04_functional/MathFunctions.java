package com.platzi.functional._04_functional;

import java.util.function.Function;

public class MathFunctions {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Function <Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));
    }

    static int square(int x) {
        return x * x;
    }
}
