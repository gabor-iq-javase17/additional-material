package com.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var myRunnable = new MyRunnable();

        // for (int i = 0; i < 8; i++) {
        // var myThread = new Thread(myRunnable);
        // myThread.setName("MyThread-" + i);
        // myThread.start();
        // }

        var threads = new ArrayList<Thread>();
        var counter = new Counter();
        for (int i = 0; i < 8; i++) {
            var thread = new Thread(counter);
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // 800 000 000
        // < 800 000 000
        // > 800 000 000
        System.out.println("Count: " + counter.getCount());
    }
}
