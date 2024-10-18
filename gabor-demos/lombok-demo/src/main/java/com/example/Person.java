package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
// @ToString
@Getter
@Setter
@Builder    
public class Person {
    private String name;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Person {address=" + address + ", age=" + age + ", name=" + name + "]";
    }
}
