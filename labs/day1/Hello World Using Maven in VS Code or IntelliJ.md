### "Hello World" Using Maven in VS Code or IntelliJ

#### Objective:

Create a simple Java application that prints "Hello, World!" to the console. The project will be managed using **Maven** for build automation, and **Visual Studio Code (VS Code)** will be the Integrated Development Environment (IDE).

---

### Prerequisites:

Before starting the exercise, ensure the following software is installed and configured:

1.  **Java Development Kit (JDK)**: Version 8 or higher.
    - Verify installation by running `java -version` in the terminal.
2.  **Maven**: Build automation tool for Java projects.
    - Verify installation by running `mvn -version` in the terminal.
3.  **Visual Studio Code (VS Code)**: The text editor/IDE.
4.  **Maven for Java Extension in VS Code**: Install the "Maven for Java" extension from the VS Code marketplace.
5.  **Java Extension Pack for VS Code**: Install the "Java Extension Pack" for enhanced Java development support.

---

### Step-by-Step Instructions:

#### 1\. **Create a Maven Project**

- Open **VS Code**.
- Open the integrated terminal in VS Code by pressing `Ctrl + ~` (Windows/Linux) or `Cmd + ~` (Mac).

Run the following Maven command to generate a new Maven project:

```
mvn archetype:generate -DgroupId=com.example -DartifactId=hello-world -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

```

- The `groupId` is a unique identifier for your project, typically structured as a reverse domain (e.g., `com.example`).
- The `artifactId` is the name of your project (`hello-world-app` in this case).
- This command will create a new Maven project with the default directory structure and a basic Java project setup.

#### 2\. **Open the Project in VS Code**

- Once the project is generated, open the project folder in VS Code by navigating to `File > Open Folder` and selecting the project root folder (`hello-world-app`).

#### 3\. **Understand the Maven Project Structure**

- In the **Explorer** pane of VS Code, you will see the following folder structure:

```
hello-world-app/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── helloworld/
│                       └── App.java
├── pom.xml
└── README.md

```

- `App.java`: This is the default Java file where you will write your "Hello World" program.
- `pom.xml`: The Maven configuration file for dependencies and build settings.

#### 4\. **Modify the `App.java` File**

- Navigate to `src/main/java/com/example/helloworld/App.java` and open it.
- Replace the contents of the `App.java` file with the following code:

```
package com.example.helloworld;

/**
 * A simple Hello World program.
 */
public class App {
    public static void main(String[] args) {
        // Print Hello World message to the console
        System.out.println("Hello, World!");
    }
}

```

#### 5\. **Configure VS Code for Maven**

- VS Code will automatically detect the Maven project. If prompted to install the Java-related extensions, go ahead and install them.
- Make sure the Java language support extension is running. You can see this in the bottom bar (it should say "Java" when hovering over the extension).

#### 6\. **Build the Maven Project**

- Open the integrated terminal (`Ctrl + ~` or `Cmd + ~`) and run the following command to build the Maven project:

```
mvn clean install

```

- This command will compile the Java code, run tests (if any), and package the application.

#### 7\. **Run the Application**

- After the build is successful, you can run the application. There are two options for running it:

##### Option 1: Run using the Maven command

In the terminal, run the following Maven command:

```
mvn exec:java -Dexec.mainClass="com.example.helloworld.App"

```

##### Option 2: Run using VS Code

- Go to the `App.java` file, right-click anywhere in the `main` method, and select **Run Java**. VS Code will execute the program, and you should see `Hello, World!` printed in the terminal.

#### 8\. **Explore and Clean Up**

- **Explore Maven Lifecycle**: Use VS Code’s Maven extension to explore Maven goals like `clean`, `compile`, `test`, `package`, etc.

  - In the left panel, click on the **Maven Projects** view to explore and execute goals like `package` or `clean`.

- **Clean Up the Project**: After running the project, you can clean it up by running:

```
mvn clean

```

This removes all compiled files and directories, such as the `target/` folder.

---

### Additional Challenges:

1.  **Add a Dependency**: In the `pom.xml` file, add a dependency (e.g., JUnit for testing) and demonstrate how Maven automatically resolves and includes the dependency.
2.  **Create a Test Class**: Write a basic JUnit test case to test the `App` class.

---

### Expected Output:

When you successfully run the application, the terminal should display the message:

```
Hello, World!

```

---

### Troubleshooting:

- **Maven Build Errors**: If the build fails, check the terminal for errors. Verify that you have the correct JDK and Maven versions installed.
- **VS Code Extensions**: Ensure that the "Maven for Java" and "Java Extension Pack" extensions are installed and active in VS Code.
- **Java Version**: Ensure that the correct Java version is selected in VS Code by opening the **Command Palette** (`Ctrl + Shift + P` or `Cmd + Shift + P`) and typing `Java: Configure Java Runtime`.
