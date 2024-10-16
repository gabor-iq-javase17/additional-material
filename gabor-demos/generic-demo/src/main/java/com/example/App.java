package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // var customer = new Customer("John Doe", "qwe@qwe.com", "123456789");
        // var myList = new NaiveList<Customer>();
        // var myOtherList = new NaiveList<Device>();

        // myList.append(customer);
        // myOtherList.append(new Device("gabors-phone", "iphone 15 pro"));

        MyList<Apple> apples = new NaiveList<Apple>();
        apples.append(new Apple("Apple1", "Red", "Fuji"));
        apples.append(new Apple("Apple2", "Green", "Granny Smith"));
        apples.append(new Apple("Apple3", "Green", "Starking"));
        apples.append(new Apple("Apple4", "Green", "Jonagold"));

        var myApple = apples.get(2);
        apples.removeAt(2);

        // we can not use the foreach loop, because we are not implementing the Iterable
        // interface
        // for (var apple : apples) {
        // System.out.println(apple);
        // }

        for (int i = 0; i < apples.getCount(); i++) {
            System.out.println(apples.get(i));
        }

        var processor = new FruitProcessor();

        // Apple is a Fruit TRUE
        // NaiveList is a MyList TRUE
        // NaiveList<Apple> is a MyList<Fruit> FALSE
        // MyList<Apple> is a MyList<Fruit> FALSE
        // covariance and contravariance, invariance
        // this would cause a compile error, without <? extends Fruit> in the process
        // metho
        // the
        processor.process(apples);

    }
}
