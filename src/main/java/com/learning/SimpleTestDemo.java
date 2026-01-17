package com.learning;

/**
 * Simple testing demonstration without external dependencies.
 * Shows how to write basic tests using assertions.
 * 
 * Note: For production code, use JUnit or TestNG frameworks.
 * This is a simplified example for learning purposes.
 */
public class SimpleTestDemo {
    
    private static int testsRun = 0;
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
    public static void main(String[] args) {
        System.out.println("=== Running Simple Tests ===\n");
        
        // Test Calculator class
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testDivisionByZero();
        testIsEven();
        
        // Print summary
        System.out.println("\n=== Test Summary ===");
        System.out.println("Tests run: " + testsRun);
        System.out.println("Tests passed: " + testsPassed);
        System.out.println("Tests failed: " + testsFailed);
        
        if (testsFailed == 0) {
            System.out.println("\n✓ All tests passed!");
        } else {
            System.out.println("\n✗ Some tests failed!");
        }
    }
    
    private static void testAddition() {
        testsRun++;
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        if (result == 8) {
            testsPassed++;
            System.out.println("✓ testAddition passed");
        } else {
            testsFailed++;
            System.out.println("✗ testAddition failed: expected 8, got " + result);
        }
    }
    
    private static void testSubtraction() {
        testsRun++;
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 4);
        if (result == 6) {
            testsPassed++;
            System.out.println("✓ testSubtraction passed");
        } else {
            testsFailed++;
            System.out.println("✗ testSubtraction failed: expected 6, got " + result);
        }
    }
    
    private static void testMultiplication() {
        testsRun++;
        Calculator calc = new Calculator();
        int result = calc.multiply(6, 7);
        if (result == 42) {
            testsPassed++;
            System.out.println("✓ testMultiplication passed");
        } else {
            testsFailed++;
            System.out.println("✗ testMultiplication failed: expected 42, got " + result);
        }
    }
    
    private static void testDivision() {
        testsRun++;
        Calculator calc = new Calculator();
        double result = calc.divide(20, 4);
        if (result == 5.0) {
            testsPassed++;
            System.out.println("✓ testDivision passed");
        } else {
            testsFailed++;
            System.out.println("✗ testDivision failed: expected 5.0, got " + result);
        }
    }
    
    private static void testDivisionByZero() {
        testsRun++;
        Calculator calc = new Calculator();
        try {
            calc.divide(10, 0);
            testsFailed++;
            System.out.println("✗ testDivisionByZero failed: expected exception but none was thrown");
        } catch (ArithmeticException e) {
            testsPassed++;
            System.out.println("✓ testDivisionByZero passed (exception caught correctly)");
        }
    }
    
    private static void testIsEven() {
        testsRun++;
        Calculator calc = new Calculator();
        boolean result1 = calc.isEven(8);
        boolean result2 = calc.isEven(7);
        if (result1 == true && result2 == false) {
            testsPassed++;
            System.out.println("✓ testIsEven passed");
        } else {
            testsFailed++;
            System.out.println("✗ testIsEven failed");
        }
    }
}
