// Task 6: Data Type Demonstration
// Objective: Understand Java's primitive data types.

public class task6 {
    public static void main(String[] args) {
        int myInt = 42;
        float myFloat = 3.14f;
        double myDouble = 2.718281828;
        char myChar = 'J';
        boolean myBoolean = true;

        System.out.println("=== Java Primitive Data Types ===");
        System.out.println("int     : " + myInt);
        System.out.println("float   : " + myFloat);
        System.out.println("double  : " + myDouble);
        System.out.println("char    : " + myChar);
        System.out.println("boolean : " + myBoolean);

        System.out.println("\n=== Size of each type ===");
        System.out.println("int     size: " + Integer.SIZE + " bits");
        System.out.println("float   size: " + Float.SIZE + " bits");
        System.out.println("double  size: " + Double.SIZE + " bits");
        System.out.println("char    size: " + Character.SIZE + " bits");
    }
}
