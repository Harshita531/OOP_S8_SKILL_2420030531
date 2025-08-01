package SKILL2;
public class WrapperClassDemo {
    public static void main(String[] args) {
        int num = 10;
        char letter = 'A';
        double pi = 3.14;

       
        Integer numObj = Integer.valueOf(num);
        Character letterObj = Character.valueOf(letter);
        Double piObj = Double.valueOf(pi);

       
        Boolean status = true;
        int newNum = numObj.intValue();
        char newChar = letterObj.charValue();

        // Displaying values
        System.out.println("Integer Object: " + numObj);
        System.out.println("Character Object: " + letterObj);
        System.out.println("Double Object: " + piObj);
        System.out.println("Boolean Object: " + status);
        System.out.println("Unboxed Integer: " + newNum);
        System.out.println("Unboxed Character: " + newChar);
    }
}
