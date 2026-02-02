package com.learning;

/**
 * Demonstrates Java's primitive data types and variables.
 * Shows the different types available and their basic usage.
 */
public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        
        char charVar = 'A';
        boolean boolVar = true;
        
        // String is not a primitive type but a class
        String stringVar = "Hello, Java!";
        
        // Display all variables
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + boolVar);
        System.out.println("String: " + stringVar);
    }
}
