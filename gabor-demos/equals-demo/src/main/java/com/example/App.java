package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var device1 = new Device("gabors-phone", "iphone 15 pro");
        var device2 = new Device("johns-phone", "android clone");

        // part one (prologue)
        System.out.println(device1.getName()); // gabors-phone
        // this is only assingment of reference values (pointers), not assingning the
        // instances itself
        // the effect of this assignment that device1 now will point (reference)
        // to the same instance as device2 is referring
        // is that device1 and device2 will point to the same instance
        device1 = device2;

        System.out.println(device1.getName()); // gp: jp |||.......

        device2.setName("anything else");
        System.out.println(device1.getName()); // ae: ||||| jp: ||||||

        // part two: let's see how == vs equals works

        var device3 = new Device(new String("gabors-phone"), "iphone 15 pro");
        var device4 = new Device(new String("gabors-phone"), "iphone 15 pro");

        // will write out false, because == compares the references
        if (device3 == device4) {
            System.out.println("device3 is the same device4");
        } else {
            System.out.println("device3 is not the same as device4");
        }

        // will write out true, because equals intends to compare content
        if (device3.equals(device4)) {
            System.out.println("device3 is the same device4");
        } else {
            System.out.println("device3 is not the same as device4");
        }

    }
}
