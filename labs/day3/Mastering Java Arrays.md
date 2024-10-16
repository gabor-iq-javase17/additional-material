### **Hands-On Lab: Mastering Java Arrays**

#### **Objective:**

In this lab, you will explore and practice working with arrays in Java. You will go through several exercises that demonstrate how to create, manipulate, and resize arrays. Additionally, you'll understand the difference between primitive and object arrays, learn about autoboxing and unboxing, and work with two-dimensional arrays.

---

### **Lab Requirements:**

- **Language**: Java
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java and arrays.

---

### **Lab Setup:**

#### **Step 1: Create a New Java Project**

1.  Open your preferred IDE (e.g., IntelliJ, Eclipse, VS Code).
2.  Create a new Java project.
3.  Configure the project to use **Java 17**.
4.  Ensure your IDE recognizes the project and is ready to compile and run Java programs.

---

### **Exercise 1: Creating a Simple `int` Array**

#### **Objective:**

Learn how to create, initialize, and manipulate a simple array of primitive integers (`int`).

#### **Task Steps**:

1.  **Create an array**: Create an array of type `int` with 5 elements.
2.  **Initialize the array**: Populate the array with values (e.g., 10, 20, 30, 40, 50).
3.  **Access array elements**: Use a loop to print each element of the array.
4.  **Modify an element**: Change one of the values in the array (e.g., update the value at index 2).
5.  **Print the modified array**: Use a loop again to print the modified array.

#### **Solution**:

```java
public class App {
    public static void main(String[] args) {
        // Step 1: Create an int array of size 5
        int[] numbers = new int[5];

        // Step 2: Initialize the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Step 3: Print the original array
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Step 4: Modify the array (change value at index 2)
        numbers[2] = 99;

        // Step 5: Print the modified array
        System.out.println("\nModified array:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

```

---

### **Exercise 2: Working with `Integer` Arrays and Autoboxing**

#### **Objective:**

Understand the difference between primitive arrays (`int[]`) and object arrays (`Integer[]`). Explore the concept of **autoboxing** and **unboxing** when using wrapper classes in arrays.

#### **Task Steps**:

1.  **Create an `Integer` array**: Create an array of type `Integer` with 5 elements.
2.  **Initialize the array**: Populate the array with values (e.g., 1, 2, 3, 4, 5). Use **autoboxing** by assigning primitive `int` values to the `Integer` array.
3.  **Access elements with unboxing**: Use a loop to print each element. Notice how the wrapper class `Integer` automatically converts to primitive `int` (this is unboxing).
4.  **Modify an element**: Change one of the values in the array using autoboxing (e.g., `array[1] = 10;`).
5.  **Discuss autoboxing and unboxing**: Reflect on how Java automatically converts between `int` and `Integer` during array operations.

#### **Solution**:

```java
public class App {
    public static void main(String[] args) {
        // Step 1: Create an Integer array of size 5
        Integer[] numbers = new Integer[5];

        // Step 2: Initialize the array (autoboxing)
        numbers[0] = 1; // Autoboxes int to Integer
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Step 3: Access elements with unboxing
        System.out.println("Original Integer array:");
        for (Integer num : numbers) {
            System.out.println(num); // Unboxes Integer to int
        }

        // Step 4: Modify the array (autoboxing)
        numbers[1] = 10; // Autoboxing

        // Step 5: Print the modified array
        System.out.println("\nModified Integer array:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

```

---

### **Exercise 3: Creating a Two-Dimensional Array**

#### **Objective:**

Learn how to create and manipulate a two-dimensional array (matrix) in Java.

#### **Task Steps**:

1.  **Create a 2D array**: Create a 3x3 array of type `int`.
2.  **Initialize the 2D array**: Populate the array with values (e.g., integers 1 through 9).
3.  **Access and print the 2D array**: Use nested loops to print each row of the matrix.
4.  **Modify an element**: Change a value in the array (e.g., set `array[1][2] = 99`).
5.  **Print the modified matrix**: Print the matrix again after modifying the value.

#### **Solution**:

```java
public class App {
    public static void main(String[] args) {
        // Step 1: Create a 3x3 2D array
        int[][] matrix = new int[3][3];

        // Step 2: Initialize the 2D array
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = value++;
            }
        }

        // Step 3: Print the 2D array
        System.out.println("Original 2D array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Step 4: Modify an element (change matrix[1][2] to 99)
        matrix[1][2] = 99;

        // Step 5: Print the modified 2D array
        System.out.println("\nModified 2D array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

```

---

### **Exercise 4: Resizing an Array**

#### **Objective:**

Demonstrate how to "resize" an array in Java by creating a new array with a different size and copying the elements from the original array.

#### **Task Steps**:

1.  **Create an `int` array**: Start with an `int` array of size 5 and populate it with values (e.g., 5, 10, 15, 20, 25).
2.  **Print the original array**: Display the elements of the array.
3.  **Resize the array**:
    - Create a new array with a larger size (e.g., size 10).
    - Copy the original array elements into the new array.
    - Add new elements to the remaining positions of the resized array.
4.  **Print the resized array**: Use a loop to print the new array with both the original and new elements.
5.  **Discuss**: Reflect on how Java arrays have a fixed size and resizing involves creating a new array and copying elements.

#### **Solution**:

```java
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Step 1: Create an int array of size 5
        int[] originalArray = {5, 10, 15, 20, 25};

        // Step 2: Print the original array
        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Step 3: Resize the array
        int[] resizedArray = new int[10]; // New array of size 10
        System.arraycopy(originalArray, 0, resizedArray, 0, originalArray.length); // Copy elements

        // Step 4: Add new elements to the resized array
        resizedArray[5] = 30;
        resizedArray[6] = 35;
        resizedArray[7] = 40;

        // Step 5: Print the resized array
        System.out.println("Resized array: " + Arrays.toString(resizedArray));
    }
}

```

---

### **Exercise 5: Array Operations**

#### **Objective:**

Perform basic array operations, such as finding the maximum value, sum of elements, and reversing the array.

#### **Task Steps**:

1.  **Create an array**: Start with an `int` array of size 5, initialized with values (e.g., 3, 8, 12, 5, 7).
2.  **Find the maximum value**: Write a loop to find and print the maximum value in the array.
3.  **Calculate the sum of elements**: Write a loop to sum all the elements in the array and print the result.
4.  **Reverse the array**:
    - Create a new array of the same size.
    - Copy elements from the original array in reverse order into the new array.
    - Print the reversed array.

#### **Solution**:

```java
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Step 1: Create an array of size 5
        int[] array = {3, 8, 12, 5, 7};

        // Step 2: Find the maximum value
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);

        // Step 3: Calculate the sum of elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // Step 4: Reverse the array
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}

```

---

### **Discussion: Autoboxing and Unboxing**

After completing the exercises, reflect on the following:

1.  **Autoboxing**: Java automatically converts between primitive types (e.g., `int`) and their corresponding wrapper classes (e.g., `Integer`). When you assign a primitive value to an `Integer` array, Java automatically "boxes" the `int` into an `Integer` object.
2.  **Unboxing**: Java automatically converts from wrapper classes to primitive types when necessary. For example, when you access an `Integer` array and use the value in a calculation, Java "unboxes" the `Integer` into an `int`.

---

### **Conclusion:**

In this lab, you have:

- Created and manipulated both primitive and object arrays.
- Explored autoboxing and unboxing using `int` and `Integer` arrays.
- Worked with two-dimensional arrays to understand how matrices are structured.
- Implemented array resizing and basic array operations, such as finding the maximum, summing elements, and reversing an array.

By completing these exercises, you have gained hands-on experience with arrays in Java, learned how to manage array operations, and understood the distinction between primitive arrays and wrapper object arrays.
