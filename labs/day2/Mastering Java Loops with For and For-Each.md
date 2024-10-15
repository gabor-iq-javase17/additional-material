### **Hands-On Lab: Mastering Java Loops with For and For-Each**

#### **Objective:**

In this lab, you will practice using both `for` and `for-each` loops to solve basic programming problems. You will complete four exercises that reinforce your understanding of how these loops work and when to use each one.

#### **Lab Requirements:**

- **Language**: Java
- **Time**: 1 hour (max :-)
- **Prerequisites**: Basic knowledge of Java and loops.

### Hint:

- Use the code snipperts provided in the lab description, but please first try to solve the exercises on your own.

---

### **Lab Setup for _each_ exercise**:

#### Step 0: Create a new, separate Java Project for _each_ exercise

- Create a new Java project in your IDE (e.g., IntelliJ, Eclipse, VS Code etc.).
- Use maven archetype to create a new project, with the usual steps.
- Add a meaningfull name which reflects to the takeaway, for example `for-loop-...` or
- After creating the project, do not forget to instruct maven to use java version 17... meaning: edit the `pom.xml` file and add the following lines:

```xml
<properties>
    <... anything here ...>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>
```

2.  **Modify the `App.java` File**:

    - In this file, you'll write all the exercises as part of the `main` method, using simple output to the console to check your results.

---

### **Exercise 1: Print Numbers Using a For Loop**

**Objective**: Use a `for` loop to print numbers from 1 to 10.

**Steps**:

- In `App.java`, create a `for` loop to iterate from 1 to 10.
- Print each number in the loop using `System.out.println()`.

**Code Example**:

```
public class App {
    public static void main(String[] args) {
        // Exercise 1: Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }
}

```

**Expected Output**:

```
Number: 1
Number: 2
Number: 3
...
Number: 10

```

---

### **Exercise 2: Calculate Sum of Even Numbers Using For Loop**

**Objective**: Use a `for` loop to calculate the sum of even numbers from 1 to 20.

**Steps**:

- Write a `for` loop that checks whether each number between 1 and 20 is even.
- If the number is even, add it to a sum variable.
- After the loop ends, print the sum.

**Code Example**:

```
public class App {
    public static void main(String[] args) {
        int sum = 0;
        // Exercise 2: Calculate the sum of even numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to 20 is: " + sum);
    }
}

```

**Expected Output**:

```
Sum of even numbers from 1 to 20 is: 110

```

---

### **Exercise 3: Iterate Over an Array Using a For-Each Loop**

**Objective**: Use a `for-each` loop to iterate over an array of integers and print each element.

**Steps**:

- Create an array of integers with values like `{10, 20, 30, 40, 50}`.
- Use a `for-each` loop to iterate over the array and print each element.

**Code Example**:

```
public class App {
    public static void main(String[] args) {
        // Exercise 3: Iterate over an array of integers using a for-each loop
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}

```

**Expected Output**:

```
Number: 10
Number: 20
Number: 30
Number: 40
Number: 50

```

---

### **Exercise 4: Find the Maximum Value in an Array Using a For-Each Loop**

**Objective**: Use a `for-each` loop to find the maximum value in an array.

**Steps**:

- Create an array of integers (e.g., `{5, 17, 9, 13, 25}`).
- Use a `for-each` loop to iterate through the array.
- Track the largest number as you iterate and print it after the loop ends.

**Code Example**:

```
public class App {
    public static void main(String[] args) {
        int[] numbers = {5, 17, 9, 13, 25};
        int max = numbers[0]; // Initialize max with the first element

        // Exercise 4: Find the maximum value in the array using a for-each loop
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }
}

```

**Expected Output**:

```
Maximum value in the array is: 25

```

#### **Done :-)**

If you have completed all the exercises successfully, **please raise your hand**, so the team will know your status. In case you are using the `team-review` repo (which is optional), do not forget commit then push your changes to the remote repository.
