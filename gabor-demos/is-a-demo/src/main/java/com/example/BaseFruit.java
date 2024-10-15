package com.example;

public abstract class BaseFruit implements Fruit {
    private String name;
    private String color;

    BaseFruit(String name, String color) {
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

    public abstract void harvest();

    public abstract void eat();

    public abstract void process();

}
