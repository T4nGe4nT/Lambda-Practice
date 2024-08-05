package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       // Simple lambdas
        System.out.println("Using the parameters  a = 2 & b = 2 the following results per operation");

        Opperation add = (a, b) -> a + b;
        int resultA = add.opperate(2, 2);
        System.out.println("Addition result: " + resultA);

        Opperation sub = (a, b) -> a - b;
        int resultB = sub.opperate(2, 2);
        System.out.println("Subtraction result: " + resultB);

        Opperation mul = (a, b) -> a * b;
        int resultC = mul.opperate(2, 2);
        System.out.println("Multiplication result: " + resultC);

        Opperation div = (a, b) -> a / b;
        int resultD = div.opperate(2, 2);
        System.out.println("Division result: " + resultD);


        // Built in functional interfaces.

        Predicate<Integer> isEven = (a) -> a % 2 == 0;
        boolean result = isEven.test(2);
        System.out.println("Is even result: " + result);

        Function<String, Integer> stringLength = (a) -> a.length();
        int resultLength = stringLength.apply("How long am I?");
        System.out.println("The string is " + resultLength + " characters long");

        Consumer<Integer> number = (b) -> System.out.println(b);
        number.accept(13);
        System.out.println("The number is " + number);

        Supplier<Double> randomValue = () -> Math.random();
        double value = randomValue.get();
        System.out.println("The random value is " + value);











    }
}