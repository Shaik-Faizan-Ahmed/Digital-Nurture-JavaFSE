import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        double[] arr = new double[count];
        double sum = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }

        double average = sum / count;

        System.out.println("Sum     = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}
