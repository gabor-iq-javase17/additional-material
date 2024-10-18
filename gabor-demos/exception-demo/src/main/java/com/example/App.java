package com.example;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        var customer = new Customer("John Doe", 30, 2000);
        // use scanner to read from console the age

        var scanner = new Scanner(System.in);
        boolean isAgeValid = false;
        do {
            System.out.println("Please enter the age: ");
            int age = scanner.nextInt();

            System.out.println("Please enter the name: ");
            // ask the user to enter the name:
            String name = scanner.next();

            try {
                customer.setAge(age);
                customer.setName(name);
                isAgeValid = true;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                // System.out.println("Invalid age: " + e.getMessage());
                System.out.println("Invalid age: " + age);
            }

        } while (!isAgeValid);

        System.out.println(customer);

        var textProcessor = new TextProcessor();
        int wordCount = 0;
        try {
            wordCount = textProcessor.wordCountInFileWhichThrows("t:\\sample.txt");
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println("Word count: " + wordCount);

    }
}
