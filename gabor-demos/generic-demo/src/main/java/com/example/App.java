package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var customer = new Customer("John Doe", "qwe@qwe.com", "123456789");
        var myList = new NaiveList<Customer>();
        var myOtherList = new NaiveList<Device>();

        myList.append(customer);
        myOtherList.append(new Device("gabors-phone", "iphone 15 pro"));

    }
}
