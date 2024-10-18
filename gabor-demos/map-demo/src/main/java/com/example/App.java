package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Map<String, Customer> customers = new HashMap<String, Customer>() {
            {
                put("AL", new Customer("Alice", "123 Main St", "AL", 20));
                put("BO", new Customer("Bob", "456 Elm St", "BO", 30));
                put("CH", new Customer("Charlie", "789 Oak St", "CH", 10));
            }
        };

        customers.put("JO", new Customer("John", "123 Main St", "JO", 20));

        var customer = customers.get("AL");

        if (!customers.containsKey("JO")) {
            customers.put("JO", new Customer("Johanna", "123 Main St", "JO", 20));
        }

        for (var entry : customers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String key : customers.keySet()) {
            System.out.println(key + ": " + customers.get(key));
        }

        for (Customer value : customers.values()) {
            System.out.println(value);
        }

    }
}
