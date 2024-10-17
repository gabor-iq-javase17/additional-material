### **Hands-On Lab: Undestranding Lamdas via Implementing a Reusable Sort Using a Functional Interface Parameter**

#### **Objective:**

In this lab, you will create a universally reusable `sequentialSort` method that accepts a functional interface called `MyComparator<T>`. You will implement different sorting strategies using named classes, anonymous classes, and lambda expressions, to understand how each approach works. The goal is to illustrate that lambda expressions are a concise way to create anonymous implementations of functional interfaces.

---

### **Lab Requirements:**

- **Language**: Java
- **Time**: 1 hour
- **Prerequisites**: Basic understanding of Java, object-oriented programming, and lambda expressions.

### Hint:

- If you need guidance, please check the `lambda-demo` project in gabor-demos folder in this repository.

---

### **Lab Setup:**

#### **Step 1: Create a New Java Project**

1.  Open your preferred IDE (e.g., IntelliJ, Eclipse, VS Code).
2.  Create a new Java project.
3.  Configure the project to use **Java 17**.
4.  Ensure your IDE recognizes the project and is ready to compile and run Java programs.

---

#### **Step 2: Create the Package and Classes**

1.  **Create the Package**:

    - Inside the `src/main/java` folder, create a new package called `com.example`.

2.  **Create the Java Classes**:

    - In the `com.example` package, create the following classes:
      - `App.java`: Contains the `main` method.
      - `Customer.java`: A class representing a simple customer object.
      - `MyComparator.java`: A functional interface for comparing two objects.
      - `Sorter.java`: Contains the `sequentialSort` method.
      - `CustomerByNameComparator.java`: A named implementation of the `MyComparator<Customer>` interface that sorts by name.
      - `CustomerByWeightComparator.java`: A named implementation of the `MyComparator<Customer>` interface that sorts by weight.

---

#### **Step 3: Define the `MyComparator` Functional Interface**

1.  **Task**: Create a generic `MyComparator<T>` interface with a single method:

    - `int compare(T o1, T o2)`: This method should compare two objects of type `T` and return:
      - A negative number if `o1` is less than `o2`.
      - Zero if `o1` is equal to `o2`.
      - A positive number if `o1` is greater than `o2`.

2.  **Deliverable**: Ensure the `MyComparator` interface can work with any type `T` using Java generics and adheres to the rules of functional interfaces (a single abstract method).

---

#### **Step 4: Implement the `Customer` Class**

1.  **Task**: Implement the `Customer` class with the following attributes and methods:

    - **Attributes**:
      - `String name`: The name of the customer.
      - `double weight`: The weight of the customer.
    - **Methods**:
      - Constructor to initialize the `name` and `weight` attributes.
      - `getName()`: Returns the name of the customer.
      - `getWeight()`: Returns the weight of the customer.
      - `toString()`: Returns a string representation of the customer.

2.  **Deliverable**: A `Customer` class that can store customer information and provides meaningful string representation.

---

#### **Step 5: Implement the `Sorter` Class with `sequentialSort` Method**

1.  **Task**: Implement the `sequentialSort` method in the `Sorter` class.

    - Method signature: `public static <T> void sequentialSort(List<T> list, MyComparator<T> comparator)`
    - Use the `comparator` to sort the `list` in ascending order.
    - Traverse the list and apply the sorting logic using the `compare` method of `MyComparator`.
    - if you are unsure, you can use the following pseudocode as a reference:

    ```
    FUNCTION sequentialSort(list, comparator):
        FOR i FROM 0 TO length of list - 1:
            minIndex = i

            // Find the minimum element in the unsorted portion of the list
            FOR j FROM i + 1 TO length of list:
                IF comparator.compare(list[j], list[minIndex]) < 0:
                    minIndex = j
                END IF
            END FOR

            // Perform the three assignments to swap list[i] with list[minIndex]
            IF minIndex != i:
                temp = list[i]
                list[i] = list[minIndex]
                list[minIndex] = temp
            END IF
        END FOR
    END FUNCTION
    ```

    if you found sequentialSort algorithm boring, try to implement quicksort which is a recursive algorithm, here is the pseudocode for your reference:

    ```
    FUNCTION quickSort(list, comparator):
        IF length of list <= 1:
            RETURN list
        END IF

        pivot = list[0]
        less = []
        equal = []
        greater = []

        FOREACH element IN list:
            comparison = comparator.compare(element, pivot)
            IF comparison < 0:
                less.add(element)
            ELSE IF comparison == 0:
                equal.add(element)
            ELSE:
                greater.add(element)
            END IF
        END FOR

        RETURN quickSort(less, comparator) + equal + quickSort(greater, comparator)
    END FUNCTION
    ```

2.  **Deliverable**: A fully functional `sequentialSort` method that can work with any type `T` and sort elements using a `MyComparator` implementation.

---

### **Phase 1: Using Named Implementations**

1.  **Task**: Create a `CustomerByNameComparator` class that implements `MyComparator<Customer>`.

    - Implement the `compare` method to sort customers alphabetically by their name.

2.  **Task**: Create a `CustomerByWeightComparator` class that implements `MyComparator<Customer>`.

    - Implement the `compare` method to sort customers by their weight in ascending order.

3.  **Experiment**: Write a simple `App` program that creates a list of `Customer` objects and sorts them using `sequentialSort` with `CustomerByNameComparator` and `CustomerByWeightComparator`.
4.  **Deliverable**: The output should show the list sorted by name first, then by weight.

---

### **Phase 2: Using Anonymous Classes**

1.  **Task**: Modify the `App` program to use **anonymous classes** instead of the named classes for the comparators.

    - Use an anonymous class to implement `MyComparator<Customer>` for sorting by name.
    - Use another anonymous class for sorting by weight.

2.  **Deliverable**: The output should be identical to the output in Phase 1, showing the list sorted by name first, then by weight.

---

### **Phase 3: Using Lambda Expressions**

1.  **Task**: Modify the `App` program to use **lambda expressions** instead of anonymous classes for the comparators.

    - Use a lambda expression to sort the customers by name.
    - Use another lambda expression to sort the customers by weight.

2.  **Deliverable**: The output should be identical to the output in Phases 1 and 2, demonstrating that lambda expressions are a concise way to implement anonymous classes.

---

### **Discussion: Named Implementations vs. Anonymous Classes vs. Lambda Expressions**

1.  **Named Implementation**:

    - Clear structure and readable code.
    - Suitable when you need to reuse the comparator in multiple places.

2.  **Anonymous Classes**:

    - Useful for one-off implementations.
    - Avoids the need to create a separate class.

3.  **Lambda Expressions**:

    - Shortest and most concise.
    - Ideal for functional interfaces when the implementation is simple.

**Summary**: Lambdas are essentially short forms of anonymous classes that implement a functional interface.

---

### **Examples of Lambda Syntax**:

1.  **Verbose Syntax**:

```java
sequentialSort(customers, (Customer c1, Customer c2) -> {
    return c1.getName().compareTo(c2.getName());
});

```

2.  **Omitting the type declarations in parameter list**:

```java
sequentialSort(customers, (c1, c2) -> {
    return c1.getName().compareTo(c2.getName());
});
```

3.  **Using the fact, that the method body is "just returning with and _expression_"**:

```java
sequentialSort(customers, (Customer c1, Customer c2) -> c1.getName().compareTo(c2.getName()));
```

4.  **Shortened Syntax**:

```java
sequentialSort(customers, (c1, c2) -> c1.getName().compareTo(c2.getName()));
```

**Done :-)**

If you have completed all the exercises successfully, please raise your hand, so the team will see your status, or share your code with the instructor for review.
