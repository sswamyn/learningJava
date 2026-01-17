import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GatheringCollectorsExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Grapes", "Pineapple");

        // Simple implementation of collecting to a List
        var mapped = items.stream()
                              .map(String::toUpperCase)
                              .collect(Collectors.toList());
        System.out.println("Mapped List: " + mapped);

/*
        // Collecting to a Set
        Set<String> collectedSet = items.stream()
                                        .collect(Collectors.toSet());
        System.out.println("Collected Set: " + collectedSet);

        // Counting elements
        long count = items.stream()
                          .collect(Collectors.counting());
        System.out.println("Count of elements: " + count);
*/
    }
}