
public class StreamLearning {
    public static void main(String[] args) {
        // Example usage of Java Streams for learning purposes
        // streaming a list of integers
        var ints = java.util.List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var stream = ints.stream();
        stream.filter(i -> i % 2 == 0) // filter even numbers
              .forEach(System.out::println);
        // Similarly, we can do it with arrays
        int[] numbers = {1, 2, 3, 4, 5};

        String aString = """
                This is a text block
                that spans multiple lines
                in Java.""";
        
        // Streaming letters with an IntStream
        java.util.stream.IntStream letters = aString.chars();
        letters.limit(10).forEach(c -> System.out.println((char) c));
        System.out.println("--- the first 10 letters ---");

        // Similarly, we can do loop through the lines of the text block
        java.util.stream.Stream<String> lines = aString.lines();
        // Print each line prefixed with line number
        final int[] lineNumber = {1};
        lines.forEach(line -> {
            System.out.println(lineNumber[0] + ": " + line);
            lineNumber[0]++;
        });

        // Streaming a text file 
        try (var reader = java.nio.file.Files.newBufferedReader(java.nio.file.Paths.get("StreamLearning.java"))) {
            java.util.stream.Stream<String> fileLines = reader.lines();
            fileLines.limit(5).forEach(System.out::println); // print first 5 lines of the file
            System.out.println("--- first 5 lines of the file ---");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // Streaming a regular expression
        String text = "apple, banana; orange. grape! mango?blackberry kiwi";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("[,;.!?\\s]+");
        java.util.stream.Stream<String> words = pattern.splitAsStream(text);
        words.forEach(System.out::println);
        System.out.println("--- words from the text ---");
        
        // Streaming ramdom numbers
        //new java.util.Random(314L).ints(0, 100).limit(10).boxed();
        java.util.stream.IntStream randomNumbers = new java.util.Random(314L).ints(0, 100);
        randomNumbers.limit(8).forEach(System.out::println);
        System.out.println("--- 8 random numbers between 0 and 100 ---");

        // Alternative examples of the above using Stream<Integer> instead of IntStream
        java.util.stream.Stream<Integer> randomInts = new java.util.Random(314L).ints(0, 100).boxed();
        randomInts.limit(4).forEach(System.out::println);
        System.out.println("--- 4 random numbers between 0 and 100 ---");
        /*

        // Using streams to filter and print even numbers
        System.out.println("Even numbers:");
        java.util.Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // Using streams to calculate the sum of all numbers
        int sum = java.util.Arrays.stream(numbers)
                .sum();
        System.out.println("Sum of all numbers: " + sum);
        */
    }
}