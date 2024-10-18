### Java SE 17 Hands-on Lab: Mastering Operators in Java

#### **Introduction**

In this lab, you will explore some of the key operators in Java, including the conditional (ternary) operator, pre- and post-increment operators, and the boolean `&&` and `||` operators. Understanding how these operators work and how they affect the flow of your program is critical in writing concise and efficient code.

Each exercise will demonstrate a different operator, with expected output and solutions provided.

---

### **Lab Requirements:**

- **Language**: Java
- **Tools**: Maven, Java 17, IDE (e.g., IntelliJ, Eclipse, VS Code)
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming and Maven.

---

### **Exercise 1: Using the Conditional (Ternary) Operator**

**Objective**: Learn how to use the conditional (ternary) operator `:?` to simplify simple if-else statements.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Define two integer variables. Use the ternary operator to check if one number is greater than the other and assign the result to a new variable.
4.  **Step 4**: Print the result.

**Expected Output**:

- The result of the comparison should be printed (e.g., which number is greater).

---

### **Exercise 2: Pre-increment and Post-increment**

**Objective**: Understand the difference between pre-increment (`++i`) and post-increment (`i++`) operators.

1.  **Step 1**: In the same project, create a class `App` with a `main` method.
2.  **Step 2**: Define an integer variable and demonstrate how both pre-increment and post-increment affect the value.
3.  **Step 3**: Print the values before and after each increment operation.

**Expected Output**:

- The values should reflect the different behavior of pre- and post-increment operations.

---

### **Exercise 3: Boolean AND (`&&`) and OR (`||`) Operators**

**Objective**: Learn how the boolean `&&` (AND) and `||` (OR) operators work and short-circuit evaluation.

1.  **Step 1**: In the same project, create a class `App` with a `main` method.
2.  **Step 2**: Define two boolean variables and demonstrate how `&&` and `||` operators work.
3.  **Step 3**: Show how short-circuit evaluation works by combining boolean operations with methods that print output.

**Expected Output**:

- Results of boolean expressions and evidence of short-circuit behavior.

---

### **Exercise 4: Combining Multiple Operators**

**Objective**: Combine the ternary operator, pre-/post-increment, and boolean operators in a single example.

1.  **Step 1**: In the same project, create a class `App` with a `main` method.
2.  **Step 2**: Define variables and use a combination of the ternary operator, pre-/post-increment, and `&&`/`||` operators to build a complex expression.
3.  **Step 3**: Print the result of the expression and the state of the variables after evaluation.

**Expected Output**:

- The final result of the complex expression and the updated values of the variables.

---

**Done :-)**

If you have completed all the exercises successfully, please raise your hand, so the team will see your status, or share your code with the instructor for review.

---

### **Solutions**

---

#### **Exercise 1 Solution: Conditional (Ternary) Operator**

```Java
public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Using the ternary operator to find the greater value
        int max = (a > b) ? a : b;
        System.out.println("The greater value is: " + max);
    }
}

```

**Expected Output**:

```
The greater value is: 20

```

**Discussion**: The conditional operator `:?` allows you to quickly return one of two values based on a condition, acting as a shorthand for an if-else statement.

**Takeaway**: Use the ternary operator for concise conditional assignments when you have simple conditions.

---

#### **Exercise 2 Solution: Pre- and Post-Increment**

```Java
public class App {
    public static void main(String[] args) {
        int x = 5;

        // Post-increment
        System.out.println("Post-increment: " + x++); // Expected: 5
        System.out.println("After post-increment: " + x); // Expected: 6

        // Pre-increment
        System.out.println("Pre-increment: " + ++x); // Expected: 7
        System.out.println("After pre-increment: " + x); // Expected: 7
    }
}

```

**Expected Output**:

```
Post-increment: 5
After post-increment: 6
Pre-increment: 7
After pre-increment: 7

```

**Discussion**: The pre-increment operator (`++x`) increments the value before returning it, while the post-increment operator (`x++`) returns the value first and then increments it.

**Takeaway**: Understand the distinction between pre- and post-increment to avoid unintended behavior in your code.

---

#### **Exercise 3 Solution: Boolean AND (`&&`) and OR (`||`) Operators**

```Java
public class App {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // AND (&&) operator
        System.out.println("a && b: " + (a && b)); // Expected: false

        // OR (||) operator
        System.out.println("a || b: " + (a || b)); // Expected: true

        // Short-circuit example with method calls
        System.out.println("a && shortCircuit(): " + (a && shortCircuit())); // Expected: "Short circuit called!" and true
        System.out.println("b && shortCircuit(): " + (b && shortCircuit())); // Expected: false (no method call)
    }

    // Method to demonstrate short-circuiting
    public static boolean shortCircuit() {
        System.out.println("Short circuit called!");
        return true;
    }
}

```

**Expected Output**:

```
a && b: false
a || b: true
Short circuit called!
a && shortCircuit(): true
b && shortCircuit(): false

```

**Discussion**: The `&&` operator returns true only if both conditions are true, and `||` returns true if at least one condition is true. Short-circuit evaluation means that the second operand is only evaluated if necessary.

**Takeaway**: Use short-circuiting to optimize conditional logic and prevent unnecessary evaluations.

---

#### **Exercise 4 Solution: Combining Multiple Operators**

```Java
public class App {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Combining pre-increment, ternary operator, and boolean operators
        boolean result = (++x > y) && ((y++ < x) || (x++ > y));

        System.out.println("Result: " + result); // Expected: true
        System.out.println("Final values - x: " + x + ", y: " + y); // Expected: x = 12, y = 6
    }
}

```

**Expected Output**:

```
Result: true
Final values - x: 12, y: 6

```

**Discussion**: This example combines several operators, showcasing how complex expressions can be evaluated. The values of `x` and `y` are incremented both before and after the comparison, affecting the final result.

**Takeaway**: Be mindful when combining operators to ensure the expected behavior, especially with increment operations and short-circuit logic.

---

### **Conclusion**

This lab provided an in-depth look at several important Java operators, including the conditional operator, pre- and post-increment operators, and boolean operators. Understanding these operators helps you write concise, efficient, and correct Java code.

**Takeaway**: Mastery of these operators allows you to optimize code readability, performance, and logic flow.
