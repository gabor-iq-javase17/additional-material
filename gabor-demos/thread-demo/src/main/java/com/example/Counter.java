package com.example;

public class Counter implements Runnable {
    private int count1 = 0;
    private int count2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public int getCount1() {
        return count1;
    }

    public int getCount2() {
        return count1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                // this not atomic operation without synchronization
                // a read and a write
                // now it is atomic:

                increment1();
                increment2();

            }
        }
    }

    synchronized private void increment1() {
        count1 = count1 + 1;
    }

    synchronized private void increment2() {
        count2 = count2 + 1;
    }
}
