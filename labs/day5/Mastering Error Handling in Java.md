### Java SE 17 Hands-on Lab: Mastering Error Handling in Java

#### **Objective:**

In this lab, you will explore essential concepts of error handling in Java SE 17. You will create a new Maven project for each exercise, ensuring clean isolation of concepts. You will learn how to throw, catch, and rethrow exceptions, define custom exceptions, and manage resources using both try-finally and try-with-resources.

Each exercise includes the **expected output** or **behavior**, and the solutions provide exact expected output to facilitate better understanding and validation. After completing the exercises, review the discussion and takeaway for each.

---

### **Lab Requirements:**

- **Language**: Java
- **Tools**: Maven, Java 17, IDE (e.g., IntelliJ, Eclipse, VS Code)
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming, Error Handling and Maven.

---

### **Exercise 1: Throwing Exceptions**

**Objective**: Understand how to throw exceptions to handle invalid conditions.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Implement a method `divide(int numerator, int denominator)` that throws an `IllegalArgumentException` when the denominator is zero.
4.  **Step 4**: In the `main` method, call `divide` with both valid and invalid inputs.
5.  **Step 5**: Handle the exception in the `main` method and print a user-friendly error message.

**Expected Output**:

- When the denominator is non-zero: print the result of the division.
- When the denominator is zero: print an error message.

---

### **Exercise 2: Catching Exceptions**

**Objective**: Practice catching exceptions with a `try-catch` block.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Add a method `readFile(String filePath)` that opens a file using `FileReader`.
4.  **Step 4**: Catch and handle `FileNotFoundException` and `IOException`.
5.  **Step 5**: Display appropriate error messages when exceptions occur.

**Expected Behavior**:

- If the file exists, print a message indicating success.
- If the file is not found, print an error message.
- Handle any I/O exceptions gracefully.

---

### **Exercise 3: Catching Multiple Exception Types**

**Objective**: Learn how to catch multiple exceptions in one `try` statement.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Write a method `processData(String input)` that handles both `NumberFormatException` and `ArithmeticException`.
4.  **Step 4**: Catch both exceptions in a single `catch` block and handle them.

**Expected Output**:

- If the input is not a valid number, print an error message.
- If an arithmetic error occurs (e.g., division by zero), print an appropriate error message.

---

### **Exercise 4: Rethrowing Exceptions**

**Objective**: Understand rethrowing exceptions to propagate them up the call stack.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Implement a method `validateInput(String input)` that throws exceptions for invalid inputs.
4.  **Step 4**: Implement `processInput(String input)`, which catches and rethrows exceptions from `validateInput`.
5.  **Step 5**: Catch the exception in the `main` method and handle it.

**Expected Behavior**:

- If the input is null or empty, print an error message, then rethrow the exception for top-level handling.

---

### **Exercise 5: Creating a Custom Exception**

**Objective**: Learn how to create and use a custom exception type.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a custom exception `InvalidUserInputException`.
3.  **Step 3**: Implement `validateUsername(String username)` in `App`, which throws the custom exception if the username contains special characters.
4.  **Step 4**: Handle the custom exception in the `main` method.

**Expected Output**:

- If the username is invalid, throw and catch `InvalidUserInputException` and print the error message.

---

### **Exercise 6: Using try-finally with Unmanaged Resources**

**Objective**: Understand using `try-finally` to manage resources that are not automatically closed.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Simulate opening and closing an unmanaged resource with methods `openResource()` and `closeResource()`.
4.  **Step 4**: Use `try-finally` to ensure the resource is closed, even when an exception occurs.

**Expected Behavior**:

- The resource should always be closed, even if an exception is thrown in the `try` block.

---

### **Exercise 7: Using try-with-resources with AutoCloseable**

**Objective**: Learn how to use `try-with-resources` with a type that implements `AutoCloseable`.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `AutoCloseableResource` that implements `AutoCloseable`.
3.  **Step 3**: Use `try-with-resources` to automatically manage the resource lifecycle.
4.  **Step 4**: Demonstrate that `close()` is called even if an exception occurs in the `try` block.

**Expected Output**:

- The resource should be automatically closed, even if an exception is thrown.

### **Exercise 8: Using `throws` Keyword with Checked Exceptions**

**Objective**: Learn how to declare checked exceptions using the `throws` keyword and understand the difference between checked and unchecked exceptions.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Implement a method `readFile(String filePath)` that throws a `FileNotFoundException`, which is a checked exception.
4.  **Step 4**: In the `main` method, call `readFile` and handle the `FileNotFoundException` using a `try-catch` block.
5.  **Step 5**: Add another method `processFile(String filePath)` that calls `readFile` and declares that it also throws `FileNotFoundException` without catching it. Call `processFile` from the `main` method and handle the exception.

**Expected Output**:

- If the file exists, print a message indicating that the file was successfully opened.
- If the file is not found, the exception should be caught and an error message displayed.

---

#### **Explanation: What Are Checked Exceptions?**

In Java, **exceptions** are divided into two main categories:

- **Checked Exceptions**: These are exceptions that are checked at compile-time. The Java compiler forces you to handle or declare them using the `throws` keyword. Examples of checked exceptions include `IOException`, `FileNotFoundException`, and `SQLException`. Checked exceptions typically represent external issues (like file or network problems) that are out of the program’s control.
- **Unchecked Exceptions**: These are exceptions that are not checked at compile-time and extend `RuntimeException`. Examples include `NullPointerException` and `ArrayIndexOutOfBoundsException`. Unchecked exceptions are usually caused by bugs in the code itself, such as invalid object references or incorrect array indexing.

Checked exceptions must either be caught in a `try-catch` block or declared in the method signature using the `throws` keyword.

---

**Done :-)**

If you have completed all the exercises successfully, please raise your hand, so the team will see your status, or share your code with the instructor for review.

---

### **Solutions**

---

#### **Exercise 1 Solution**

```Java
public class App {
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 2)); // Expected output: 5
            System.out.println(divide(10, 0)); // Expected exception: IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage()); // Expected output: Error: Denominator cannot be zero.
        }
    }
}

```

**Discussion**: Throwing exceptions is useful when method parameters violate assumptions or constraints. In this case, division by zero is invalid, so we throw an `IllegalArgumentException`.

**Takeaway**: Throwing exceptions ensures invalid inputs are handled early, preventing incorrect calculations.

---

#### **Exercise 2 Solution**

```Java
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void readFile(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage()); // Expected if file not found
        } catch (IOException e) {
            System.err.println("IO error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readFile("example.txt"); // Expected: File opened successfully or File not found error
    }
}

```

**Discussion**: Catching exceptions ensures the program can handle errors gracefully, especially when dealing with file operations.

**Takeaway**: Use `try-catch` to handle exceptions locally and provide meaningful feedback to the user.

---

#### **Exercise 3 Solution**

```Java
public class App {
    public static void processData(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println(100 / number); // Expected output or division by zero error
        } catch (NumberFormatException | ArithmeticException e) {
            System.err.println("Error: " + e.getMessage()); // Expected error message
        }
    }

    public static void main(String[] args) {
        processData("a"); // Expected: Error: For input string: "a"
        processData("0"); // Expected: Error: / by zero
    }
}

```

**Discussion**: Java allows multiple exceptions to be caught in a single `catch` block. This reduces code duplication when handling different exceptions similarly.

**Takeaway**: Catching multiple exceptions in one block is useful when the handling logic is the same.

---

#### **Exercise 4 Solution**

```Java
public class App {
    public static void validateInput(String input) {
        if (input == null) {
            throw new NullPointerException("Input cannot be null.");
        } else if (input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty.");
        }
    }

    public static void processInput(String input) throws Exception {
        try {
            validateInput(input);
        } catch (Exception e) {
            System.err.println("Caught exception, rethrowing: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            processInput(null); // Expected output: Error message, then rethrown
        } catch (Exception e) {
            System.err.println("Handled at top level: " + e.getMessage()); // Expected: Handled at top level: Input cannot be null.
        }
    }
}

```

**Discussion**: Rethrowing exceptions allows error handling at higher levels in the call stack.

**Takeaway**: Rethrowing exceptions helps propagate critical errors that should not be handled at lower levels.

---

#### **Exercise 5 Solution**

````Java
public class InvalidUserInputException extends Exception {
    public InvalidUserInputException(String message) {
        super(message);
    }
}

public class App {
    public static void validateUsername(String username) throws InvalidUserInputException {
        if (!username.matches("[a-zA-Z0-9]+")) {
            throw new InvalidUserInputException("Username contains invalid characters.");
        }
    }

    public static void main(String[] args) {
        try {
            validateUsername("invalid_user@"); // Expected: Username contains invalid characters
        } catch (InvalidUserInputException e) {
            System.err.println(e.getMessage()); // Expected output: Username contains invalid characters.
        }
    }
}

```Java

**Discussion**: Custom exceptions allow us to represent specific errors in our domain, making error handling more descriptive.

**Takeaway**: Use custom exceptions to better represent domain-specific error conditions.

---

#### **Exercise 6 Solution**

```Java
public class App {
    public static void openResource() {
        System.out.println("Resource opened.");
    }

    public static void closeResource() {
        System.out.println("Resource closed.");
    }

    public static void main(String[] args) {
        try {
            openResource();
            throw new RuntimeException("Error during processing."); // Expected error
        } finally {
            closeResource(); // Expected output: Resource closed
        }
    }
}

````

**Discussion**: `try-finally` ensures resources are closed or cleaned up, even when exceptions are thrown.

**Takeaway**: Always use `finally` for manual resource cleanup in unmanaged resources.

---

#### **Exercise 7 Solution**

```Java
public class AutoCloseableResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource automatically closed.");
    }
}

public class App {
    public static void main(String[] args) {
        try (AutoCloseableResource resource = new AutoCloseableResource()) {
            System.out.println("Using resource.");
            throw new RuntimeException("Error while using resource."); // Expected error
        } catch (Exception e) {
            System.err.println("Caught: " + e.getMessage());
        }
    }
}

```

**Discussion**: `try-with-resources` simplifies resource management by automatically closing resources that implement `AutoCloseable`.

**Takeaway**: Use `try-with-resources` for cleaner and safer resource management with auto-closing resources.

### **Solution for Exercise 8**

```Java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    // Method that throws the checked exception FileNotFoundException
    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + filePath + " not found.");
        }
        FileReader reader = new FileReader(file);
        System.out.println("File " + filePath + " opened successfully.");
    }

    // Method that also throws FileNotFoundException without catching it
    public static void processFile(String filePath) throws FileNotFoundException {
        readFile(filePath);
    }

    public static void main(String[] args) {
        try {
            processFile("example.txt"); // Example file, adjust based on actual file path.
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage()); // Expected output: Error: File example.txt not found.
        }
    }
}

```

**Expected Output** (when the file does not exist):

```
Error: File example.txt not found.

```

**Expected Output** (when the file exists):

```
File example.txt opened successfully.
```
