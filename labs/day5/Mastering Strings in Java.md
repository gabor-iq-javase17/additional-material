### ava SE 17 Hands-on Lab: Mastering Strings in Java

#### **Introduction**

In this lab, you will explore various aspects of working with strings in Java. Strings are essential in many applications, from manipulating text to parsing and comparing data. You will practice string manipulation, parsing, comparisons, regular expressions, and more. Each exercise introduces a new concept and includes expected output and solutions.

---

### **Lab Requirements:**

- **Language**: Java
- **Tools**: Maven, Java 17, IDE (e.g., IntelliJ, Eclipse, VS Code)
- **Time**: 1 hour
- **Prerequisites**: Basic knowledge of Java, object-oriented programming and Maven.

---

### **Exercise 1: Manipulating Strings**

**Objective**: Practice basic string manipulations such as concatenation, substring extraction, and case conversion.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Define a string variable and perform the following operations:
    - Concatenate two strings.
    - Extract a substring.
    - Convert the string to uppercase and lowercase.
4.  **Step 4**: Display the results.

**Expected Output**:

- Concatenated result.
- Extracted substring.
- Uppercase and lowercase conversions.

---

### **Exercise 2: Parsing Strings**

**Objective**: Learn how to parse strings to extract meaningful information.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Define a comma-separated string (e.g., `"John,25,Engineer"`).
4.  **Step 4**: Parse the string using `split()` to extract individual fields.
5.  **Step 5**: Display the extracted fields.

**Expected Output**:

- Parsed fields such as name, age, and profession.

---

### **Exercise 3: Comparing Strings**

**Objective**: Learn how to compare strings using `equals()` and `compareTo()`.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Define two strings and compare them:
    - Using `equals()` to check for equality.
    - Using `compareTo()` to compare lexicographically.
4.  **Step 4**: Display the results of the comparisons.

**Expected Output**:

- Results of `equals()` and `compareTo()` comparisons.

---

### **Exercise 4: Demonstrating String Interning**

**Objective**: Demonstrate string interning and how it affects memory usage.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Create two string variables: one using string literals and the other using the `new` keyword.
4.  **Step 4**: Compare the two strings using `==` and `equals()`.
5.  **Step 5**: Use the `intern()` method and compare the results.

**Expected Output**:

- Demonstration of how string interning affects memory and object identity.

---

### **Exercise 5: Using Regular Expressions for Email Validation**

**Objective**: Use regular expressions to validate email addresses.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Define a regular expression pattern for email validation.
4.  **Step 4**: Use `Pattern` and `Matcher` to validate sample email addresses.
5.  **Step 5**: Display whether each email address is valid or not.

**Expected Output**:

- Validation results for various email addresses.

---

### **Exercise 6: Reversing a String**

**Objective**: Practice reversing a string using a loop.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Define a string and implement a loop to reverse it.
4.  **Step 4**: Display the reversed string.

**Expected Output**:

- Reversed string.

---

### **Exercise 7: Finding Substrings**

**Objective**: Find the occurrences of a substring within a string.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Define a string and a substring to search for.
4.  **Step 4**: Use `indexOf()` and `lastIndexOf()` to find the substring’s occurrences.
5.  **Step 5**: Display the positions where the substring appears.

**Expected Output**:

- Positions of the substring in the string.

---

### **Exercise 8: Splitting Strings by Multiple Delimiters**

**Objective**: Split a string using multiple delimiters with regular expressions.

1.  **Step 1**: Create a new Maven project.
2.  **Step 2**: Create a class `App` with a `main` method.
3.  **Step 3**: Define a string that contains multiple delimiters (e.g., spaces, commas, and semicolons).
4.  **Step 4**: Use `split()` with a regular expression to split the string by multiple delimiters.
5.  **Step 5**: Display the resulting tokens.

**Expected Output**:

- Tokens extracted from the string.

---

**Done :-)**

If you have completed all the exercises successfully, please raise your hand, so the team will see your status, or share your code with the instructor for review.

---

### **Solutions**

---

### **Exercise 1 Solution: Manipulating Strings**

```Java
public class App {
    public static void main(String[] args) {
        // String manipulation
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated: " + concatenated);

        // Substring
        String substring = concatenated.substring(6, 11);
        System.out.println("Substring: " + substring);

        // Uppercase and Lowercase
        System.out.println("Uppercase: " + concatenated.toUpperCase());
        System.out.println("Lowercase: " + concatenated.toLowerCase());
    }
}

```

**Expected Output**:

```
Concatenated: Hello World
Substring: World
Uppercase: HELLO WORLD
Lowercase: hello world

```

---

### **Exercise 2 Solution: Parsing Strings**

```Java
public class App {
    public static void main(String[] args) {
        // Comma-separated string
        String data = "John,25,Engineer";

        // Split the string
        String[] fields = data.split(",");

        // Display the parsed fields
        System.out.println("Name: " + fields[0]);
        System.out.println("Age: " + fields[1]);
        System.out.println("Profession: " + fields[2]);
    }
}

```

**Expected Output**:

```
Name: John
Age: 25
Profession: Engineer

```

---

### **Exercise 3 Solution: Comparing Strings**

```Java
public class App {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        // Compare strings using equals()
        System.out.println("Equals: " + str1.equals(str2));

        // Compare strings using compareTo()
        System.out.println("CompareTo: " + str1.compareTo(str2));
    }
}

```

**Expected Output**:

```
Equals: false
CompareTo: -1

```

---

### **Exercise 4 Solution: Demonstrating String Interning**

```Java
public class App {
    public static void main(String[] args) {
        String literalStr = "Java";
        String newStr = new String("Java");

        // Using == and equals() before interning
        System.out.println("Using ==: " + (literalStr == newStr)); // false
        System.out.println("Using equals(): " + literalStr.equals(newStr)); // true

        // Interning the newStr
        newStr = newStr.intern();

        // Using == after interning
        System.out.println("After interning, using ==: " + (literalStr == newStr)); // true
    }
}

```

**Expected Output**:

```
Using ==: false
Using equals(): true
After interning, using ==: true

```

---

### **Exercise 5 Solution: Using Regular Expressions for Email Validation**

```Java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) {
        String[] emails = { "test@example.com", "invalid-email", "user@domain.org" };

        // Email validation regex
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailPattern);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " is valid: " + matcher.matches());
        }
    }
}

```

**Expected Output**:

```
test@example.com is valid: true
invalid-email is valid: false
user@domain.org is valid: true

```

---

### **Exercise 6 Solution: Reversing a String**

```Java
public class App {
    public static void main(String[] args) {
        String original = "Java Programming";
        StringBuilder reversed = new StringBuilder();

        // Loop to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }

        // Display reversed string
        System.out.println("Reversed: " + reversed.toString());
    }
}

```

**Expected Output**:

```
Reversed: gnimmargorP avaJ

```

---

### **Exercise 7 Solution: Finding Substrings**

```Java
public class App {
    public static void main(String[] args) {
        String str = "Java Programming is fun";
        String substring = "Programming";

        // Finding substring positions
        int firstIndex = str.indexOf(substring);
        int lastIndex = str.lastIndexOf(substring);

        // Display positions
        System.out.println("First occurrence: " + firstIndex);
        System.out.println("Last occurrence: " + lastIndex);
    }
}

```

**Expected Output**:

```
First occurrence: 5
Last occurrence: 5

```

---

### **Exercise 8 Solution: Splitting Strings by Multiple Delimiters**

```Java
public class App {
    public static void main(String[] args) {
        String data = "Java,Python;C++ Ruby";

        // Split the string by spaces, commas, or semicolons
        String[] tokens = data.split("[,;\\s]+");

        // Display the tokens
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

```

**Expected Output**:

```
Java
Python
C++
Ruby

```

---

### **Conclusion**

This lab demonstrates various techniques for working with strings in Java, including manipulation, parsing, comparison, string interning, regular expressions, and more. Mastering these string operations will help you efficiently process text in Java programs.
