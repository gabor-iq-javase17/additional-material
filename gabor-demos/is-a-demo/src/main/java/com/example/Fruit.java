package com.example;

public class Fruit {
    private String name;
    private String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Accessor methods: getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    // this is a method, but in more general terms it is an operation
    public void harvest() {
        System.out.println("The fruit is harvested.");
    }

    public void eat() {
        System.out.println("The fruit has been eaten.");
    }

    public void process() {
        System.out.println("The fruit is pocessed.");
    }

}
