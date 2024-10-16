package com.example;

// MyList is intend to be a collection of elements, so it can containt multiple elements
// and define operations on them, like adding elements, removing elements, 
// querying (or getting) an element  at a particular position
// updating (setting) and element at a particular position,
// , iterating over elements,
// finding elements and querying the count of elements in this list.

public interface MyList<T> {
    void append(T element);

    void insert(int index, T element);

    // it removes the first occurence of the element from the list which equals
    // (.equals) to the given element
    // if the element is not in the list, it does nothing
    void remove(T element);

    void removeAt(int index);

    T get(int index);

    void set(int index, T element);

    int getCount();
}
