// Task 8: Operator Precedence
// Objective: Explore how Java evaluates expressions.

public class task8 {
    public static void main(String[] args) {
        System.out.println("=== Operator Precedence in Java ===\n");

        // Expression 1: * before +
        int result1 = 10 + 5 * 2;
        System.out.println("Expression : 10 + 5 * 2");
        System.out.println("Result     : " + result1);
        System.out.println("Reason     : * has higher precedence than +, so 5*2=10 first, then 10+10=20\n");

        // Expression 2: parentheses override precedence
        int result2 = (10 + 5) * 2;
        System.out.println("Expression : (10 + 5) * 2");
        System.out.println("Result     : " + result2);
        System.out.println("Reason     : Parentheses override precedence, so (10+5)=15 first, then 15*2=30\n");

        // Expression 3: mixed arithmetic
        int result3 = 100 / 5 + 3 * 4 - 2;
        System.out.println("Expression : 100 / 5 + 3 * 4 - 2");
        System.out.println("Result     : " + result3);
        System.out.println("Reason     : / and * first (left to right): 100/5=20, 3*4=12, then 20+12-2=30\n");

        // Expression 4: modulus and multiplication
        int result4 = 10 + 15 % 4 * 2;
        System.out.println("Expression : 10 + 15 % 4 * 2");
        System.out.println("Result     : " + result4);
        System.out.println("Reason     : % and * same precedence (left to right): 15%4=3, 3*2=6, then 10+6=16\n");

        // Expression 5: unary negation
        int result5 = -2 + 8 / 4;
        System.out.println("Expression : -2 + 8 / 4");
        System.out.println("Result     : " + result5);
        System.out.println("Reason     : Unary minus applies to 2, then 8/4=2, then -2+2=0\n");

        // Precedence summary
        System.out.println("=== Precedence Order (High to Low) ===");
        System.out.println("1. ()              - Parentheses");
        System.out.println("2. ++ --           - Unary");
        System.out.println("3. * / %           - Multiplication, Division, Modulus");
        System.out.println("4. + -             - Addition, Subtraction");
        System.out.println("5. < > <= >=       - Relational");
        System.out.println("6. == !=           - Equality");
        System.out.println("7. &&              - Logical AND");
        System.out.println("8. ||              - Logical OR");
        System.out.println("9. =  +=  -= etc.  - Assignment");
    }
}
