package com.example;

public class Customer {
    private final String id;
    private final String name;
    private final String address;
    private final int age;

    public Customer(String name, String address, String id, int age) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

}
