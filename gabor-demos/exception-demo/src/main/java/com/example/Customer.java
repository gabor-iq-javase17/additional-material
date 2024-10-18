package com.example;

public class Customer {
    private String name;
    private int age;
    private int salary;

    public Customer(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // java have short-circuit evaluation for the logical operators
        // if (name == null || name.isBlank()) {
        // throw new IllegalArgumentException("Name cannot be null or empty");
        // }

        if (name == null) {
            throw new NullPointerException();
        }

        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
