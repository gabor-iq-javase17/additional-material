### **Hands-On Lab: Working with the Java Collections Framework**

#### **Objective:**

In this lab, you will explore the core components of the Java Collections Framework: `List`, `Map`, and `Set`. You will complete two exercises for each type of collection, gaining hands-on experience with common operations such as adding, removing, sorting, and iterating over elements. Each exercise will be implemented in its own Maven project.

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

Repeat the steps for all six exercises below.

---

### **Part 1: Working with Lists**

#### **Exercise 1: Sorting a List of Strings**

1.  **Objective**: Create a list of strings, sort it in both ascending and descending order, and print the results.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<String>`.
    - Add several string values to the list (e.g., names or words).
    - Use `Collections.sort()` to sort the list in ascending order and print the result.
    - Then sort the list in descending order using a custom comparator and print the result.

3.  **Expected Output**:

    - A list of strings printed in ascending and then descending order.

#### **Exercise 2: Removing Duplicates from a List**

1.  **Objective**: Create a list of integers and remove any duplicate values.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<Integer>`.
    - Add several integer values, including duplicates, to the list.
    - Use a `Set` to remove the duplicates and print the result.

3.  **Expected Output**:

    - A list of integers with duplicates removed.

---

### **Part 2: Working with Maps**

#### **Exercise 3: Counting Word Frequencies Using a Map**

1.  **Objective**: Create a program that counts the frequency of words in a list of strings.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `List<String>` containing a sentence broken into individual words.
    - Use a `Map<String, Integer>` to count how often each word appears in the list.
    - Iterate over the map and print each word along with its frequency.

3.  **Expected Output**:

    - A printed list of words and their frequencies.

#### **Exercise 4: Storing and Retrieving Employee Information**

1.  **Objective**: Store and retrieve employee information using a `Map<Integer, String>` where the key is an employee ID, and the value is the employee’s name.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `Map<Integer, String>`.
    - Add several employee entries to the map (key-value pairs: employee ID and name).
    - Retrieve and print the name of a specific employee using their ID.
    - Print all the employee names stored in the map.

3.  **Expected Output**:

    - The name of a specific employee and a printed list of all employee names.

---

### **Part 3: Working with Sets**

#### **Exercise 5: Checking for Unique Elements in a Set**

1.  **Objective**: Create a `Set<String>` to demonstrate that sets do not allow duplicate elements.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create a `Set<String>`.
    - Add several string values to the set, including some duplicates.
    - Print the set and observe that duplicate values are not included.

3.  **Expected Output**:

    - A printed set with no duplicate elements.

#### **Exercise 6: Finding the Union and Intersection of Two Sets**

1.  **Objective**: Create two `Set<Integer>` objects, find their union and intersection, and print the results.
2.  **Instructions**:

    - Create a new Maven project for this exercise.
    - In the `main` method, create two `Set<Integer>` objects.
    - Add different sets of integer values to both sets.
    - Use the `addAll()` method to find the union of the two sets and print the result.
    - Use the `retainAll()` method to find the intersection of the two sets and print the result.

3.  **Expected Output**:

    - The union and intersection of the two sets.

---

### **Solutions**

#### **Solution for Exercise 1: Sorting a List of Strings**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));

        // Sort in ascending order
        Collections.sort(names);
        System.out.println("Ascending order: " + names);
        // or
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Ascending order: " + names);


        // Sort in descending order
        names.sort(Comparator.reverseOrder());
        System.out.println("Descending order: " + names);
        // or
        names.sort((s1, s2) -> s2.compareTo(s1)); // this is the same as -1 * s1.compareTo(s2)
        System.out.println("Descending order: " + names);
    }
}

```

#### **Solution for Exercise 2: Removing Duplicates from a List**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        // Remove duplicates using a Set
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("List without duplicates: " + uniqueNumbers);
    }
}

```

#### **Solution for Exercise 3: Counting Word Frequencies Using a Map**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}

```

#### **Solution for Exercise 4: Storing and Retrieving Employee Information**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        // Retrieve and print a specific employee
        System.out.println("Employee with ID 102: " + employees.get(102));

        // Print all employee names
        System.out.println("All employees: " + employees.values());
    }
}

```

#### **Solution for Exercise 5: Checking for Unique Elements in a Set**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>();
        items.add("apple");
        items.add("banana");
        items.add("apple");  // Duplicate entry

        System.out.println("Set contents: " + items);
    }
}

```

#### **Solution for Exercise 6: Finding the Union and Intersection of Two Sets**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // Union of the two sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection of the two sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
    }
}
```
