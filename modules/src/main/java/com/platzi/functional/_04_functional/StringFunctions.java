package com.platzi.functional._04_functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("Hola Estudiante de platzi!"));

        System.out.println(addMark.apply("Hola"));

        BiFunction<Integer, Integer, Integer> multiplicacion =
                (x, y) -> x * y;

        multiplicacion.apply(5, 4);
        System.out.println(multiplicacion.apply(5, 4));

        BinaryOperator<Integer> multiplicacion1 =
                (x, y) -> x * y;

        multiplicacion1.apply(3, 9);
        System.out.println(multiplicacion1.apply(3, 9));

        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java", 10));

        List<BiFunction<String, Integer, String>> formateadores;
    }
}
