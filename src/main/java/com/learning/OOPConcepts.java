package com.learning;

/**
 * Demonstrates Object-Oriented Programming concepts.
 * Includes classes, objects, inheritance, polymorphism, and encapsulation.
 */

// Base class demonstrating encapsulation
class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters and Setters (encapsulation)
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Method that can be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Inheritance: Dog extends Animal
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    // Polymorphism: Method overriding
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof! Woof!");
    }
    
    // Method overloading
    public void displayInfo(boolean showBreed) {
        super.displayInfo();
        if (showBreed) {
            System.out.println("Breed: " + breed);
        }
    }
}

// Inheritance: Cat extends Animal
class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    
    // Polymorphism: Method overriding
    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow!");
    }
    
    public boolean isIndoor() {
        return isIndoor;
    }
}

public class OOPConcepts {
    public static void main(String[] args) {
        System.out.println("=== Object-Oriented Programming Demo ===\n");
        
        // Create objects
        Animal animal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, true);
        
        // Demonstrate polymorphism through method calls
        System.out.println("Polymorphism Demo:");
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        
        System.out.println("\nObject Information:");
        animal.displayInfo();
        dog.displayInfo(true);
        cat.displayInfo();
        System.out.println("Is indoor cat: " + cat.isIndoor());
        
        // Polymorphism: parent reference to child object
        System.out.println("\nPolymorphism with parent reference:");
        Animal polymorphicDog = new Dog("Max", 4, "Labrador");
        polymorphicDog.makeSound(); // Calls Dog's overridden method
    }
}
