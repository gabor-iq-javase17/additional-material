package com.example;

public interface MyComparator<T> {
    // returns a negative integer, zero, or a positive integer
    // as the first argument is less than, equal to, or greater than the second.
    public int compare(T t1, T t2);
}
