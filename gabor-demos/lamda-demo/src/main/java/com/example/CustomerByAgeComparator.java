package com.example;

public class CustomerByAgeComparator implements MyComparator<Customer> {

    @Override
    public int compare(Customer t1, Customer t2) {
        // TODO: handle t1 or t2 is null gracefully
        return t1.getAge() - t2.getAge();
    }

}
