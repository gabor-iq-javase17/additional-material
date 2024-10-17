package com.example;

public class CustomerByWeigthComparator implements MyComparator<Customer> {

    @Override
    public int compare(Customer t1, Customer t2) {
        return (int) (t1.getSalary() - t2.getSalary());
    }

}
