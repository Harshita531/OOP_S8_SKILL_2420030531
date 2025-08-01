package SKILL2;
public class TypeConversionDemo {
    public static void main(String[] args) {

      
        int intVal = 100;
        double doubleVal = intVal;  
        System.out.println("Widening Conversion (int to double): " + doubleVal);

       
        double d = 9.78;
        int i = (int) d;  
        System.out.println("Narrowing Conversion (double to int): " + i);

        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("String to int: " + num);
        String strVal = String.valueOf(num);
        System.out.println("int to String: " + strVal);
    }
}
