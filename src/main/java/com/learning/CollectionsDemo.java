package com.learning;

import java.util.*;

/**
 * Demonstrates Java Collections Framework and Generics.
 * Covers List, Set, Map, and generic types.
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        System.out.println("=== Collections and Generics Demo ===\n");
        
        // ArrayList - ordered, allows duplicates
        System.out.println("ArrayList Demo:");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate allowed
        System.out.println("Fruits list: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        
        // HashSet - unordered, no duplicates
        System.out.println("\nHashSet Demo:");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate not added
        System.out.println("Numbers set: " + numbers);
        System.out.println("Set size: " + numbers.size());
        
        // HashMap - key-value pairs
        System.out.println("\nHashMap Demo:");
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        System.out.println("Ages map: " + ages);
        System.out.println("Bob's age: " + ages.get("Bob"));
        
        // Iterating through collections
        System.out.println("\nIterating through ArrayList:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        System.out.println("\nIterating through HashMap:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old");
        }
        
        // Generic method demo
        System.out.println("\nGeneric Method Demo:");
        String[] stringArray = {"Java", "Python", "JavaScript"};
        Integer[] intArray = {1, 2, 3, 4, 5};
        
        printArray(stringArray);
        printArray(intArray);
    }
    
    // Generic method that works with any type
    public static <T> void printArray(T[] array) {
        System.out.print("Array elements: ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
