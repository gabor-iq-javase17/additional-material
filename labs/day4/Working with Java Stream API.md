### **Hands-On Lab: Working with Java Stream API**

#### **Objective:**

In this lab, you will explore the Java Stream API by performing various operations such as sorting, filtering, mapping, and combining operations. You will create several exercises to demonstrate the use of intermediate and terminal operations in streams. The goal is to understand the difference between intermediate and terminal operations and to become familiar with practical stream usage.

---

### **Lab Requirements:**

- **Language**: Java
- **Tools**: Maven, Java 17, IDE (e.g., IntelliJ, Eclipse, VS Code)
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming, and Maven.

---

### **Lab Setup:**

#### **Step 1: Create Maven Projects**

For each exercise, create a new Maven project:

1.  Open your IDE.
2.  Create a new Maven project for each exercise.
3.  Configure the project to use **Java 17**.
4.  Add dependencies if needed (though the exercises only rely on core Java).

Repeat the steps for all eight exercises below.

---

### **Understanding Stream Operations**

- **Intermediate Operations**: These are operations that transform a stream into another stream. They are **lazy**, meaning they do not execute until a terminal operation is applied. Common intermediate operations include `filter()`, `map()`, and `sorted()`.
- **Terminal Operations**: These operations mark the end of the stream processing and trigger the evaluation of the intermediate operations. Terminal operations include `collect()`, `forEach()`, and `toArray()`.

---

### **Part 1: Sorting with Streams**

#### **Exercise 1: Sorting a List of Integers in Ascending Order**

1.  **Objective**: Create a stream to sort a list of integers in ascending order.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<Integer>` with random values.
    - Use the Stream API to sort the list in ascending order.
    - Collect the result into a `List<Integer>` and print it.

3.  **Expected Output**:

    - The list of integers printed in ascending order.

#### **Exercise 2: Sorting a List of Strings in Descending Order**

1.  **Objective**: Create a stream to sort a list of strings in descending order.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<String>` with some random words.
    - Use the Stream API to sort the list in descending order.
    - Collect the result into a `List<String>` and print it.

3.  **Expected Output**:

    - The list of strings printed in descending order.

---

### **Part 2: Filtering with Streams**

#### **Exercise 3: Filtering Even Numbers from a List**

1.  **Objective**: Create a stream to filter out even numbers from a list of integers.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<Integer>` with random values.
    - Use the Stream API to filter out only the even numbers.
    - Collect the result into an array of Interger-s and print it using a `for` loop. (foreach)

3.  **Expected Output**:

    - A list of even numbers printed.

#### **Exercise 4: Filtering Strings Starting with a Specific Letter**

1.  **Objective**: Create a stream to filter a list of strings, retaining only those that start with a specific letter.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<String>` with some words.
    - Use the Stream API to filter words starting with a specific letter (e.g., "A").
    - Collect the result into a `List<String>` and print it.

3.  **Expected Output**:

    - A list of strings starting with the specified letter.

---

### **Part 3: Mapping with Streams**

#### **Exercise 5: Mapping Integers to Their Squares**

1.  **Objective**: Create a stream to map a list of integers to their square values.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<Integer>` with random values.
    - Use the Stream API to map each integer to its square.
    - Collect the result into a `List<Integer>` and print it.

3.  **Expected Output**:

    - A list of squared integers printed.

#### **Exercise 6: Mapping Strings to Their Lengths**

1.  **Objective**: Create a stream to map a list of strings to their lengths.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<String>` with some words.
    - Use the Stream API to map each string to its length.
    - Collect the result into a `List<Integer>` and print it.

3.  **Expected Output**:

    - A list of string lengths printed.

---

### **Part 4: Using forEach**

#### **Exercise 7: Printing Elements Using forEach**

1.  **Objective**: Use `forEach` to print all elements of a list.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<String>` with some words.
    - Use the Stream API with `forEach` to print each element.
    - No need to collect the result, just directly print each element using `forEach`.

3.  **Expected Output**:

    - Each string element printed on a new line.

---

### **Part 5: Combining Operations**

#### **Exercise 8: Combining Mapping, Filtering, and Sorting Operations**

1.  **Objective**: Create a stream to perform multiple operations: filter, map, and sort.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<String>` with some random words.
    - Use the Stream API to:
      - Filter words with length greater than 3.
      - Map the words to uppercase.
      - Sort the words in ascending order.
    - Collect the result into a `List<String>` and print it.

3.  **Expected Output**:

    - A list of filtered, mapped, and sorted words printed.

---

**Done :-)**

If you have completed all the exercises successfully, please raise your hand, so the team will see your status, or share your code with the instructor for review.

---

### **Solutions**

#### **Solution for Exercise 1: Sorting a List of Integers in Ascending Order**

```java
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 4);

        // you can use just .toList() instead of .collect(Collectors.toList()) in Java 16+
        List<Integer> sortedNumbers = numbers.stream()
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Sorted numbers: " + sortedNumbers);
    }
}

```

#### **Solution for Exercise 2: Sorting a List of Strings in Descending Order**

```java

import java.util.\*;
import java.util.stream.Collectors;

public class App {
public static void main(String[] args) {
List<String> words = Arrays.asList("banana", "apple", "pear", "grape");

        // you can use just .toList() instead of .collect(Collectors.toList()) in Java 16+
        List<String> sortedWords = words.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        System.out.println("Sorted words in descending order: " + sortedWords);
    }

}

```

#### **Solution for Exercise 3: Filtering Even Numbers from a List**

```java

import java.util.\*;
import java.util.stream.Collectors;

public class App {
public static void main(String[] args) {
List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 4, 8, 12);

        // you can use just .toArray() instead of .collect(Collectors.toArray()) in Java 16+
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toArray());

        for (int num : evenNumbers) {
            System.out.println(num);
        }
    }

}
```

#### **Solution for Exercise 4: Filtering Strings Starting with a Specific Letter**

```java
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "grape", "avocado");

        // you can use just .toList() instead of .collect(Collectors.toList()) in Java 16+
        List<String> filteredWords = words.stream()
            .filter(w -> w.startsWith("a"))
            .collect(Collectors.toList());

        System.out.println("Words starting with 'a': " + filteredWords);
    }
}

```

#### **Solution for Exercise 5: Mapping Integers to Their Squares**

```java
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // you can use just .toList() instead of .collect(Collectors.toList()) in Java 16+
        List<Integer> squares = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());

        System.out.println("Squares: " + squares);
    }
}

```

#### **Solution for Exercise 6: Mapping Strings to Their Lengths**

```java
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "pear");

        // you can use just .toList() instead of .collect(Collectors.toList()) in Java 16+
        List<Integer> lengths = words.stream()
            .map(String::length)
            .collect(Collectors.toList());

        System.out.println("Word lengths: " + lengths);
    }
}

```

#### **Solution for Exercise 7: Printing Elements Using forEach**

```java
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "pear");

        words.stream().forEach(System.out::println);
    }
}

```

#### **Solution for Exercise 8: Combining Mapping, Filtering, and Sorting Operations**

```java
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "pear", "avocado");

        // you can use just .toList() instead of .collect(Collectors.toList()) in Java 16+
        List<String> result = words.stream()
            .filter(w -> w.length() > 3)
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Filtered, mapped, and sorted words: " + result);
    }
}

```
