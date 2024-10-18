package com.example;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(500);
                System.out.println("Hello from thread: " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
