package com.example;

// This is inheritance
// Apple is a subclass of BaseFruit, and BaseFruit is a superclass of Apple
// Apple inherits from BaseFruit, so Apple is a BaseFruit
// Apple implements the Fruit interface, so Apple *** is a *** Fruit

// 

public class Apple extends BaseFruit {
    private String variety;

    public Apple(String name, String color, String variety) {
        super(name, color);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    // this is an annotation, not mandatory but a good practice
    @Override
    public void harvest() {
        System.out.println("The apple is harvested.");
    }

    @Override
    public void process() {
        System.out.println("The apple is processed.");
    }

    @Override
    public void eat() {
        System.out.println("The apple has been eaten.");
    }
}
