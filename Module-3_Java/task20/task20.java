import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int a = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. " + e.getMessage());
        }

        scanner.close();
    }
}
