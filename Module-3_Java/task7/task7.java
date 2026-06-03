// Task 7: Type Casting Example
// Objective: Practice type casting between different data types.

public class task7 {
    public static void main(String[] args) {
        // double to int (explicit/narrowing cast)
        double myDouble = 9.99;
        int castedToInt = (int) myDouble;
        System.out.println("=== double to int ===");
        System.out.println("Original double value : " + myDouble);
        System.out.println("After casting to int  : " + castedToInt);
        System.out.println("(Note: decimal part is truncated, not rounded)");

        System.out.println();

        // int to double (implicit/widening cast)
        int myInt = 25;
        double castedToDouble = myInt;  // implicit widening
        System.out.println("=== int to double ===");
        System.out.println("Original int value      : " + myInt);
        System.out.println("After casting to double : " + castedToDouble);

        System.out.println();

        // Additional: char to int and int to char
        char myChar = 'A';
        int charToInt = myChar;
        System.out.println("=== char to int ===");
        System.out.println("Original char value : " + myChar);
        System.out.println("ASCII int value     : " + charToInt);

        int intVal = 66;
        char intToChar = (char) intVal;
        System.out.println("\n=== int to char ===");
        System.out.println("Original int value : " + intVal);
        System.out.println("Casted to char     : " + intToChar);
    }
}
