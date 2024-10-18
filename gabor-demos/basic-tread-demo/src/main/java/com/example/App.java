package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        // 1) inherit from Thread
        // var myThread = new MyThread();
        var myThread = new MyThread();
        myThread.setName("My First background Thread implemented by inheriting from thread");
        myThread.start();

        // 2) implement Runnable which is a functional interface
        Runnable target = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(500);
                    System.out.println("Hello from thread: " + Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        var thread1 = new Thread(target);
        thread1.setName("My First background Thread #1");
        thread1.start();

        var thread2 = new Thread(target);
        thread2.setName("My First background Thread #2");
        thread2.start();

        Thread.currentThread().setName("Main Thread for thread demo");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            System.out.println("Hello from thread: " + Thread.currentThread().getName());
        }
    }
}
