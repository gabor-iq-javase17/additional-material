### **Hands-On Lab: Working with Arrays and Custom Objects in Java**

#### **Objective:**

In this lab, you will learn how to work with arrays of custom objects in Java. The objective is to understand how to create arrays of user-defined classes and how to manipulate them effectively. You will set up a Java project and recreate the behavior of working with arrays of objects such as `ChessPiece` and `Device`.

By the end of this lab, you will have a working understanding of:

- Creating and managing arrays in Java.
- Initializing and populating arrays with custom objects.
- Printing and manipulating objects within arrays.

---

### **Lab Requirements:**

- **Language**: Java
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming, and arrays.

---

### Hint:

- If you are unsure, you always could browse the demonstration code we'have just implemented and committed and pushed on this topic in the `gabor-demos` folder of this very repository

---

### **Lab Setup:**

#### **Step 1: Create a New Java Project**

1.  Open your preferred IDE (e.g., IntelliJ, Eclipse, VS Code).
2.  Create a new Java project in your IDE.

    - For Maven users, set up a Maven project using the `maven-archetype-quickstart` template.
    - If you are using another build tool, initialize the project according to your IDE's guidelines.

3.  Configure the project to use **Java 17**.

    - For Maven, update your `pom.xml` file by adding the following lines:

    ```
    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>

    ```

4.  Ensure your IDE recognizes the project and is ready to compile and run Java programs.

---

#### **Step 2: Create the Package and Classes**

1.  **Create the Package**:

    - Inside the `src/main/java` folder, create a new package called `com.example`.

2.  **Create the Java Classes**:

    - In the `com.example` package, create the following classes:
      - `App.java` (This will contain the `main` method)
      - `ChessPiece.java` (A custom class to represent chess pieces)
      - `Device.java` (A custom class to represent devices)

---

#### **Step 3: Implement Class Definitions**

1.  **ChessPiece Class**:

    - Create a class named `ChessPiece` in the `com.example` package.
    - Define the following attributes:
      - `type` (String): The type of chess piece (e.g., Rook, Knight).
      - `color` (String): The color of the chess piece (e.g., Black, White).
    - Create a constructor to initialize these attributes.
    - Override the `toString()` method to return a meaningful description of the chess piece.

    **Task**:

    - Implement the `ChessPiece` class and ensure it correctly initializes with a type and color.
    - The `toString()` method should return a string representation of the object.

2.  **Device Class**:

    - Create a class named `Device` in the `com.example` package.
    - Define the following attributes:
      - `type` (String): The type of device (e.g., Laptop, Phone).
      - `brand` (String): The brand of the device (e.g., Dell, Samsung).
    - Create a constructor to initialize these attributes.
    - Override the `toString()` method to return a meaningful description of the device.

    **Task**:

    - Implement the `Device` class with the specified attributes and methods.
    - Ensure the `toString()` method returns a descriptive string.

---

#### **Step 4: Work with Arrays in `App.java`**

1.  **Initialize the Arrays**:

    - Inside the `App.java` file, write the `main` method.
    - Create an array of `ChessPiece` objects and initialize it with at least two chess pieces (e.g., "Rook" and "Knight").
    - Create an array of `Device` objects and initialize it with at least two devices (e.g., "Laptop" and "Phone").

2.  **Print Array Elements**:

    - Use a `for` loop or enhanced `for` loop to iterate over the arrays and print the details of each `ChessPiece` and `Device` object using their `toString()` method.
    - Ensure the output is descriptive and meaningful.

---

#### **Step 5: Test and Run the Project**

1.  **Build and Run the Project**:

    - Compile and run the `App.java` file to see the output in your console.
    - Ensure that all the chess pieces and devices are printed correctly, and the array handling works as expected.

2.  **Expected Output**:

    - You should see details of both chess pieces and devices printed to the console.
    - The output should indicate whether arrays are correctly initialized and manipulated.

---

### **Lab Summary**:

In this lab, you have:

- Set up a Java project to work with arrays of custom objects.
- Implemented two classes (`ChessPiece` and `Device`) to represent different types of objects.
- Created and initialized arrays to store objects of these classes.
- Demonstrated how to work with arrays by printing and manipulating the objects in the arrays.

By completing this hands-on lab, you have gained practical experience in using arrays with custom objects in Java. You are now equipped with the skills to handle more complex data structures in Java programs.

#### **Done :-)**

If you have completed all the exercises successfully, **please raise your hand**, so the team will know your status. In case you are using the `team-review` repo (which is optional), do not forget commit then push your changes to the remote repository.
