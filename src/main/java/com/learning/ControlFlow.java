package com.learning;

/**
 * Demonstrates control flow statements in Java.
 * Covers if-else, switch, for, while, and do-while loops.
 */
public class ControlFlow {
    public static void main(String[] args) {
        // If-else statement
        int number = 10;
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }
        
        // Switch statement
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the work week");
                break;
            case "Friday":
                System.out.println("End of the work week");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day");
        }
        
        // For loop
        System.out.println("\nFor loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // While loop
        System.out.println("\nWhile loop:");
        int count = 1;
        while (count <= 3) {
            System.out.println("While count: " + count);
            count++;
        }
        
        // Do-while loop
        System.out.println("\nDo-while loop:");
        int doCount = 1;
        do {
            System.out.println("Do-while count: " + doCount);
            doCount++;
        } while (doCount <= 3);
    }
}
