import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsExample {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");

        // Collecting to a List
        System.out.println("--- Collecting to List and Set ---");
        List<String> collectedList = numbers.stream()
                                            .collect(Collectors.toList());
        System.out.println("Collected List: " + collectedList);

        // Collecting to a Set
        Set<String> collectedSet = numbers.stream()
                                          .collect(Collectors.toSet());
        System.out.println("Collected Set: " + collectedSet);

        // Joining Strings
        // Join also allows specifying a delimiter, prefix, and suffix
        System.out.println("--- Joining Strings ---");
        String joinedString = numbers.stream()
                                     .collect(Collectors.joining(" -- "));
        System.out.println("Joined String: " + joinedString);

        // Collectors GroupBy
        System.out.println("--- Grouping by length ---");
        Map<Integer, List<String>> groupedByLength = numbers.stream()
                                                            .collect(Collectors.groupingBy(String::length));
        groupedByLength.forEach((length, strs) -> 
            System.out.println("Length " + length + ": " + strs)
        );

        // Collectors PartitioningBy
        System.out.println("--- Partitioning by length > 3 ---");
        Map<Boolean, List<String>> partitionedByLength = numbers.stream()
                                                                .collect(Collectors.partitioningBy(s -> s.length() > 3));
        partitionedByLength.forEach((isLongerThan3, strs) -> 
            System.out.println((isLongerThan3 ? "Longer than 3: " : "3 or shorter: ") + strs)
        );

    }
}