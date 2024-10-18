### Java SE 17 Hands-on Lab: Advanced Topic: Mastering Threading in Java

#### **Introduction**

In this lab, you will explore threading concepts in Java SE 17. Threads enable concurrent execution and are critical for performance optimization in modern applications. You will cover multiple ways of creating threads, parallel summing, atomic operations, and virtual threads. Additionally, you will work with a scenario where competing threads concurrently consume data for parallel summing.

Each exercise provides the expected behavior, and solutions are followed by the exact expected output and a discussion on key points.

---

---

### **Lab Requirements:**

- **Language**: Java
- **Tools**: Maven, Java 17, IDE (e.g., IntelliJ, Eclipse, VS Code)
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming, Threading and Maven.

### **Exercise 1: Two Ways to Create Threads**

**Objective**: Learn how to create threads by extending the `Thread` class and by implementing the `Runnable` interface.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Implement two threads: one by extending `Thread` and another by implementing `Runnable`.
4.  **Step 4**: Start both threads from the `main` method.

**Expected Output**:

- Both threads should run concurrently and display a message multiple times.

---

### **Exercise 2: Manually Start Threads to Parallel Sum a List of Numbers**

**Objective**: Implement manual multithreading to parallel sum a list of numbers.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Divide a list of numbers into multiple parts, and assign each part to a separate thread for summing.
4.  **Step 4**: Collect the partial sums and compute the total sum in the main thread.

**Expected Behavior**:

- Each thread should sum a portion of the list and return the result.
- The total sum should match the expected value when all partial sums are combined.

---

### **Exercise 3: Parallel Sum a List of Numbers Using Java 17 Built-in Parallelization Tools**

**Objective**: Perform parallel summing using Java 17's `Stream` API and `parallelStream()`.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Use Java’s `Stream` API and `parallelStream()` to sum a list of numbers in parallel.
4.  **Step 4**: Compare the performance and simplicity of this approach with manually managing threads.

**Expected Output**:

- The list should be summed in parallel, and the total sum should be computed efficiently.

---

### **Exercise 4: Demonstrating Atomic Operations Using `synchronized`**

**Objective**: Demonstrate atomic operations using the `synchronized` keyword to avoid data race conditions.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Create a shared counter and increment it from multiple threads simultaneously.
4.  **Step 4**: Use the `synchronized` keyword to ensure atomicity of operations.

**Expected Behavior**:

- Without synchronization, the counter value may be incorrect due to race conditions.
- With synchronization, the counter value should be correct after all threads finish.

---

### **Exercise 5: Demonstrating Virtual Threads (Java 17 Preview Feature)**

**Objective**: Explore Java 17's virtual threads to handle a large number of lightweight threads efficiently.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Create a large number of virtual threads using `Thread.ofVirtual().start()`.
4.  **Step 4**: Each virtual thread should perform a simple task, such as printing a message.
5.  **Step 5**: Compare the performance and resource usage of virtual threads with traditional threads.

**Expected Output**:

- Virtual threads should handle a large number of tasks efficiently, with lower overhead compared to traditional threads.

---

### **Exercise 6: Revisited – Manually Start Threads to Parallel Sum a List of Numbers Using Competing Threads**

**Objective**: Extend the manual multithreading exercise to create competing threads that concurrently consume numbers from a shared list while summing.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Create a shared list of numbers that will be consumed by multiple threads.
4.  **Step 4**: Each thread should concurrently retrieve numbers from the list and sum them up.
5.  **Step 5**: Use proper synchronization to manage concurrent access to the shared list.

**Expected Behavior**:

- The threads should consume numbers from the list concurrently and avoid conflicts by using proper synchronization.
- The total sum should match the expected value when all threads finish consuming numbers.

---

**Done :-)**

If you have completed all the exercises successfully, please raise your hand, so the team will see your status, or share your code with the instructor for review.

---

### **Solutions**

---

#### **Exercise 1 Solution**

```Java
public class App {

    // Thread creation by extending Thread class
    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread from MyThread: " + i);
            }
        }
    }

    // Thread creation by implementing Runnable interface
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread from MyRunnable: " + i);
            }
        }
    }

    public static void main(String[] args) {
        // Creating and starting a thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Creating and starting a thread by implementing Runnable
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}

```

**Expected Output**:

```
Thread from MyThread: 0
Thread from MyThread: 1
Thread from MyRunnable: 0
Thread from MyRunnable: 1
Thread from MyThread: 2
Thread from MyRunnable: 2
...

```

---

#### **Exercise 2 Solution**

```Java
import java.util.Arrays;

public class App {

    static class SumTask extends Thread {
        private int[] numbers;
        private int start, end;
        private int partialSum = 0;

        public SumTask(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                partialSum += numbers[i];
            }
        }

        public int getPartialSum() {
            return partialSum;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[1000];
        Arrays.setAll(numbers, i -> i + 1); // Filling array with numbers 1 to 1000

        int numThreads = 4;
        SumTask[] tasks = new SumTask[numThreads];
        int chunkSize = numbers.length / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? numbers.length : start + chunkSize;
            tasks[i] = new SumTask(numbers, start, end);
            tasks[i].start();
        }

        int totalSum = 0;
        for (SumTask task : tasks) {
            task.join(); // Wait for all threads to complete
            totalSum += task.getPartialSum();
        }

        System.out.println("Total sum: " + totalSum); // Expected output: 500500
    }
}

```

---

#### **Exercise 3 Solution**

```Java
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(new Integer[1000]);
        Arrays.setAll(numbers.toArray(), i -> i + 1); // Filling list with numbers 1 to 1000

        int totalSum = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("Total sum: " + totalSum); // Expected output: 500500
    }
}

```

---

#### **Exercise 4 Solution**

```Java
public class App {

    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class IncrementTask extends Thread {
        private Counter counter;

        public IncrementTask(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int numThreads = 5;
        IncrementTask[] tasks = new IncrementTask[numThreads];

        for (int i = 0; i < numThreads; i++) {
            tasks[i] = new IncrementTask(counter);
            tasks[i].start();
        }

        for (IncrementTask task : tasks) {
            task.join();
        }
        System.out.println("Final counter value: " + counter.getCount()); // Expected output: 5000
    }
}

```

**Expected Output**:

```
Final counter value: 5000

```

**Discussion**: In this solution, the `Counter` class uses the `synchronized` keyword to ensure that incrementing the count is atomic. Without synchronization, multiple threads could interfere with each other, causing race conditions and incorrect results.

**Takeaway**: Use `synchronized` to ensure atomic operations when multiple threads access shared data, especially when performing read-modify-write actions.

---

#### **Exercise 5 Solution**

```Java
public class App {

    public static void main(String[] args) {
        // Create and start 10,000 virtual threads
        for (int i = 0; i < 10000; i++) {
            Thread.ofVirtual().start(() -> {
                System.out.println("Virtual thread ID: " + Thread.currentThread().getId());
            });
        }
    }
}

```

**Expected Output**:

```
Virtual thread ID: <ID>
Virtual thread ID: <ID>
...

```

**Discussion**: Virtual threads in Java 17 (a preview feature) allow for the creation of lightweight threads, which can significantly improve scalability and performance. Unlike platform threads, virtual threads are cheap to create and manage, making them suitable for handling a large number of tasks.

**Takeaway**: Virtual threads are a powerful feature in Java 17 that allows developers to efficiently handle large numbers of threads with low overhead.

---

#### **Exercise 6 Solution: Revisited – Manually Start Threads to Parallel Sum a List of Numbers Using Competing Threads**

```Java
import java.util.LinkedList;
import java.util.Queue;

public class App {

    static class SumTask extends Thread {
        private Queue<Integer> numbersQueue;
        private int partialSum = 0;

        public SumTask(Queue<Integer> numbersQueue) {
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

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> numbersQueue = new LinkedList<>();
        for (int i = 1; i <= 1000; i++) {
            numbersQueue.add(i); // Filling the queue with numbers 1 to 1000
        }

        int numThreads = 4;
        SumTask[] tasks = new SumTask[numThreads];

        // Start threads that will compete for consuming numbers from the queue
        for (int i = 0; i < numThreads; i++) {
            tasks[i] = new SumTask(numbersQueue);
            tasks[i].start();
        }

        int totalSum = 0;
        for (SumTask task : tasks) {
            task.join(); // Wait for all threads to finish
            totalSum += task.getPartialSum();
        }

        System.out.println("Total sum: " + totalSum); // Expected output: 500500
    }
}

```

**Expected Output**:

```
Total sum: 500500

```

**Discussion**: In this solution, threads are competing to consume numbers from a shared queue. We use synchronization to ensure that only one thread can retrieve and remove a number from the queue at a time, preventing data race conditions.

**Takeaway**: When multiple threads share resources and need to access them concurrently, synchronization is essential to ensure correct behavior and avoid race conditions. Properly managing the consumption of shared data leads to efficient parallelization.
