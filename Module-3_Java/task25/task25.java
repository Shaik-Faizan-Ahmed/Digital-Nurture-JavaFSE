import java.util.HashMap;
import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.println("Enter student records (type 0 to stop adding):");

        while (true) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            if (id == 0) break;
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("\nEnter student ID to search: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student found: " + studentMap.get(searchId));
        } else {
            System.out.println("No student found with ID " + searchId);
        }

        scanner.close();
    }
}
