package SKILL2;
public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b) && (b > 0): " + ((a > b) && (b > 0)));
        System.out.println("(a < b) || (b > 0): " + ((a < b) || (b > 0)));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("x += 3: " + x);
        x *= 2; // x = x * 2
        System.out.println("x *= 2: " + x);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int y = 7;
        System.out.println("y++: " + (y++));
        System.out.println("After y++: " + y);
        System.out.println("++y: " + (++y));
    }
}
