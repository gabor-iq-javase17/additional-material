package com.example;

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

    @Override
    public void peel() {
        System.out.println("Peeling an apple");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting an apple");
    }

    @Override
    public void eat() {
        System.out.println("Eating an apple");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", variety='" + variety + '\'' +
                '}';
    }

}
