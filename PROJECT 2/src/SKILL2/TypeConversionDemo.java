package SKILL2;
public class TypeConversionDemo {
    public static void main(String[] args) {
        // Implicit type conversion (Widening)
        int intVal = 100;
        double doubleVal = intVal; // int -> double
        System.out.println("Implicit Conversion (int to double): " + doubleVal);

        // Explicit type conversion (Narrowing)
        double d = 99.99;
        int i = (int) d; // double -> int (data loss possible)
        System.out.println("Explicit Conversion (double to int): " + i);

        // String to numeric conversion
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("String to int: " + num);

        // Numeric to String conversion
        String numStr = String.valueOf(num);
        System.out.println("Int to String: " + numStr);
    }
}
