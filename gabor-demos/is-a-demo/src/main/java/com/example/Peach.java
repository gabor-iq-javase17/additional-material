package com.example;

public class Peach extends Fruit {
    private String variety;

    public Peach(String name, String color, String variety) {
        super(name, color);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public void harvest() {
        System.out.println("The peach is harvested.");
    }

    @Override
    public void process() {
        System.out.println("The peach is processed.");
    }

    @Override
    public void eat() {
        System.out.println("The peach has been eaten.");
    }

}
