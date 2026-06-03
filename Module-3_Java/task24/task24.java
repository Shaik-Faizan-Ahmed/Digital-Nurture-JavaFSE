import java.util.ArrayList;
import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter student names (type 'done' to stop):");

        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }

        System.out.println("\nAll student names:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }

        scanner.close();
    }
}
