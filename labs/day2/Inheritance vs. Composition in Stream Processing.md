### **Hands-On Lab: Inheritance vs. Composition demonstrated using a naive Stream processing scenario**

#### **Objective:**

In this lab, you will explore the differences between using inheritance and composition in stream processing. You will first implement a solution using inheritance, then refactor it using composition, and compare the flexibility and maintainability of both approaches.

#### **Lab Requirements:**

- **Language**: Java
- **Time**: 1 hour (max :-)
- **Prerequisites**: Basic knowledge of Object-Oriented Programming, Inheritance, Interfaces, and Composition.

### Hint:

- If you are unsure, you always could browse the full solution of this exercise in the `gabor-demos` folder of this very repository, this case: [day2/inheritance-is-overrated](../../gabor-demos/inheritance-is-overrated).

---

### **Lab Steps:**

#### Step 0: Create a new Java Project

- Create a new Java project in your IDE (e.g., IntelliJ, Eclipse, VS Code etc.).
- Use maven archetype to create a new project, with the usual steps.
- Add a meaningfull name which reflects to the takeaway, for example `inheritance-is-overrated` or `inheritance-vs-composition`.
- After creating the project, do not forget to instruct maven to use java version 17... meaning: edit the `pom.xml` file and add the following lines:

```xml
<properties>
    <... anything here ...>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>
```

#### **Part 1: Implementing the Inheritance-Based Approach**

1.  **Step 1: Define the `MyStream` Interface**:

    - Start by defining an interface `MyStream` with methods like `open()`, `read()`, `write()`, and `close()`. Use `byte[]` as the data type for read/write operations.

2.  **Step 2: Implement `FileStream`, `MemoryStream`, and `NetworkStream`**:

    - Implement the `MyStream` interface with three subclasses. It should be a naive implementation that only prints a message to standard output (e.g., `"Reading data..."` or `"Writing data..."`), an so on.
    - - `FileStream`: Handles file-related stream operations.
      - `MemoryStream`: Handles memory-based stream operations.
      - `NetworkStream`: Handles network-related stream operations.

3.  **Step 3: Add Encryption via Inheritance**:

    - Create subclasses `EncryptedFileStream` and `EncryptedMemoryStream`, which extend `FileStream` and `MemoryStream`, respectively.
    - These subclasses should add encryption functionality to the stream classes.
    - Demonstrate the encryption using a naive logic by printing a message to standard output (e.g., `"Encrypting data..."`), and so on.

4.  **Step 4: Recognize the Limitation**:

    - **New Requirement**: Now imagine you need to add compression functionality, along with the ability to combine encryption and compression (i.e., `CompressedFileStream`, `CompressedMemoryStream`, `CompressedEncryptedFileStream`, etc.).
    - **Discussion**: Ask yourself how many new classes you would need to create for every combination of encryption and compression for different types of streams, the order of encyprion and compression matters, count those to different cases...

---

#### **Part 2: Implementing the Composition-Based Approach**

1.  **Step 1: Refactor the Stream Classes**:

    - Use the same `MyStream` interface.
    - Refactor the `FileStream`, `MemoryStream`, and `NetworkStream` classes to remove any encryption or compression logic.

2.  **Step 2: Define the `Encryptor` and `Decryptor` Interfaces**:

    - Define an `Encryptor` interface with methods like `byte[] data encrypt(byte[] data)`.
    - Define a `Decryptor` interface with methods like `byte[] data decrypt(byte[] data)`.

3.  **Step 3: Implement Naive Encryption and Decryption**:

    - Create a simple `NaiveEncryptor` and `NaiveDecryptor` class that implements the `Encryptor` and `Decryptor` interfaces, respectively.
    - For this lab, make **naive implementations** that only print a message to standard output (e.g., `"Encrypting data..."` or `"Decrypting data..."`).

4.  **Step 4: Introduce Composition with MyStream**:

    - Create an `EncryptedStream` class that **accepts a `MyStream` instance** and an `Encryptor` instance via the constructor. This is an example of **composition**, and also a **dependency injection**.
    - Modify the behavior of `read()` and `write()` methods by delegating to the injected `MyStream` and using the `Encryptor` to "encrypt" data.
    - Similarly, create a `CompressedStream` class that injects a `MyStream` and a `Compressor`.

    Example for `EncryptedStream`:

    ```
    public class EncryptedStream implements MyStream {
        private MyStream stream;
        private Encryptor encryptor;

        public EncryptedStream(MyStream stream, Encryptor encryptor) {
            this.stream = stream;
            this.encryptor = encryptor;
        }

        @Override
        public void write(byte[] data) {
            encryptor.encrypt(data);
            stream.write(data);
        }
        // ...

    }

    ```

5.  **Step 5: Demonstrate the Usage**:

    - Write a simple `App.java` class with a `main` method where you create instances of `FileStream`, `MemoryStream`, and `NetworkStream`.
    - Use constructor injection to compose these streams with `EncryptedStream` and `CompressedStream`.
    - Demonstrate how you can easily combine encryption and compression without needing multiple subclasses.

---

#### **Part 3: Analysis and Conclusion**

1.  **Compare the Two Approaches**:

    - Ask yourself howusing inheritance leads to class explosion (many classes to handle every combination of features).
    - Contrast that with the composition approach, where you can combine features (encryption, compression) dynamically and flexibly by injecting a `MyStream` object into `EncryptedStream` and `CompressedStream`.

2.  **Reflection**:

    - Why is composition more scalable for adding new behaviors to streams?
    - How does it improve maintainability and code readability?

#### **Done :-)**

If you have completed all the exercises successfully, **please raise your hand**, so the team will know your status. In case you are using the `team-review` repo (which is optional), do not forget commit then push your changes to the remote repository.
