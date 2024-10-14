package com.example;

public class FruitProcessor {
    // this represents 100 000 lines of source code wich is using the Fruit type
    // those code called 'client code'
    // this code is in depenedency with the Fruit type
    public void process(Fruit fruit) {
        fruit.harvest();
        fruit.process();
        fruit.eat();
    }
}
