package SKILL2;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("Is a > b? " + (a > b));
        System.out.println("Is a == b? " + (a == b));

        
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        int c = 5;
        c += 3;
        System.out.println("c after += 3: " + c);
        int d = 7;
        System.out.println("Original d: " + d);
        System.out.println("Post-increment d++: " + (d++));
        System.out.println("After Post-increment: " + d);
        System.out.println("Pre-increment ++d: " + (++d));
    }
}
