package com.example;

public class NaiveList<T> implements MyList<T> {
    // limitation of the compiler, we cannot create an array of a generic type
    // private T[] elements = new T[10];
    private Object[] elements = new Object[10];
    private int count = 0;

    @Override
    public void append(T element) {
        // dynamically grow the array if it is full:
        if (count == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            // use the array copy instead of the loop
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            // for (int i = 0; i < elements.length; i++) {
            // newElements[i] = elements[i];
            // }
            elements = newElements;
        }
        elements[count++] = element;
    }

    @Override
    public void insert(int index, T element) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (count == elements.length) {
            throw new IllegalStateException("List is full");
        }
        for (int i = count; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        count++;
    }

    @Override
    public void remove(T element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                removeAt(i);
                return;
            }
        }
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) elements[index];
    }

    @Override
    public void set(int index, T element) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        elements[index] = element;
    }

    @Override
    public int getCount() {
        return count;
    }
}
