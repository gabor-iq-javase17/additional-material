package com.example;

public class MyRunnable implements Runnable {
    // reentrant code
    @Override
    public void run() {
        var myName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println("Running in: " + myName + ", i = " + i);
            try {
                var sleepTime = (long) (Math.random() * 400);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                // intentionally left blank
                ;
            }
        }
    }

}
