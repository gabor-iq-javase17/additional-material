package com.example;

import java.util.Queue;

class SumThread extends Thread {
    private Queue<Integer> numbersQueue;
    private int partialSum = 0;

    public SumThread(Queue<Integer> numbersQueue) {
        this.numbersQueue = numbersQueue;
    }

    @Override
    public void run() {
        while (true) {
            Integer number;
            synchronized (numbersQueue) {
                if (numbersQueue.isEmpty()) {
                    break;
                }
                number = numbersQueue.poll(); // Retrieve and remove a number from the queue
            }
            if (number != null) {
                partialSum += number;
            }
        }
    }

    public int getPartialSum() {
        return partialSum;
    }
}
