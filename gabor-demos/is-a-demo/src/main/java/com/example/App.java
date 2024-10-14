package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Apple", "Red");
        Apple apple = new Apple("Apple", "Red", "Fuji");
        Peach peach = new Peach("Peach", "Yellow", "White");

        //
        // <op1> [is-a] <op2>

        // *** use case 1: ***
        fruit = apple; // will be compiled and could make sense

        // *** use case 2: ***
        // compile error so commented out
        // apple = fruit; // will not compile but could make sense

        // will compile and it is better make sense if it not, it will be a runtime
        //
        // with the type cast (Apple) we are telling the compiler: trust me, I know what
        // I am doing, the fruit
        // will be an apple
        apple = (Apple) fruit;

        // *** use case 3: ***
        // always compile error... makes no sense in any case...
        // apple = peach;

        // use compiler time inference
        // does exactly the same as it would be if FruitProcessor, this is a syntax
        // sugar

        var processor = new FruitProcessor();
        var myApple = new Apple("Apple", "Red", "Fuji");

        // outputs: apple operations ||||||||||
        // this is a polymorphism:
        processor.process(myApple);
    }
}
