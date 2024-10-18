package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> numbersQueue = new LinkedList<>();
        for (int i = 1; i <= 1000; i++) {
            numbersQueue.add(i); // Filling the queue with numbers 1 to 1000
        }

        int numThreads = 4;
        SumThread[] tasks = new SumThread[numThreads];

        // Start threads that will compete for consuming numbers from the queue
        for (int i = 0; i < numThreads; i++) {
            tasks[i] = new SumThread(numbersQueue);
            tasks[i].start();
        }

        int totalSum = 0;
        for (SumThread task : tasks) {
            task.join(); // Wait for all threads to finish
            totalSum += task.getPartialSum();
        }

        System.out.println("Total sum: " + totalSum); // Expected output: 500500
    }
}
