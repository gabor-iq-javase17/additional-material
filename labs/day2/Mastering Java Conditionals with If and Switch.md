### **Hands-On Lab: Mastering Java Conditionals with If and Switch**

#### **Objective:**

In this lab, you will practice using both `if` and `switch` statements to solve basic programming problems. You will complete four exercises that reinforce your understanding of how these conditional statements work and when to use each one.

#### **Lab Requirements:**

- **Language**: Java
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java and conditionals.

### Hint:

- Use the code snippets provided in the lab description, but please first try to solve the exercises on your own.

---

### **Lab Setup for _each_ exercise**:

#### Step 0: Create a new, separate Java Project for _each_ exercise

- Create a new Java project in your IDE (e.g., IntelliJ, Eclipse, VS Code, etc.).
- Use maven archetype to create a new project, with the usual steps.
- Add a meaningful name that reflects the exercise, such as `if-condition-...` or `switch-condition-...`.
- After creating the project, do not forget to instruct Maven to use Java version 17 by editing the `pom.xml` file and adding the following lines:

```
<properties>
    <... anything here ...>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>

```

#### Step 1: Modify the `App.java` File:

- In this file, you'll write all the exercises as part of the `main` method, using simple output to the console to check your results.

---

### **Exercise 1: Determine Even or Odd Number Using If Statement**

**Objective**: Use an `if` statement to check if a number is even or odd.

**Steps**:

- In `App.java`, create an integer variable with a value of your choice (e.g., `int num = 7`).
- Use an `if` statement to check if the number is even or odd by using the modulus operator (`%`).
- Print a message to the console indicating if the number is even or odd.

**Code Example**:

```
public class App {
    public static void main(String[] args) {
        int num = 7;
        // Exercise 1: Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}

```

**Expected Output**:

```
7 is odd.

```

---

### **Exercise 2: Grade Evaluation Using If-Else Statements**

**Objective**: Use `if-else` statements to evaluate a student's grade.

**Steps**:

- Create a variable `int score = 85` to represent the student's score.
- Use `if-else` statements to determine the grade based on the score:
  - `score >= 90`: Print `"Grade A"`
  - `score >= 80`: Print `"Grade B"`
  - `score >= 70`: Print `"Grade C"`
  - `score >= 60`: Print `"Grade D"`
  - Otherwise, print `"Grade F"`

**Code Example**:

```
public class App {
    public static void main(String[] args) {
        int score = 85;
        // Exercise 2: Grade evaluation using if-else statements
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else if (score >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}

```

**Expected Output**:

```
Grade B

```

---

### **Exercise 3: Days of the Week Using Switch Statement**

**Objective**: Use a `switch` statement to print the name of the day based on the number.

**Steps**:

- Create an integer variable `int day = 3` to represent the day of the week (1 = Monday, 2 = Tuesday, etc.).
- Use a `switch` statement to print the name of the day based on the value of `day`.
  - `1`: Print `"Monday"`
  - `2`: Print `"Tuesday"`
  - `3`: Print `"Wednesday"`
  - `4`: Print `"Thursday"`
  - `5`: Print `"Friday"`
  - `6`: Print `"Saturday"`
  - `7`: Print `"Sunday"`
  - If the number is not between 1 and 7, print `"Invalid day"`.

**Code Example**:

```
public class App {
    public static void main(String[] args) {
        int day = 3;
        // Exercise 3: Days of the week using switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

```

**Expected Output**:

```
Wednesday

```

---

### **Exercise 4: Basic Calculator Using Switch Statement**

**Objective**: Use a `switch` statement to create a basic calculator that performs addition, subtraction, multiplication, or division.

**Steps**:

- Create three variables: `double num1 = 10`, `double num2 = 5`, and `char operator = '+'`.
- Use a `switch` statement to perform the calculation based on the value of `operator`.
  - `'+'`: Perform addition and print the result.
  - `'-'`: Perform subtraction and print the result.
  - `'*'`: Perform multiplication and print the result.
  - `'/'`: Perform division and print the result (ensure `num2` is not zero).
  - If the operator is none of the above, print `"Invalid operator"`.

**Code Example**:

```
public class App {
    public static void main(String[] args) {
        double num1 = 10, num2 = 5;
        char operator = '+';

        // Exercise 4: Basic calculator using switch statement
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

```

**Expected Output**:

```
Result: 15.0

```

#### **Done :-)**

If you have completed all the exercises successfully, **please raise your hand**, so the team will know your status. In case you are using the `team-review` repo (which is optional), do not forget commit then push your changes to the remote repository.
