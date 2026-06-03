// Task 10: Number Guessing Game
// Objective: Implement loops and conditional logic.

import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1; // 1 to 100
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Try to guess it!\n");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too Low! Try higher.\n");
            } else if (guess > targetNumber) {
                System.out.println("Too High! Try lower.\n");
            } else {
                System.out.println("Correct! You guessed the number " + targetNumber + " in " + attempts + " attempt(s).");
                break;
            }
        }

        scanner.close();
    }
}
