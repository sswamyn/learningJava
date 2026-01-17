# Java Learning Workspace

A comprehensive workspace to (re)learn Java and practice new constructs. This repository contains well-documented examples covering fundamental to modern Java concepts.

## 📚 Contents

### Core Java Concepts

1. **HelloWorld.java** - Basic Java syntax and program structure
2. **DataTypes.java** - Primitive data types and variables
3. **ControlFlow.java** - Control structures (if-else, switch, loops)
4. **OOPConcepts.java** - Object-Oriented Programming (classes, inheritance, polymorphism, encapsulation)
5. **CollectionsDemo.java** - Collections Framework and Generics (List, Set, Map)
6. **ExceptionHandling.java** - Exception handling patterns and custom exceptions
7. **ModernJavaFeatures.java** - Java 8+ features (lambdas, streams, Optional, functional interfaces)

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A text editor or IDE (VS Code, IntelliJ IDEA, Eclipse, etc.)

### Building the Project

#### On Linux/Mac:
```bash
./build.sh
```

#### On Windows:
```cmd
build.bat
```

#### Manual Build:
```bash
# Create output directory
mkdir -p bin

# Compile all Java files
javac -d bin src/main/java/com/learning/*.java
```

### Running Examples

After building, run any example using:

```bash
# Run Hello World
java -cp bin com.learning.HelloWorld

# Run Data Types demo
java -cp bin com.learning.DataTypes

# Run Control Flow demo
java -cp bin com.learning.ControlFlow

# Run OOP Concepts demo
java -cp bin com.learning.OOPConcepts

# Run Collections demo
java -cp bin com.learning.CollectionsDemo

# Run Exception Handling demo
java -cp bin com.learning.ExceptionHandling

# Run Modern Java Features demo
java -cp bin com.learning.ModernJavaFeatures
```

## 📖 Learning Path

### For Beginners:
1. Start with **HelloWorld.java** to understand basic structure
2. Learn about **DataTypes.java** to understand variables
3. Study **ControlFlow.java** for program flow control
4. Move to **OOPConcepts.java** for object-oriented programming
5. Explore **CollectionsDemo.java** for data structures

### For Intermediate Learners:
1. Review **ExceptionHandling.java** for error handling patterns
2. Study **ModernJavaFeatures.java** for Java 8+ features
3. Experiment with modifying the examples
4. Create your own programs combining multiple concepts

### Advanced Practice:
- Combine concepts from multiple files
- Add new features to existing examples
- Implement design patterns
- Create multi-file projects
- Add unit tests

## 🎯 Key Concepts Covered

- **Basics**: Syntax, data types, operators
- **Control Flow**: Conditionals, loops, switch statements
- **OOP**: Classes, objects, inheritance, polymorphism, encapsulation
- **Collections**: ArrayList, HashSet, HashMap, Generics
- **Exception Handling**: try-catch, custom exceptions, try-with-resources
- **Modern Java**: Lambda expressions, Stream API, Optional, functional interfaces

## 💡 Tips

- Each file is self-contained and can be studied independently
- Read the comments in the code for detailed explanations
- Try modifying the examples to see how they behave
- Experiment with different values and scenarios
- Use the Java documentation for deeper understanding

## 🔗 Resources

- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Java API Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/)

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details. 
