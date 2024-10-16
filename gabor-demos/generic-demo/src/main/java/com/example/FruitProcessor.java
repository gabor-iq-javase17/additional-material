package com.example;

public class FruitProcessor {
    // this represents 100 000 lines of source code wich is using the Fruit type
    // those code called 'client code'
    // this code is in depenedency with the Fruit type
    public void process(MyList<? extends Fruit> fruits) {
        // this would be a compile error, because of : <? extends Fruit> declaration
        // var peach = new Peach("Peach", "Yellow", "White");
        // fruits.append(peach);

        for (int i = 0; i < fruits.getCount(); i++) {
            var fruit = fruits.get(i);
            fruit.harvest();
            fruit.eat();
            fruit.peel();
        }
    }

}
