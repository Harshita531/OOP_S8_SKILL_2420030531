package SKILL1;
public class StudentDashboard {
    public static void main(String[] args) {

        
        long rollNumber = 2025001234L;
        String name = "Harshita Chowdary";
        float marks = 87.5f;
        char gender = 'F';
        boolean isPass = true;

       
        System.out.println("======= Student Summary Slip =======");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks + " / 100");
        System.out.println("Gender      : " + gender);
        System.out.println("Result      : " + (isPass ? "Pass" : "Fail"));
        System.out.println("====================================");
    }
}
