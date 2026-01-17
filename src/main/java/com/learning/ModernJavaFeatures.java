package com.learning;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * Demonstrates modern Java features introduced in Java 8 and later.
 * Covers lambdas, streams, Optional, and functional interfaces.
 */
public class ModernJavaFeatures {
    public static void main(String[] args) {
        System.out.println("=== Modern Java Features Demo ===\n");
        
        // Lambda expressions
        System.out.println("1. Lambda Expressions:");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Traditional way
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        
        // Lambda way
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted names: " + names);
        
        // Functional interfaces
        System.out.println("\n2. Functional Interfaces:");
        
        // Predicate - tests a condition
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 5 even? " + isEven.test(5));
        
        // Function - transforms input to output
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));
        
        // Consumer - accepts input, returns nothing
        Consumer<String> printer = s -> System.out.println("Processing: " + s);
        printer.accept("Lambda");
        
        // Supplier - takes no input, returns output
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());
        
        // Stream API
        System.out.println("\n3. Stream API:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filter, map, and collect
        List<Integer> evenSquares = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("Even number squares: " + evenSquares);
        
        // Sum using reduce
        int sum = numbers.stream()
            .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers: " + sum);
        
        // Count elements
        long count = numbers.stream()
            .filter(n -> n > 5)
            .count();
        System.out.println("Numbers greater than 5: " + count);
        
        // Optional
        System.out.println("\n4. Optional:");
        Optional<String> optional = Optional.of("Hello");
        System.out.println("Optional value: " + optional.get());
        System.out.println("Is present: " + optional.isPresent());
        
        Optional<String> empty = Optional.empty();
        System.out.println("Empty optional: " + empty.orElse("Default Value"));
        
        // Method references
        System.out.println("\n5. Method References:");
        names.forEach(System.out::println);
        
        // Parallel streams
        System.out.println("\n6. Parallel Stream:");
        long parallelSum = IntStream.range(1, 100)
            .parallel()
            .sum();
        System.out.println("Parallel sum (1-99): " + parallelSum);
    }
}
