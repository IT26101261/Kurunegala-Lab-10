import java.util.Scanner;

public class IT26101261Lab10Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the mark (0 - 100): ");
        int userMark = input.nextInt();
        
        
        assert (userMark >= 0 && userMark <= 100) : "Invalid Mark";
        System.out.println("Mark is Validated");
        
      
        char finalGrade = calculateGrade(userMark);
        
        
        if (userMark >= 75) {
            assert (finalGrade == 'A') : "Incorrect Grade Assigned";
        } else if (userMark >= 60 && userMark <= 74) {
            assert (finalGrade == 'B') : "Incorrect Grade Assigned";
        } else if (userMark >= 50 && userMark <= 59) {
            assert (finalGrade == 'C') : "Incorrect Grade Assigned";
        } else if (userMark >= 40 && userMark <= 49) {
            assert (finalGrade == 'D') : "Incorrect Grade Assigned";
        } else {
            assert (finalGrade == 'F') : "Incorrect Grade Assigned";
        }
        
       
        System.out.println("The Grade for the Entered Mark is: " + finalGrade);
        
        input.close();
    }

    
    public static char calculateGrade(int mark) {
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
