package com.learning;

/**
 * Demonstrates exception handling in Java.
 * Covers try-catch, finally, throw, and custom exceptions.
 */

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("=== Exception Handling Demo ===\n");
        
        // Basic try-catch
        System.out.println("1. Basic try-catch:");
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        
        // Multiple catch blocks
        System.out.println("\n2. Multiple catch blocks:");
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } catch (Exception e) {
            System.out.println("Caught generic exception");
        }
        
        // Try-catch-finally
        System.out.println("\n3. Try-catch-finally:");
        try {
            int[] array = new int[5];
            array[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } finally {
            System.out.println("Finally block always executes");
        }
        
        // Custom exception
        System.out.println("\n4. Custom exception:");
        try {
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
        
        // Try-with-resources (Java 7+)
        System.out.println("\n5. Try-with-resources:");
        try (AutoCloseableResource resource = new AutoCloseableResource()) {
            resource.doSomething();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Method that throws custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        if (age > 150) {
            throw new InvalidAgeException("Age cannot be greater than 150");
        }
        System.out.println("Age is valid: " + age);
    }
}

// Helper class for try-with-resources demo
class AutoCloseableResource implements AutoCloseable {
    public void doSomething() {
        System.out.println("Resource is being used");
    }
    
    @Override
    public void close() {
        System.out.println("Resource is being closed automatically");
    }
}
