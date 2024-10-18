package com.example;

public class Counter implements Runnable {
    private int count = 0;
    private Object incrementLock = new Object();
    private Object decrementLock = new Object();

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                // this is not an atomic operation, read + write
                // incrementCount();
                synchronized (this) {
                    count = count + 1;
                }
            }
        }
    }

    // private synchronized void incrementCount() {
    // count = count + 1;
    // }

    private void incrementCount() {
        synchronized (incrementLock) {
            count = count + 1;
        }
    }

    // private synchronized void decrementCount() {
    // count = count - 1;
    // }

    private void decrementCount() {
        synchronized (decrementLock) {
            count = count - 1;
        }
    }
}
