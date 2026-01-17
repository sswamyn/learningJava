

public class StreamDoNotUseExample {
    public static void main(String[] args) {
        // Example of using Stream API in Java
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie", "David");

        java.util.List<String> newNames = new java.util.ArrayList<String>();
        // Using Stream API to filter and print names starting with 'C'
        var count = names.stream()
             .peek(name -> newNames.add(name))
             .count();

        System.out.println("Names: " + newNames); // This will be an Empty List!! 
        System.out.println("Total names (count): " + count);  
      
    }
}   