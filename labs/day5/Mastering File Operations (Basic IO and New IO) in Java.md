### Java SE 17 Hands-on Lab: Mastering File Operations (Basic IO and New IO) in Java

#### **Note:**

Prefer using the new IO (NIO) package (`java.nio.file`) for file operations in Java, as it provides more flexibility and scalability compared to traditional IO (`java.io`). However in legacy code you may still encounter the traditional IO approach, so it's important to be familiar with both.

#### **Introduction**

In this lab, you will explore file operations in Java using both traditional IO (`java.io`) and new IO (`java.nio.file`). File operations are essential for reading and writing data to files, and the New IO (NIO) package offers more flexible and scalable features than the traditional IO approach.

Each exercise focuses on different aspects of file operations, including reading and writing text files, working with binary data, and using NIO features for file management.

---

### **Lab Requirements:**

- **Language**: Java
- **Tools**: Maven, Java 17, IDE (e.g., IntelliJ, Eclipse, VS Code)
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming and Maven.

---

### **Exercise 1: Writing to a File using Basic IO**

**Objective**: Learn how to write text to a file using `FileWriter`.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Use `FileWriter` to write a string of text to a file called `output.txt`.
4.  **Step 4**: Close the file after writing.

**Expected Output**:

- The file `output.txt` should be created with the provided text.

---

### **Exercise 2: Reading from a File using Basic IO**

**Objective**: Learn how to read text from a file using `FileReader`.

1.  **Step 1**: In the same project, create a class `App` with a `main` method.
2.  **Step 2**: Use `FileReader` and `BufferedReader` to read the contents of `output.txt`.
3.  **Step 3**: Print the content of the file to the console.

**Expected Output**:

- The content of `output.txt` should be displayed in the console.

---

### **Exercise 3: Writing and Reading Binary Data using Basic IO**

**Objective**: Learn how to write and read binary data using `FileOutputStream` and `FileInputStream`.

1.  **Step 1**: In the same project, create a class `App` with a `main` method.
2.  **Step 2**: Use `FileOutputStream` to write an array of bytes to a binary file called `data.bin`.
3.  **Step 3**: Use `FileInputStream` to read the binary file and print the byte data to the console.

**Expected Output**:

- The binary file `data.bin` should be created and the byte data should be displayed in the console.

---

### **Exercise 4: Copying Files using Basic IO**

**Objective**: Learn how to copy files using `FileInputStream` and `FileOutputStream`.

1.  **Step 1**: In the same project, create a class `App` with a `main` method.
2.  **Step 2**: Use `FileInputStream` to read a file and `FileOutputStream` to write its content to a new file.
3.  **Step 3**: Ensure that the copy is an exact replica of the original file.

**Expected Output**:

- A copy of the file should be created and verified.

---

### **Exercise 5: Writing to a File using NIO**

**Objective**: Learn how to write text to a file using the NIO package (`Files` and `Paths`).

1.  **Step 1**: In the same project, create a class `App` with a `main` method.
2.  **Step 2**: Use the `Files.write()` method to write a string of text to a file called `nio_output.txt`.
3.  **Step 3**: Verify that the file has been created with the expected content.

**Expected Output**:

- The file `nio_output.txt` should be created with the provided text.

---

### **Exercise 6: Reading from a File using NIO**

**Objective**: Learn how to read text from a file using NIO (`Files` and `Paths`).

1.  **Step 1**: Use the `Files.readAllLines()` method to read all lines from `nio_output.txt` into a list.
2.  **Step 2**: Print each line to the console.

**Expected Output**:

- The content of `nio_output.txt` should be displayed in the console.

---

### **Exercise 7: Copying Files using NIO**

**Objective**: Learn how to copy files using the NIO package (`Files.copy()`).

1.  **Step 1**: Use the `Files.copy()` method to copy `nio_output.txt` to a new file called `nio_copy.txt`.
2.  **Step 2**: Verify that the copy is an exact replica of the original file.

**Expected Output**:

- A copy of the file `nio_copy.txt` should be created and verified.

---

### **Exercise 8: Listing Files in a Directory using NIO**

**Objective**: Learn how to list files in a directory using the NIO package (`Files.newDirectoryStream()`).

1.  **Step 1**: Use `Files.newDirectoryStream()` to list all files in the current directory.
2.  **Step 2**: Print the name of each file to the console.

**Expected Output**:

- The names of all files in the current directory should be displayed.

---

**Done :-)**

If you have completed all the exercises successfully, please raise your hand, so the team will see your status, or share your code with the instructor for review.

---

### **Solutions**

---

#### **Exercise 1 Solution**

```Java
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, this is a sample text.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

**Expected Output**:

- The file `output.txt` should be created with the content "Hello, this is a sample text."

---

#### **Exercise 2 Solution**

```Java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

**Expected Output**:

```
Hello, this is a sample text.

```

---

#### **Exercise 3 Solution**

```Java
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        byte[] data = { 65, 66, 67, 68, 69 }; // ASCII for A, B, C, D, E

        // Writing binary data
        try (FileOutputStream fos = new FileOutputStream("data.bin")) {
            fos.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading binary data
        try (FileInputStream fis = new FileInputStream("data.bin")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData + " "); // Should print A B C D E
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

**Expected Output**:

```
A B C D E

```

---

#### **Exercise 4 Solution**

```Java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String sourceFile = "output.txt";
        String destinationFile = "copy_output.txt";

        // Copying file
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File copied successfully!");
    }
}

```

**Expected Output**:

```
File copied successfully!

```

---

#### **Exercise 5 Solution**

```Java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        Path filePath = Path.of("nio_output.txt");
        String content = "This is written using NIO.";

        try {
            Files.write(filePath, content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File created using NIO.");
    }
}

```

**Expected Output**:

- The file `nio_output.txt` should be created with the content "This is written using NIO."

---

#### **Exercise 6 Solution**

```Java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Path filePath = Path.of("nio_output.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

**Expected Output**:

```
This is written using NIO.

```

---

#### **Exercise 7 Solution**

```Java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        Path sourceFile = Path.of("nio_output.txt");
        Path destinationFile = Path.of("nio_copy.txt");

        try {
            Files.copy(sourceFile, destinationFile);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

**Expected Output**:

```
File copied successfully!

```

---

#### **Exercise 8 Solution**

```Java
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        Path dir = Path.of(".");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

**Expected Output**:

- The names of all files in the current directory should be printed.

---

### **Discussion and Takeaways**

- **Basic IO**: Java's traditional IO (`java.io`) is straightforward for basic file reading and writing tasks. However, it may require manual resource management, such as closing streams.
- **New IO (NIO)**: The NIO package (`java.nio.file`) introduced more flexible and efficient file handling. It supports asynchronous operations, memory-mapped files, and a more versatile API for dealing with file systems.

**Takeaway**: Use NIO for advanced file operations, especially when working with large datasets or needing efficient file management. Basic IO is still useful for simpler tasks, but NIO provides greater flexibility.
