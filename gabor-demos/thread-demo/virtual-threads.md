Java Virtual Threads, introduced in JDK 19 as a preview feature and officially released in JDK 21, are part of Project Loom. They aim to simplify concurrency in Java by providing lightweight threads that are easy to create and manage, unlike traditional Java threads. Virtual threads decouple the concept of a thread from an OS thread, making it possible to create and use millions of them without overwhelming the system.

### What are Virtual Threads?

- **Virtual Threads** are lightweight threads managed by the JVM rather than the operating system.
- They are designed to minimize the overhead associated with traditional threads, allowing the creation of thousands or millions of concurrent threads.
- Virtual threads are ideal for I/O-bound tasks such as handling many concurrent network requests, where threads spend most of their time waiting.

### Why are those useful?:

1.  **Scalability**: Since virtual threads are lightweight, applications can scale more efficiently, making it easier to handle a large number of concurrent tasks.
2.  **Simplified Concurrency**: Virtual threads provide a familiar programming model with the standard `Thread` API, allowing developers to write code using traditional synchronization and threading techniques.
3.  **Improved Resource Management**: Virtual threads do not map directly to OS threads, reducing context-switching overhead and memory consumption.

### Example of Virtual Threads

```
public class VirtualThreadsExample {
    public static void main(String[] args) {
        // Create a virtual thread and start it
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from a virtual thread! " + Thread.currentThread());
        });

        // Wait for the virtual thread to complete
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create and run multiple virtual threads
        for (int i = 1; i <= 10; i++) {
            Thread.ofVirtual().start(() -> {
                System.out.println("Virtual Thread ID: " + Thread.currentThread().threadId());
            });
        }

        System.out.println("All virtual threads have been started.");
    }
}

```

### What to understand from the code:

1.  **Creating a Virtual Thread**:

    ```
    Thread virtualThread = Thread.ofVirtual().start(() -> {
        System.out.println("Hello from a virtual thread! " + Thread.currentThread());
    });

    ```

    Here, `Thread.ofVirtual().start()` creates and starts a new virtual thread. The code inside the lambda will be executed by this thread.

2.  **Waiting for Virtual Thread Completion**: The `join()` method is used to wait for the virtual thread to finish its execution, just like traditional threads.
3.  **Running Multiple Virtual Threads**: The example starts 10 virtual threads in a loop. Each virtual thread prints its ID, demonstrating how lightweight and easy it is to create multiple virtual threads.

### Virtual Threads with Executors

Java provides an enhanced `ExecutorService` that supports virtual threads. This can be used to manage virtual threads more effectively:

```
import java.util.concurrent.Executors;

public class VirtualThreadExecutorExample {
    public static void main(String[] args) throws InterruptedException {
        // Create an ExecutorService with a virtual thread per task executor
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 1; i <= 1000; i++) {
                final int taskNumber = i;
                executor.submit(() -> {
                    System.out.println("Task " + taskNumber + " executed by " + Thread.currentThread());
                });
            }
        } // The executor is automatically closed at the end of the try-with-resources block
    }
}

```

### What to understand from the code above:

1.  **Virtual Thread Executor**: The code uses `Executors.newVirtualThreadPerTaskExecutor()` to create an executor that creates a new virtual thread for each task submitted to it.
2.  **Submitting Tasks**: Tasks are submitted to the executor using the `submit()` method. Each task runs in its own virtual thread.
3.  **Automatic Resource Management**: The executor is closed automatically at the end of the `try-with-resources` block.

### Internals

Virtual threads are implemented using _continuations_, a concept that allows suspending and resuming computations. This means that when a virtual thread is blocked (e.g., waiting for I/O), the underlying OS thread can be freed to perform other tasks, and the virtual thread's state is saved. Once the operation completes, the virtual thread can be resumed on any available OS thread.

### Use Cases of Virtual Threads

1.  **High-Concurrency Web Servers**: Handling many simultaneous connections without the need for complex thread pool management.
2.  **Parallel Data Processing**: Running millions of concurrent tasks that do not overwhelm system resources.
3.  **Event-Driven Systems**: Using virtual threads as an alternative to asynchronous programming models like CompletableFutures.

### Considerations:

- Virtual threads are not meant to replace traditional OS threads for CPU-bound tasks, as context switching between OS threads can still be expensive.
- They are more suited for I/O-bound tasks where threads spend time waiting.

Virtual threads simplify concurrency in Java, providing a more efficient and scalable model without introducing new concepts or changing the existing threading APIs.
