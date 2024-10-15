import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many subject:" );
        int numberOfSubjects = scanner.nextInt(); 
        
        double total = 0;
        
        for (int i = 1; i <= numberOfSubjects; i++) { 
            System.out.print("Enter grade of subject " + i + ": ");
            double grade = scanner.nextDouble();
            total += grade;
        }
        
        double average = total / numberOfSubjects; 
        String letterGrade = calculateLetterGrade(average); 
        
        System.out.printf("Average grade: %.2f\n", average); 
        System.out.println("Letter grade: " + letterGrade);
        
        scanner.close(); 
    }
    
    public static String calculateLetterGrade(double average) { 
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
