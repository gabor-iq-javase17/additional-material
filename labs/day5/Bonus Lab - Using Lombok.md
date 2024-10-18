### Bonus Lab: Using Lombok

#### **Introduction**

Lombok is a popular Java library that reduces boilerplate code by automatically generating code for common tasks such as getters, setters, constructors, and more. This lab will guide you through various Lombok features, including annotations for data classes, constructors, logging, and more.

In the solution section, we will explain how to set up Lombok in a Maven project by editing the `pom.xml` file.

---

### **Lab Requirements:**

- **Language**: Java
- **Tools**: Maven, Java 17, IDE (e.g., IntelliJ, Eclipse, VS Code)
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming and Maven.

---

### **Setting up Lombok in Maven**

Before we start with the exercises, follow these steps to add Lombok to your Maven project:

1.  Open the `pom.xml` file of your project.
2.  Add the following Lombok dependency inside the `<dependencies>` section:

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.26</version>
    <scope>provided</scope>
</dependency>

```

3.  Save the `pom.xml` file and run `mvn clean install` to download the Lombok library.

---

### **Exercise 1: Using @Getter and @Setter**

**Objective**: Learn how to automatically generate getters and setters for fields using Lombok.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `Person` class inside it.
3.  **Step 3**: Add fields `name` (String) and `age` (int) to the `Person` class.
4.  **Step 4**: Annotate the class with `@Getter` and `@Setter` to automatically generate getter and setter methods.
5.  **Step 5**: In the `main` method, create an instance of `Person`, set its fields, and print the values.

**Expected Output**:

- The name and age should be set and retrieved using the generated methods.

---

### **Exercise 2: Using @ToString**

**Objective**: Automatically generate a `toString()` method using Lombok's `@ToString` annotation.

1.  **Step 1**: In the same `Person` class, annotate it with `@ToString`.
2.  **Step 2**: In the `main` method, create an instance of `Person` and print the object.

**Expected Output**:

- A string representation of the `Person` object should be printed with its field values.

---

### **Exercise 3: Using @NoArgsConstructor and @AllArgsConstructor**

**Objective**: Automatically generate constructors using Lombok's `@NoArgsConstructor` and `@AllArgsConstructor` annotations.

1.  **Step 1**: In the `Person` class, add the annotations `@NoArgsConstructor` and `@AllArgsConstructor`.
2.  **Step 2**: In the `main` method, create two instances of `Person`:
    - One using the no-argument constructor.
    - One using the all-argument constructor.
3.  **Step 3**: Print the objects using `toString()`.

**Expected Output**:

- The two `Person` objects should be created and printed, one with default values and the other with the provided values.

---

### **Exercise 4: Using @Builder**

**Objective**: Use the `@Builder` annotation to create an instance of a class with a fluent API.

1.  **Step 1**: In the `Person` class, add the `@Builder` annotation.
2.  **Step 2**: In the `main` method, create an instance of `Person` using the builder pattern and print it.

**Expected Output**:

- A `Person` object should be created using the builder pattern and printed with its values.

---

### **Exercise 5: Using @Data**

**Objective**: Simplify the creation of a data class by using the `@Data` annotation, which combines several annotations.

1.  **Step 1**: Replace the individual Lombok annotations in the `Person` class with a single `@Data` annotation.
2.  **Step 2**: In the `main` method, create an instance of `Person`, set the fields, and print the object.

**Expected Output**:

- A `Person` object should be created with getter, setter, `toString()`, `equals()`, and `hashCode()` methods automatically generated.

---

### **Exercise 6: Using @Log**

**Objective**: Use the `@Log` annotation to automatically create a logger in the class.

1.  **Step 1**: Create a new class `LoggerExample` and annotate it with `@Log`.
2.  **Step 2**: In the `main` method of `LoggerExample`, log messages at different levels (info, warning, severe).
3.  **Step 3**: Run the program to see the logged messages.

**Expected Output**:

- Messages logged at different levels should be displayed in the console.

---

**Done :-)**

If you have completed all the exercises successfully, please raise your hand, so the team will see your status, or share your code with the instructor for review.

---

### **Solutions**

---

#### **Exercise 1 Solution**

```Java
import lombok.Getter;
import lombok.Setter;

public class App {
    @Getter
    @Setter
    static class Person {
        private String name;
        private int age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

```

**Expected Output**:

```
Name: John
Age: 25

```

**Discussion**: By annotating the class with `@Getter` and `@Setter`, Lombok generates the getter and setter methods for the fields at compile time, reducing boilerplate code.

**Takeaway**: Lombok simplifies the creation of accessor methods, making the code more readable and maintainable.

---

#### **Exercise 2 Solution**

```Java
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class App {
    @Getter
    @Setter
    @ToString
    static class Person {
        private String name;
        private int age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);
        System.out.println(person); // Calls toString()
    }
}

```

**Expected Output**:

```
Person(name=Alice, age=30)

```

**Discussion**: The `@ToString` annotation generates a `toString()` method that includes the field names and values in the string representation.

**Takeaway**: Use `@ToString` to easily generate a human-readable representation of your object for debugging or logging purposes.

---

#### **Exercise 3 Solution**

```Java
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

public class App {
    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    static class Person {
        private String name;
        private int age;
    }

    public static void main(String[] args) {
        // No-argument constructor
        Person defaultPerson = new Person();
        System.out.println(defaultPerson); // Default values

        // All-argument constructor
        Person person = new Person("Bob", 40);
        System.out.println(person); // Values set through constructor
    }
}

```

**Expected Output**:

```
Person(name=null, age=0)
Person(name=Bob, age=40)

```

**Discussion**: The `@NoArgsConstructor` and `@AllArgsConstructor` annotations automatically generate constructors. One creates a no-argument constructor, while the other generates a constructor that takes all fields as parameters.

**Takeaway**: Lombok eliminates the need for manual constructor creation, especially in classes with many fields.

---

#### **Exercise 4 Solution**

```Java
import lombok.Builder;
import lombok.ToString;

public class App {
    @Builder
    @ToString
    static class Person {
        private String name;
        private int age;
    }

    public static void main(String[] args) {
        // Using the builder pattern
        Person person = Person.builder()
                              .name("Charlie")
                              .age(35)
                              .build();
        System.out.println(person); // Calls toString()
    }
}

```

**Expected Output**:

```
Person(name=Charlie, age=35)

```

**Discussion**: The `@Builder` annotation provides a fluent API to construct objects, offering flexibility when constructing objects with many parameters.

**Takeaway**: Use `@Builder` to make object creation more flexible and readable, especially for complex constructors.

---

#### **Exercise 5 Solution**

```Java
import lombok.Data;

public class App {
    @Data
    static class Person {
        private String name;
        private int age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("David");
        person.setAge(28);
        System.out.println(person); // Calls toString()
    }
}

```

**Expected Output**:

```
Person(name=David, age=28)

```

**Discussion**: The `@Data` annotation combines several annotations (`@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode`, and `@RequiredArgsConstructor`) to reduce boilerplate for data objects.

**Takeaway**: Use `@Data` for classes that primarily hold data to minimize manual code writing.

---

### **Exercise 6 Solution:**

```java
import lombok.extern.java.Log;

@Log
public class LoggerExample {
    public static void main(String[] args) {
        // Log messages at different levels
        log.info("This is an info message.");
        log.warning("This is a warning message.");
        log.severe("This is a severe error message.");
    }
}

```

**Expected Output**:

```
Oct 18, 2024 10:00:00 AM LoggerExample main
INFO: This is an info message.
Oct 18, 2024 10:00:00 AM LoggerExample main
WARNING: This is a warning message.
Oct 18, 2024 10:00:00 AM LoggerExample main
SEVERE: This is a severe error message.

```

**Discussion**: By using the `@Log` annotation from Lombok, a `java.util.logging.Logger` instance named `log` is automatically created. You can use this logger to log messages at various levels such as `info`, `warning`, and `severe`.

**Takeaway**: The `@Log` annotation reduces the need for manually creating a logger in your classes, making your code more concise and easier to maintain.
