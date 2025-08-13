package SKILL2;
public class WrapperDemo {
    public static void main(String[] args) {
        // Primitive types
        int num = 10;
        double d = 20.5;

        // Boxing: Converting primitive to wrapper object
        Integer numObj = Integer.valueOf(num); // Explicit boxing
        Double dObj = d; // Auto-boxing

        // Unboxing: Converting wrapper object to primitive
        int num2 = numObj.intValue(); // Explicit unboxing
        double d2 = dObj; // Auto-unboxing

        // Using Wrapper class methods
        String numStr = numObj.toString(); // Convert to String
        int parsedInt = Integer.parseInt("123"); // String to int

        System.out.println("Primitive int: " + num);
        System.out.println("Wrapper Integer: " + numObj);
        System.out.println("Unboxed int: " + num2);
        System.out.println("Wrapper methods example: String -> int : " + parsedInt);
    }
}
