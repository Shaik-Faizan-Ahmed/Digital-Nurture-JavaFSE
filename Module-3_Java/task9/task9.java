// Task 9: Grade Calculator
// Objective: Use conditional statements to determine grades.

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks out of 100: ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else {
            char grade;
            String remark;

            if (marks >= 90) {
                grade = 'A';
                remark = "Excellent!";
            } else if (marks >= 80) {
                grade = 'B';
                remark = "Very Good!";
            } else if (marks >= 70) {
                grade = 'C';
                remark = "Good";
            } else if (marks >= 60) {
                grade = 'D';
                remark = "Satisfactory";
            } else {
                grade = 'F';
                remark = "Failed";
            }

            System.out.println("Marks  : " + marks);
            System.out.println("Grade  : " + grade);
            System.out.println("Remark : " + remark);
        }

        scanner.close();
    }
}
