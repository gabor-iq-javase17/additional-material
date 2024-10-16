### **Hands-On Lab: Working with Generics, Covariance, and Contravariance in Java**

#### **Objective:**

In this lab, you will implement a custom generic interface `MyList<T>` and explore how generics behave in Java, particularly when dealing with inheritance, covariance, and contravariance. You will work with classes like `Fruit`, `Apple`, and `Peach`, create lists using generics, and experiment with covariance (`<? extends T>`) and contravariance (`<? super T>`).

---

### **Lab Requirements:**

- **Language**: Java
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming, and generics.

### Hint:

- If you are unsure, you always could browse the demonstration code we'have just implemented and committed and pushed on this topic in the `gabor-demos` folder of this very repository

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
      - `Fruit.java`: Abstract base class representing a fruit.
      - `Apple.java`: A subclass representing an Apple.
      - `Peach.java`: A subclass representing a Peach.
      - `MyList.java`: A **generic interface** for list operations.
      - `NaiveMyList.java`: An implementation of the `MyList<T>` interface.
      - `FruitProcessor.java`: A utility class for processing lists of fruits with generics.

---

#### **Step 3: Define the `MyList` Interface**

1.  **Task**: Define the `MyList<T>` generic interface with the following methods. Try to us

    - A method to **add** an element to the list.
    - A method to **get** an element at a specific index.
    - A method to **update** an element at a specific index.
    - A method to **remove** the first occurrence of an element.
    - A method to **contains** if the list contains a specific element.
    - A method to return the actual **size** of the list.

2.  **Deliverable**: Ensure the interface can work with any type `T` using Java generics.

---

#### **Step 4: Implement the `NaiveMyList` Class**

1.  **Task**: Implement the `MyList<T>` interface in the `NaiveMyList<T>` class.

    - Use an appropriate data structure (an array) to store elements. You can start with a simple implementation.
    - Implement each of the methods defined in `MyList<T>`.
    - Ensure that elements can be added, retrieved, updated, removed, and checked.

2.  **Deliverable**: A fully functional generic list class that implements the `MyList<T>` interface.

---

#### **Step 5: Implement the `Fruit` Class Hierarchy**

1.  **Task**: Create an abstract `Fruit` class with a method to return the name of the fruit.

    - Implement subclasses `Apple` and `Peach` that extend `Fruit`.
    - Ensure each subclass provides a meaningful implementation of the `getName()` method.

2.  **Deliverable**: A `Fruit` class hierarchy where `Apple` and `Peach` are distinct subclasses of `Fruit`.

---

#### **Step 6: Implement the `FruitProcessor` Class**

1.  **Task**: Implement a `FruitProcessor` class that processes lists of fruits.

    - Write a method in `FruitProcessor` that accepts a list of fruits (e.g., `MyList<Fruit>`).
    - This method should iterate over the list, retrieve each fruit, and print the name of the fruit.

2.  **Deliverable**: A utility class that can process lists of fruits by printing their names.

---

#### **Step 8: Experiment with Covariance (`<? extends T>`)**

1.  **Task**: Create a simple main application in `App.java` to test the `FruitProcessor` class.

    - Create lists of `Fruit`, `Apple`, and `Peach` using the `NaiveMyList` class.
    - Pass these lists to the `FruitProcessor` method and observe the behavior.
    - Try to pass a list of `Apple` to the `FruitProcessor` method.

---

#### **Step 8: Experiment with Covariance (`<? extends T>`)**

1.  **Task**: Modify the `FruitProcessor` class to accept a list of any subclass of `Fruit` (e.g., `MyList<? extends Fruit>`).

    - Create a list of `Apple` and pass it to the method. Verify that the method can handle it correctly.
    - Test if you can **add** elements to a `MyList<? extends Fruit>` and explain why or why not.

2.  **Experiment**: Try passing a list of `Apple` to the `FruitProcessor` method and see how it behaves. Understand the behavior of covariance and why you can't add elements in this case.
3.  **Deliverable**: A modified `process()` method that accepts `MyList<? extends Fruit>` and demonstrates how covariance works.

---

#### **Step 8: Experiment with Contravariance (`<? super T>`)**

1.  **Task**: Modify the `FruitProcessor` class to accept a list of `Fruit` or any of its supertypes (e.g., `MyList<? super Fruit>`).

    - Create a list of `Object` and pass it to the method. Verify that the method can handle it.
    - Test if you can **add** elements (like `Apple` or `Peach`) to a `MyList<? super Fruit>`.

2.  **Experiment**: Try passing a list of `Object` to the `FruitProcessor` method and see how contravariance allows adding elements of type `Fruit` or its subclasses.
3.  **Deliverable**: A modified `process()` method that accepts `MyList<? super Fruit>` and demonstrates how contravariance works.

---

#### **Step 9: Run and Test Your Project**

1.  **Run the Main Program**:

    - In `App.java`, create lists of `Fruit`, `Apple`, and `Peach`.
    - Experiment with calling the `process()` method with different types of lists (`MyList<Fruit>`, `MyList<? extends Fruit>`, `MyList<? super Fruit>`).
    - Observe how the program behaves with covariance and contravariance in action.

2.  **Expected Results**:

    - Understand how generic lists behave when using covariance and contravariance.
    - Observe when you can or cannot add elements to generic collections depending on variance.

---

### **Discussion: Covariance vs. Contravariance**

1.  **Covariance (`<? extends T>`)**:

    - Covariance allows you to pass a list of a type that is a subtype of the specified generic type (`T`).
    - You can **read** elements from the list, but you cannot safely **add** elements, as the exact type of elements the list can accept is unknown beyond `T`.

2.  **Contravariance (`<? super T>`)**:

    - Contravariance allows you to pass a list of a type that is a supertype of the specified generic type (`T`).
    - You can safely **add** elements of type `T` or any of its subclasses, but reading elements may not return the expected specific subtype.

---

### **Conclusion and Reflection**

In this lab, you explored the concepts of **generics**, **covariance**, and **contravariance** in Java. By working with the `MyList` interface and experimenting with variance in the `FruitProcessor` class, you gained a deeper understanding of how generics enable type safety while providing flexibility for working with collections.

Feel free to explore further by modifying the types used in `MyList` and experimenting with additional types beyond fruits!

#### **Done :-)**

If you have completed all the exercises successfully, **please raise your hand**, so the team will know your status. In case you are using the `team-review` repo (which is optional), do not forget commit then push your changes to the remote repository.
