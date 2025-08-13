package SKILL1;
public class StudentDashboard {
    public static void main(String[] args) {
        
        // Student details
        long rollNumber = 2025001234L;  // large enough for big institutions
        String name = "John Doe";       // names are strings of text
        float marks = 87.5f;            // marks with decimal
        char gender = 'M';              // single character for gender
        boolean isPassed = true;        // pass/fail status

        // Displaying student summary
        System.out.println("===== Student Summary Slip =====");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + marks);
        System.out.println("Gender     : " + gender);
        System.out.println("Status     : " + (isPassed ? "Pass" : "Fail"));
    }
}

