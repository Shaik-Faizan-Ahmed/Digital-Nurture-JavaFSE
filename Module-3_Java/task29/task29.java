import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class task29 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 17),
            new Person("Charlie", 25),
            new Person("Diana", 15),
            new Person("Eve", 22)
        );

        System.out.println("All persons:");
        people.forEach(System.out::println);

        List<Person> adults = people.stream()
                .filter(p -> p.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("\nPersons aged 18 and above:");
        adults.forEach(System.out::println);
    }
}
