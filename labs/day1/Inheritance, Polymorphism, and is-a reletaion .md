### Hands-on Lab Specification: "Inheritance, Polymorphism, and Object-Oriented Programming in Java"

#### Lab Overview

In this lab, students will develop a Java application using Object-Oriented Programming (OOP) principles, focusing on inheritance and polymorphism. The application will model a fruit-processing system with different types of fruits, such as apples and peaches. Students will learn to:

1.  Implement inheritance and method overriding.
2.  Utilize polymorphism to process various types of fruit objects.
3.  Understand type casting and compile-time vs. runtime behavior in Java.

### Hint:

- If you are unsure you always could browse the full solution of this exercise in the `gabor-demos` folder of this very repository, this case: [day1/hello-world-app](../../gabor-demos/is-a-demo).

---

### Lab Steps

#### Step 1: Create a Java Project

- Create a new Java project in your IDE (e.g., IntelliJ, Eclipse, VS Code etc.).
- Use maven archetype to create a new project, with the usual steps.
- Add a meaningfull name which reflects to the takeaway, for example `is-a-demo`.
- After creating the project, do not forget to use out java version 17... meaning: edit the `pom.xml` file and add the following lines:

```xml
<properties>
    <... anything here ...>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>
```

#### Step 2: Define the Base Class

1.  **Create a `Fruit` class** inside a package called `com.example`.
2.  The `Fruit` class should have:
    - Private instance variables: `name` and `color` (both strings).
    - A constructor that initializes `name` and `color`.
    - Public getter methods (`getName()` and `getColor()`).
    - Three public methods: `harvest()`, `eat()`, and `process()`. Each method should print a statement indicating the action (e.g., `"The fruit is harvested."`).

#### Step 3: Define Subclasses

1.  **Create an `Apple` class** that extends `Fruit`.

    - The class should have an additional property: `variety` (a string).
    - Override the `harvest()`, `eat()`, and `process()` methods to print specific messages for apples (e.g., `"The apple is harvested."`).
    - Provide a getter and setter for the `variety`.

2.  **Create a `Peach` class** that extends `Fruit`.

    - The class should also have a `variety` property.
    - Override the `harvest()`, `eat()`, and `process()` methods to print specific messages for peaches (e.g., `"The peach is harvested."`).
    - Provide a getter and setter for `variety`.

#### Step 4: Create a Fruit Processor

1.  **Create a `FruitProcessor` class** inside `com.example`.
    - The class should contain a `process(Fruit fruit)` method that:
      - Calls `harvest()`, `process()`, and `eat()` on the `fruit` object.
    - Use polymorphism to handle different types of `Fruit`.

#### Step 5: Implement the Main Application

1.  **Create an `App` class** with a `main` method.
2.  Inside the `main` method:
    - Create instances of `Fruit`, `Apple`, and `Peach`.
    - Demonstrate polymorphism by:
      - Assigning an `Apple` object to a `Fruit` variable (e.g., `fruit = apple`).
      - Type casting back from `Fruit` to `Apple` (e.g., `apple = (Apple) fruit`).
      - Explain why direct assignments (e.g., `apple = peach`) would cause compile-time errors.
    - Instantiate a `FruitProcessor` and process the `fruit` objects.

#### Step 6: Test and Run the Application

- Compile and run the `App` class.
- Ensure that different fruits are processed using the `FruitProcessor`, and the correct method overrides are demonstrated.

---

### Lab Exercises

1.  **Exercise 1: Understanding Inheritance**

    - Modify the `Apple` class to add an additional method that is not available in the `Fruit` superclass.
    - Call the method on an `Apple` object.

2.  **Exercise 2: Polymorphism in Action**

    - Assign the `Apple` object to a `Fruit` variable and try to call the specific method added in Exercise 1. Explain why it does not work and how you can resolve it using casting.

3.  **Exercise 3: Runtime Exceptions**

    - Try assigning a `Peach` object to an `Apple` variable using type casting. Observe what happens when you run the application and explain the cause of the runtime error.

---

### Expected Outputs

- Upon running the `App` class, you should see output like:

```

The apple is harvested.
The apple is processed.
The apple has been eaten.

```

- If you incorrectly cast a `Peach` object to an `Apple`, you should see a `ClassCastException` at runtime.

---

### Lab Deliverables

- Source code for the `Fruit`, `Apple`, `Peach`, `FruitProcessor`, and `App` classes.
- A short report explaining:
- The role of inheritance and method overriding in this lab.
- How polymorphism was demonstrated.
- The type of errors encountered when improper casting was attempted.

---

### Summary

In this lab, you created a simple fruit-processing system in Java using OOP concepts. You explored inheritance, method overriding, and polymorphism while learning about the behavior of objects during compile-time and runtime. Through hands-on coding, you also encountered real-world scenarios like type casting and its associated errors.

```

```
