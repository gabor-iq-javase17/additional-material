package com.example;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // List<Customer> customers = new ArrayList<Customer>();
        // customers.add(new Customer("John Doe", 30, 2000));
        // customers.add(new Customer("Jane Doe", 25, 1500));
        // customers.add(new Customer("Jack Doe", 40, 2200));

        // this immutable so do not suits for sorting
        // var customers = List.of(
        // new Customer("John Doe", 30, 2000),
        // new Customer("Jane Doe", 25, 1500),
        // new Customer("Jack Doe", 40, 2200));

        List<Customer> customers = new ArrayList<Customer>() {
            {
                add(new Customer("John Doe", 30, 2000));
                add(new Customer("Jane Doe", 25, 1500));
                add(new Customer("Jack Doe", 40, 2200));
            }
        };

        var sorter = new Sorter();
        var comparator = new CustomerByAgeComparator();
        sorter.sequentialSort(customers, comparator);

        // use anonymous class to implement MyComparator the interface:
        sorter.sequentialSort(customers, new MyComparator<Customer>() {
            @Override
            public int compare(Customer t1, Customer t2) {
                return t1.getAge() - t2.getAge();
            }
        });

        // original more verbose but also correct lambda expression:
        sorter.sequentialSort(customers, (Customer t1, Customer t2) -> {
            // TODO: handle t1 or t2 is null gracefully
            return t1.getAge() - t2.getAge();
        });

        // use lambda expression to implement MyComparator the interface:
        sorter.sequentialSort(customers, (t1, t2) -> t1.getAge() - t2.getAge());

        for (var customer : customers) {
            System.out.println(customer);
        }

    }
}
