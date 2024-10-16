### **Hands-On Lab: Understanding Deep Copy vs Shallow Copy in Java**

#### **Objective:**

In this lab, you will explore the difference between shallow copying and deep copying in Java by implementing and demonstrating both techniques in a simple program. By the end of this lab, you will understand when to use each approach and the impact it has on object references.

#### **Lab Requirements:**

- **Language**: Java
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming, and cloning.

### Hint:

- Use the code snippets provided in the lab description, **but please first try to solve the exercises on your own.**

---

### **Lab Setup**:

1.  Create a new Java project in your IDE (e.g., IntelliJ, Eclipse, VS Code, etc.).
2.  Ensure your project is configured to use Java 17.
3.  Add a new class `App.java` in the `src` folder.

---

### **Exercise 1: Demonstrate Shallow Copy**

**Objective**: Create a class that demonstrates shallow copying and the issues that arise when dealing with references to mutable objects.

#### Steps:

1.  Create a class `Person` with two attributes: `name` (String) and `address` (a custom object).
2.  Implement a shallow copy constructor and a `clone()` method using the `clone()` method of the `Object` class.
3.  Modify the cloned object’s properties and observe the changes.

#### Code Example:

```java
class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person original = new Person("John", address);

        // Shallow copy
        Person shallowCopy = (Person) original.clone();

        System.out.println("Original address: " + original.address.city);
        System.out.println("Shallow copy address: " + shallowCopy.address.city);

        // Modify the address in shallowCopy
        shallowCopy.address.city = "Los Angeles";

        System.out.println("\nAfter modifying shallow copy's address:");
        System.out.println("Original address: " + original.address.city); // Affected due to shallow copy
        System.out.println("Shallow copy address: " + shallowCopy.address.city);
    }
}

```

**Expected Output**:

```bash
Original address: New York
Shallow copy address: New York

After modifying shallow copy's address:
Original address: Los Angeles
Shallow copy address: Los Angeles

```

---

### **Exercise 2: Demonstrate Deep Copy**

**Objective**: Create a deep copy version of the `Person` class where modifying the copied object does not affect the original object.

#### Steps:

1.  Modify the `Person` class to implement a deep copy method.
2.  In the deep copy constructor or `clone()` method, create a new `Address` object for the copy instead of sharing the reference.
3.  Demonstrate that changes to the deep copy do not affect the original object.

#### Code Example:

```java
class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    // Deep copy constructor
    public Address(Address address) {
        this.city = address.city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person deepCopy = (Person) super.clone();
        deepCopy.address = new Address(this.address); // Deep copy of Address
        return deepCopy;
    }
}

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person original = new Person("John", address);

        // Deep copy
        Person deepCopy = (Person) original.clone();

        System.out.println("Original address: " + original.address.city);
        System.out.println("Deep copy address: " + deepCopy.address.city);

        // Modify the address in deepCopy
        deepCopy.address.city = "Los Angeles";

        System.out.println("\nAfter modifying deep copy's address:");
        System.out.println("Original address: " + original.address.city); // Not affected due to deep copy
        System.out.println("Deep copy address: " + deepCopy.address.city);
    }
}

```

**Expected Output**:

```bash
Original address: New York
Deep copy address: New York

After modifying deep copy's address:
Original address: New York
Deep copy address: Los Angeles

```

---

### **Summary**:

- **Shallow Copy**: Copies the object but **shares references** to the original object's mutable fields (like arrays or objects). Changes to the copied object affect the original object.
- **Deep Copy**: Copies the object and also **creates new copies** of any mutable objects that the original object holds references to. Changes to the copied object do **not** affect the original object.

#### **Done :-)**

If you have completed all the exercises successfully, **please raise your hand**, so the team will know your status. In case you are using the `team-review` repo (which is optional), do not forget commit then push your changes to the remote repository.
