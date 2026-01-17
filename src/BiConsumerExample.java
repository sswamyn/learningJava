import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        // Using BiConsumer with Map.forEach()
        BiConsumer<String, Integer> printEntry = (name, age) -> 
            System.out.println(name + " is " + age + " years old.");
        
        ages.forEach(printEntry);

        // Another example: modifying a Person object
        class Person {
            String firstName;
            String lastName;

            public Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            @Override
            public String toString() {
                return firstName + " " + lastName;
            }
        }

        Person person = new Person("John", "Doe");
        BiConsumer<Person, String> updateLastName = (p, newLastName) -> p.setLastName(newLastName);
        
        updateLastName.accept(person, "Smith");
        System.out.println("Updated person: " + person);
    }
}
