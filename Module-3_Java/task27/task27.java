import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task27 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Banana", "Apple", "Mango", "Cherry", "Date");

        System.out.println("Before sorting: " + names);

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("After sorting : " + names);
    }
}
