package com.autobots.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {
    public static void main(String[] args) {
        MathOperation addition = (a,b)->a+b;
        MathOperation multi = (a,b)->a*b;
//        MathOperation y = (a,b)->a-b;
        System.out.println("5 + 3 ="+addition.operation(5,3));


        Predicate<String> isNotEmpty=s->!s.isEmpty();
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmpty.test("Java"));

        Function<Integer,String>toStringFun = i->"chislo :"+i;
        System.out.println(toStringFun.apply(10));

        Consumer<String> print = s-> System.out.println("Writing: "+s);
        print.accept("Hello World");
    }
}
